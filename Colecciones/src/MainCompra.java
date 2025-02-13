import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class MainCompra {
    public static void main(String[] args) {
        ListaCompra lista = new ListaCompra();
        Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;

        while (!compwhile){
            System.out.println("INTRODUZCA PRODUCTOS A LA LISTA DE LA COMPRA");
            System.out.println("SALIR --> SALIR");
            String producto = scanner.next();
            if (producto.equals("SALIR")){
                compwhile = true;
            }
            else lista.anadirproductos(producto);
        }
        lista.mostrarlista();
    }
}

