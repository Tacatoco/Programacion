
package COLECCIONES;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class MainCompra {
    public static void main(String[] args) {
        ListaCompra lista = new ListaCompra();
        Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;
        int elecusu = 0;

        while (!compwhile){
            System.out.println("1--> INTRODUCIR PRODUCTOS A LA LISTA DE LA COMPRA");
            System.out.println("2--> VER LISTA DE LA COMPRA");
            System.out.println("3--> INTRODUCIR PRODUCTOS EN EL CARRITO");
            System.out.println("4--> VER QUE ME QUEDA EN LA LISTA DE LA COMPRA");
            System.out.println("5--> MOSTRAR CONTENIDO DEL CARRO");
            System.out.println("6--> SALIR");
            System.out.println();
            elecusu = scanner.nextInt();
            switch (elecusu){
                case 1:{
                    System.out.println("QUE PRODUCTO AÑADES A LA LISTA DE LA COMPRA...");
                    String producto = scanner.next();
                    lista.anadirproductos(producto);
                    break;
                }

                case 2:{
                    lista.mostrarlista();
                    break;
                }

                case 3:{
                    lista.anadirproductoscarro();
                    break;
                }

                case 4:{
                    lista.listarestante();
                    break;
                }
                case 5:{
                    lista.mostrarcarro();
                    break;
                }
                case 6:{
                    System.out.println("ADIOS");
                    compwhile = true;
                    break;
                }


            }

        }

    }
}
