package EjerciciosFicheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MainFunko {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutafunko = "Documentos/funkos.csv";  // Ruta del archivo CSV
        List<Funko> funkos = new ArrayList<>();

        loadFunkos(funkos, rutafunko);

        System.out.println("AÑADIR FUNKO --> 1");
        System.out.println("ELIMINAR FUNKOS --> 2");
        System.out.println("MOSTRAR FUNKO MÁS CARO --> 3");
        System.out.println("MOSTRAR LA MEDIA DE PRECIOS DE LOS FUNKOS --> 4");
        System.out.println("MOSTRAR TODOS LOS FUNKOS --> 5");
        System.out.println("MOSTRAR FUNKOS AGRUPADOS POR MODELOS --> 6");
        int elecusu = sc.nextInt();

        switch (elecusu) {
            case 1:
                anadirfunko(funkos, rutafunko);
                break;
            case 2:
                borrarfunko(funkos, rutafunko);
                break;
            case 3:
                mostrarmascaro(funkos, rutafunko);
                break;
            case 4:
                mediapreciosfunkos(funkos, rutafunko);
                break;
            case 5:
                mostrartodosfunkos(funkos, rutafunko);
                break;
            case 6:
                mostrarpormodelos(funkos, rutafunko);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void anadirfunko(List<Funko> funkos, String rutafunko) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL CÓDIGO");
        String codigousu = sc.next();
        System.out.println("INTRODUCE EL NOMBRE");
        String nombreusu = sc.next();
        System.out.println("INTRODUCE EL MODELO");
        String modelousu = sc.next();
        System.out.println("INTRODUCE EL PRECIO");
        double preciousu = sc.nextDouble();
        System.out.println("INTRODUCE LA FECHA DE LANZAMIENTO");
        String fechausu = sc.next();

        Funko funkousu = new Funko(codigousu, preciousu, modelousu, nombreusu, fechausu);
        funkos.add(funkousu);

        try (FileWriter escribirfunko = new FileWriter(Path.of(rutafunko).toFile(), true)) {
            escribirfunko.write("\n" + codigousu + "," + nombreusu + "," + modelousu + "," + preciousu + "," + fechausu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void borrarfunko(List<Funko> funkos, String rutafunko) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL CÓDIGO DEL FUNKO A ELIMINAR:");
        String codigo = sc.next();

        funkos.removeIf(f -> f.getCod().equals(codigo));
        savefunkos(funkos, rutafunko);
    }

    public static void mostrarmascaro(List<Funko> funkos, String rutafunko) {
        loadFunkos(funkos, rutafunko);
        double preciofunko = 0;
        Funko funkoMasCaro = null;

        for (Funko funko : funkos) {
            if (funko.getPrecio() > preciofunko) {
                preciofunko = funko.getPrecio();
                funkoMasCaro = funko;
            }
        }

        if (funkoMasCaro != null) {
            System.out.println("EL FUNKO MÁS CARO ES EL " + funkoMasCaro);
        }
    }

    public static void mediapreciosfunkos(List<Funko> funkos, String rutafunko) {
        loadFunkos(funkos, rutafunko);
        double mediaprecio = 0;

        for (Funko funko : funkos) {
            mediaprecio += funko.getPrecio();
        }

        if (!funkos.isEmpty()) {
            System.out.println("LA MEDIA DE PRECIOS DE LOS FUNKOS ES: " + (mediaprecio / funkos.size()));
        } else {
            System.out.println("No hay funkos para calcular la media.");
        }
    }

    public static void mostrartodosfunkos(List<Funko> funkos, String rutafunko) {
        loadFunkos(funkos, rutafunko);
        for (Funko funko : funkos) {
            System.out.println(funko);
        }
    }

    public static void mostrarpormodelos(List<Funko> funkos, String rutafunko) {
        loadFunkos(funkos, rutafunko);

        Map<String, List<Funko>> porModelo = new HashMap<>();

        for (Funko funko : funkos) {
            String modelo = funko.getModelo();

            if (!porModelo.containsKey(modelo)) {
                porModelo.put(modelo, new ArrayList<>());
            }

            porModelo.get(modelo).add(funko); //añadimos a la lista perteneciente a ese modelo el funko
        }

        for (String modelo : porModelo.keySet()) { //muestra todas las claves del hashmap osea los modelos
            System.out.println("MODELO: " + modelo);
            for (Funko f : porModelo.get(modelo)) { //Accede a la lista de Funkos que pertenecen a ese modelo y la recorre uno por uno.
                System.out.println(f);
            }
        }

    }


    public static void loadFunkos(List<Funko> funkos, String rutafunko) {
        funkos.clear(); // Limpiar para evitar duplicados si se llama varias veces
        try {
            List<String> lineas = Files.readAllLines(Path.of(rutafunko));
            for (int i = 1; i < lineas.size(); i++) {
                String[] datos = lineas.get(i).split(",");
                if (datos.length == 5) {
                    String codigo = datos[0];
                    String nombre = datos[1];
                    String modelo = datos[2];
                    double precio = Double.parseDouble(datos[3]);
                    String fecha = datos[4];
                    funkos.add(new Funko(codigo, precio, modelo, nombre, fecha));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void savefunkos(List<Funko> funkos, String rutafunko) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutafunko))) {
            writer.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            writer.newLine();
            for (Funko funko : funkos) {
                writer.write(funko.getCod() + "," + funko.getNombre() + "," + funko.getModelo() + "," + funko.getPrecio() + "," + funko.getFecha_lanzamiento());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al actualizar el archivo.");
        }
    }
}
