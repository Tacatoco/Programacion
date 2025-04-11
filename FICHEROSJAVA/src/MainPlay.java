package EjerciciosFicheros.Videojuego;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainPlay implements Serializable {
    public static void main(String[] args) throws IOException, JuegonoEncontradoException {
        ArrayList<Videojuego> listajuegos = new ArrayList<>();
        String rutabinaria = "Documentos/juegos.dat";
        String rutatexto = "Documentos/juegos.txt";

        Scanner sc = new Scanner(System.in);
        boolean compwhile = false;

        while (!compwhile) {
            opciones();
            int elecusu = sc.nextInt();
            switch (elecusu) {
                case 1:
                    anadirjuego(listajuegos); break;
                case 2:
                    mostrarranking(listajuegos); break;
                case 3:
                    try {
                        eliminarjuego(listajuegos); // Aquí lo envuelves en un try-catch
                    } catch (JuegonoEncontradoException e) {
                        System.out.println("Error: " + e.getMessage());  // Imprime el mensaje de error y continúa
                    }
                    break;
                case 4:
                    guardarbinario(listajuegos, rutabinaria); break;
                case 5:
                    cargarbinario(listajuegos, rutabinaria); break;
                case 6:
                    exportartexto(listajuegos, rutatexto); break;
                case 7:
                    mostrarrankingordenado(listajuegos); break;
                case 8:
                    compwhile = true; break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
        }
    }



    public static void anadirjuego(ArrayList<Videojuego> listajuegos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE TIPO DE VIDEOJUEGO ES: FÍSICO O DIGITAL");
        String elecjuego = sc.next().trim().toUpperCase();

        switch (elecjuego) {
            case "FISICO": {
                System.out.println("TÍTULO:");
                String titulousu = sc.next().toUpperCase().trim();
                System.out.println("PLATAFORMA:");
                String plataformausu = sc.next().toUpperCase().trim();
                System.out.println("NOTA:");
                int notausu = sc.nextInt();
                System.out.println("TIENDA DONDE SE HA COMPRADO EL JUEGO:");
                String tiendausu = sc.next().toUpperCase().trim();
                System.out.println("ESTADO DEL JUEGO:");
                String estado = sc.next().toUpperCase().trim();

                // Aquí llamar a setNota
                try {
                    VideojuegoFisico juegousu = new VideojuegoFisico(titulousu, plataformausu, 0, tiendausu, estado);
                    juegousu.setNota(notausu);  // Estableces la nota a través de setNota()
                    listajuegos.add(juegousu);
                } catch (NotaInvalidaException e) {
                    System.out.println("Error: " + e.getMessage());  // Imprime el mensaje de error
                }
                break;
            }
            case "DIGITAL": {
                System.out.println("TÍTULO:");
                String titulousu = sc.next().toUpperCase().trim();
                System.out.println("PLATAFORMA:");
                String plataformausu = sc.next().toUpperCase().trim();
                System.out.println("NOTA:");
                int notausu = sc.nextInt();
                System.out.println("TIENDA ONLINE DONDE SE HA COMPRADO EL JUEGO:");
                String tiendaonlineusu = sc.next().toUpperCase().trim();
                System.out.println("GB DEL JUEGO:");
                double tamanyogigas = sc.nextDouble();

                // Aquí llamas a setNota explícitamente
                try {
                    VideojuegoDigital juegousu = new VideojuegoDigital(titulousu, plataformausu, 0, tiendaonlineusu, tamanyogigas);
                    juegousu.setNota(notausu);  // Estableces la nota a través de setNota()
                    listajuegos.add(juegousu);
                } catch (NotaInvalidaException e) {
                    System.out.println("Error: " + e.getMessage());  // Imprime el mensaje de error
                }
                break;
            }

            default:
                System.out.println("TIPO DE JUEGO NO VÁLIDO"); break;
        }
    }



    public static void mostrarranking(ArrayList<Videojuego> listajuegos) {
        System.out.println("LISTA DE JUEGOS");
        for (Videojuego a : listajuegos) {
            System.out.println(a.toString());
            System.out.println();
        }
    }

    public static void mostrarrankingordenado(ArrayList<Videojuego> listajuegos) {
        listajuegos.sort(Comparator.comparing(Videojuego::getNota).reversed()); // ordena de mnera descendente los :: son comno una funcion lamda
        System.out.println("LISTA DE JUEGOS ORDENADA POR PUNTUACIÓN");
        for (Videojuego a : listajuegos) {
            System.out.println(a.toString());
            System.out.println();
        }
    }


    public static void eliminarjuego(ArrayList<Videojuego> listajuegos) throws JuegonoEncontradoException, IOException {
        String rutaerror = "Documentos/errores.log";
        String mensaje = "EL JUEGO NO SE HA ENCONTRADO";
        Scanner sc = new Scanner(System.in);
        System.out.println("TITULO DEL JUEGO QUE SE DESEA ELIMINAR");
        String titutlousu = sc.next().toUpperCase().trim();

        boolean encontrado = false;  // Variable para verificar si el juego fue encontrado

        for (int i = 0; i < listajuegos.size(); i++) {
            Videojuego a = listajuegos.get(i);
            if (a.getTitulo().equals(titutlousu)) {
                listajuegos.remove(i);
                encontrado = true;
                i--;
            }
        }

        if (!encontrado) {
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(rutaerror, true))) {
                bf.write(mensaje);
                bf.newLine();  // Añadimos un salto de línea
            }

            throw new JuegonoEncontradoException(mensaje);
        }

        System.out.println("El juego ha sido eliminado correctamente.");
    }


    public static void guardarbinario(ArrayList<Videojuego> listajuegos, String rutabinaria) throws FileNotFoundException {
        try (ObjectOutputStream prueba = new ObjectOutputStream(new FileOutputStream(rutabinaria))) {
            prueba.writeObject(listajuegos);
            System.out.println("JUEGOS SERIALIZADOS CORRECTAMENTE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cargarbinario(ArrayList<Videojuego> listajuegos, String rutabinaria) {
        listajuegos.clear();
        try (ObjectInputStream prueba = new ObjectInputStream((new FileInputStream(rutabinaria)))) {
            ArrayList<Videojuego> listaCargada = (ArrayList<Videojuego>) prueba.readObject();
            listajuegos.addAll(listaCargada);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
        }
    }


    public static void opciones(){
        System.out.println
                ("1. Añadir videojuego (físico o digital).\n" +
                        "2. Mostrar ranking completo.\n" +
                        "3. Eliminar videojuego por título.\n" +
                        "4. Guardar ranking en fichero binario.\n" +
                        "5. Cargar ranking desde fichero.\n" +
                        "6. Exportar ranking a texto.\n" +
                        "7. Mostrar ordenado.\n"+
                        "8. SALIR");
    }

    public static void exportartexto(ArrayList<Videojuego> listajuegos, String rutatexto){
        try(FileWriter prueba = new FileWriter(new File(rutatexto)) ) {
            for (Videojuego q : listajuegos){
                prueba.write(q.toString() + System.lineSeparator()); //SYSTEM LINE SEPARATOR ES PARA PONER UN SALTO DE LINEA
            }
            System.out.println("SE HA EXPORTADO CORRECTAMENTE");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
