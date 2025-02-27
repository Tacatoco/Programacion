import jdk.swing.interop.SwingInterOpUtils;

import javax.print.DocFlavor;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


//DESCONOZCO POR QUE NO ME HA DEJADO IMPLEMENTAR EL SWITCH EN UNA FUNCION, POR LO TANTO NO HE PODIDO REALIZAR EL PROGRAMA SIGUIENDO LOS PARADIGMAS DE LA PROGRAMACIÓN MODULAR//


public class GestordeLibros {
    public static void main(String[] args) {
        Map<String, Libro> listalibros = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean compwhile = false;

        while (!compwhile) {
            opciones();
            int elecusu = sc.nextInt();

            switch (elecusu) {
                case 1: {
                    System.out.println("QUE ISBN TIENE?");
                    String ISBNusu = sc.next();
                    System.out.println("QUE NOMBRE TIENE?");
                    String nombreusu = sc.next();
                    System.out.println("QUE AUTOR LO ESCRIBIÓ?");
                    String autorusu = sc.next();
                    System.out.println("CUANTAS PÁGINAS TIENE?");
                    int paginasusu = sc.nextInt();
                    System.out.println("DE QUE GÉNERO ES?");
                    String generousu = sc.next();
                    System.out.println("QUE FORMATO TIENE? DURA, BLANDA O BOLSILLO");
                    String formatousu = sc.next().trim().toUpperCase();
                    Libro librousu = new Libro(ISBNusu, nombreusu, autorusu, paginasusu, generousu, formatousu);
                    listalibros.put(ISBNusu, librousu);
                    break;
                }

                case 2: {
                    System.out.println("INTRODUCE EL ISBN PARA SABER INFORMACION DEL LIBRO");
                    String isbnusu = sc.next();

                    for (Libro librito : listalibros.values()) {
                        if (listalibros.containsKey(isbnusu)) {
                            System.out.println("NOMBRE: "+librito.getNombre());
                            System.out.println("AUTOR: " + librito.getAutor());
                            System.out.println("FORMATO: " +librito.getFormato());
                            System.out.println("GÉNERO: " +librito.getGenero());
                            System.out.println("NUMERO DE PÁGINAS: " +librito.getNumeropaginas());
                            System.out.println("PESO DEL LIBRO: " + librito.pesolibro());
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("INTRODUCE EL ISBN PARA MODIFICAR EL GENERO DEL LIBRO");
                    String isbnusu = sc.next();
                    for (Libro librito : listalibros.values()) {
                        if (listalibros.containsKey(isbnusu)) {
                            System.out.println("CUAL ES EL NUEVO GENERO");
                            String genusu = sc.next();
                            librito.setGenero(genusu);
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("INTRODUCE UN AUTOR PARA SABER SUS LIBROS");
                    String autorusu = sc.next();
                    for (Libro librito : listalibros.values()) {
                        if (librito.getAutor().equals(autorusu)){
                            System.out.println(librito.getNombre());
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.println("ADIOS...");
                    compwhile = true;
                    break;
                }

            }

        }
    }
        public static void opciones () {
            System.out.println("1 --> INTRODUCIR LIBRO");
            System.out.println("2 --> MOSTRAR INFORMACION DE UN LIBRO POR ISBN");
            System.out.println("3 --> MODIFICAR EL GÉNERO DE UN LIBRO POR ISBN");
            System.out.println("4 --> BUSCAR TODOS LOS LIBROS DE UN AUTOR");
            System.out.println("5 --> SALIR");
        }


}
