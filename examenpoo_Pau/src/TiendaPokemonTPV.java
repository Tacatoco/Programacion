import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TiendaPokemonTPV {
    public static void main(String[] args) {
        LinkedHashSet<Articulo> ticket = new LinkedHashSet<>();
        switchprincipal(ticket);


    }

    public static void switchprincipal(LinkedHashSet<Articulo> ticket) {
        Scanner sc = new Scanner(System.in);
        boolean compwhile = false;
        boolean usuarray = false;

        while (!compwhile) {
            mostraropciones();
            int elecusu = sc.nextInt();

            switch (elecusu) {
                case 1: {
                    boolean esgratis = false;
                    System.out.println("QUE NOMBRE RECIBE LA POCION?");
                    String nombrepoti = sc.next().toUpperCase().trim();
                    System.out.println("ES GRATIS? SI O NO");
                    String booleanusu = sc.next();
                    if (booleanusu.equals("SI")) {
                        esgratis = true;
                    }
                    System.out.println("DE QUE NIVEL ES LA POCIÓN?");
                    int nivelusu = sc.nextInt();
                    ArrayList efectos = new ArrayList<>();
                    while (!usuarray) {
                        System.out.println("AÑADIR EFECTO DE LA POCION --> 1  ACABAR --> 2?");
                        int pocioneleccion = sc.nextInt();

                        if (pocioneleccion == 1) {
                            System.out.println("QUE EFECTO HACE LA POCION?");
                            String efectopoti = sc.next();
                            efectos.add(efectopoti);
                        } else if (pocioneleccion == 2) {
                            System.out.println("DE ACUERDO, SALIENDO...");
                            usuarray = true;
                        }
                    }
                    Pocion pocionusu = new Pocion(nombrepoti, esgratis, nivelusu, efectos);
                    ticket.add(pocionusu);
                    break;
                }

                case 2: {
                    boolean esgratis = false;
                    System.out.println("QUE POKEBOLA QUIERES AÑADIR?");
                    String nombrepoke = sc.next().toUpperCase().trim();
                    System.out.println("ES GRATIS? SI O NO");
                    String booleanusu = sc.next().toUpperCase().trim();
                    if (booleanusu.equals("SI")) {
                        esgratis = true;
                    }
                    System.out.println("DE QUE TIPO ES LA POKEBOLA:");
                    System.out.println(" POKEBALL, GREATBALL, ULTRABALL");
                    String tipopoke = sc.next().toUpperCase().trim();
                    Pokebola pokebolusu = new Pokebola(nombrepoke, esgratis, tipopoke);
                    ticket.add(pokebolusu);
                    break;
                }

                case 3: {
                    boolean esgratis = false;
                    System.out.println("QUE NOMBRE RECIBE EL ACCESORIO?");
                    String nombreacce = sc.next().toUpperCase().trim();
                    System.out.println("ES GRATIS? SI O NO, ESPECIFICA EL DINERO SI NO ES GRATIS");
                    String booleanusu = sc.next();
                    if (booleanusu.equals("SI")) {
                        esgratis = true;
                    }
                    Accesorio accesoriousu = new Accesorio(nombreacce, esgratis);
                    ticket.add(accesoriousu);
                    break;
                }

                case 4: {
                    System.out.println("QUE ARTICULO DEL TICKET QUIERES BORRAR PON EL NUMERO DE LA POSICION?");
                    for (Articulo prueba : ticket) {
                        System.out.println(prueba.getNombre());
                    }
                    int elecusuticket = sc.nextInt();

                    try {
                        ticket.remove(elecusuticket);
                        System.out.println("BORRANDO...");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 5: {
                    System.out.println("MOSTRANDO TODOS LOS ARTICULOS DEL TICKET...");
                    for (Articulo prueba : ticket) {
                        if (prueba instanceof Pokebola) {
                            System.out.println(prueba.getNombre());
                            System.out.println(((Pokebola) prueba).tipopokebola);
                            if (prueba.tipoarticulo().equals("POKEBALL")) {
                                prueba.setPrecioart(2);
                            } else if (prueba.tipoarticulo().equals("GREATBALL")) {
                                prueba.setPrecioart(5);
                            } else if (prueba.tipoarticulo().equals("ULTRABALL")) {
                                prueba.setPrecioart(10);
                            }
                            System.out.println("PRECIO: " + prueba.getPrecioart());
                            System.out.println(prueba.tipoarticulo());
                            System.out.println(((Pokebola) prueba).tipopokebola);
                        }

                        if (prueba instanceof Pocion) {
                            System.out.println(prueba.getNombre());
                            System.out.println(prueba.tipoarticulo());
                            if (prueba.isGratis()){
                                System.out.println("ES GRATIS");
                            }
                            else prueba.setPrecioart(5 * ((Pocion) prueba).getNivel());
                            System.out.println(prueba.getPrecioart());
                            System.out.println(((Pocion) prueba).getEfectos());
                        }

                        if (prueba instanceof Accesorio){
                            System.out.println(prueba.getNombre());
                            if (prueba.isGratis()){
                                System.out.println("ES GRATIS");
                            }
                            else System.out.println(prueba.getPrecioart());
                        }
                    }
                    break;
                }



                case 6: {
                    int sumatotal = 0;
                    for (Articulo prueba1 : ticket) {
                        sumatotal += prueba1.getPrecioart();
                    }
                    System.out.println("EL IMPORTE TOTAL DEL TICKET ES: " + sumatotal);
                    break;
                }

                case 7: {
                    compwhile = true;
                    break;

                }
            }
        }


    }

    public static void mostraropciones() {
        System.out.println("1 --> AÑADIR POCIÓN AL TICKET");
        System.out.println("2 --> AÑADIR POKEBOLA AL TICKET");
        System.out.println("3 --> AÑADIR ACCESORIO AL TICKET");
        System.out.println("4 --> BORRAR ARTICULO DEL TICKET POR ORDEN DE INSERCIÓN");
        System.out.println("5 --> MOSTRAR TODOS LOS ARTICULOS DEL TICKET");
        System.out.println("6 --> MOSTRAR TOTAL");
        System.out.println("7 --> SALIR");
    }

}