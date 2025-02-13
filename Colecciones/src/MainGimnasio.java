import java.util.Scanner;

public class MainGimnasio {
    public static void main(String[] args) {
        principal();
    }










    public static void principal (){
        Scanner scanner = new Scanner(System.in);
        Gimnasio lista = new Gimnasio();
        boolean compwhile = false;

        while (!compwhile){
            System.out.println("AÑADIR USUARIO --> 1");
            System.out.println("ELIMINAR USUARIO --> 2");
            System.out.println("MODIFICAR USUARIO --> 3");
            System.out.println("MOSTRAR DATOS DE USUARIO --> 4");
            System.out.println("SALIR --> 5");
            int elecusu = scanner.nextInt();

            switch (elecusu){
                case 1:{
                    System.out.println("DNI...");
                    String DNIusu = scanner.next();
                    System.out.println("NOMBRE...");
                    String nombreusu = scanner.next();
                    System.out.println("EDAD...");
                    int edadusu = scanner.nextInt();
                    lista.anadirusuarios(DNIusu, nombreusu, edadusu);
                    break;
                }

                case 2:{
                    System.out.println("INTRODUCE EL DNI PARA DAR DE BAJA AL USUARIO CORRESPONDIENTE");
                    String DNIusu = scanner.next();
                    lista.dardebajausuarios(DNIusu);
                    break;
                }

                case 3:{
                    System.out.println("INTRODUCE EL DNI PARA MODIFICAR DATOS DEL USUARIO CORRESPONDIENTE");
                    String DNIusu = scanner.next();
                    lista.modificarusuario(DNIusu);
                    break;
                }

                case 4:{
                    System.out.println("INTRODUCE EL DNI PARA MOSTRAR DATOS DEL USUARIOO CORRESPONDIENTE");
                    String DNIusu = scanner.next();
                    lista.mostrardatosusu(DNIusu);
                    break;
                }

                case 5:{
                    compwhile = true;
                    System.out.println("ADIOS...");
                    break;
                }
                default:{
                    System.out.println("OPCION NO VÁLIDA");
                }


            }


        }
    }
}
