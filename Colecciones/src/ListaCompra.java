import java.util.HashSet;
import java.util.Scanner;

public class ListaCompra {
    private HashSet<String> productos;


    public ListaCompra() {
        productos = new HashSet<>();
    }

    public HashSet<String> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<String> productos) {
        this.productos = productos;
    }


    public void anadirproductos(String producto) {
        producto = producto.toUpperCase();
            switch (producto) {
                default: {
                    if (productos.add(producto)) {
                        System.out.println("PRODUCTO AÑADIDO");
                    } else System.out.println("ESTE PRODUCTO YA ESTÁ EN LA LISTA");
                }
            }

    }
        public void mostrarlista(){
            for (String product : productos) {
                System.out.println(" - " + product);
            }
        }
}