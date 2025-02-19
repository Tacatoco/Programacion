import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    private HashSet<String> productos;
    private HashSet<String> carrito;


    public ListaCompra() {
        productos = new HashSet<>();
        carrito = new HashSet<>();
    }


    public HashSet<String> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<String> productos) {
        this.productos = productos;
    }

    public HashSet<String> getCarrito() {
        return carrito;
    }

    public void setCarrito(HashSet<String> carrito) {
        this.carrito = carrito;
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

    public void anadirproductoscarro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUE PRODUCTO PONES AL CARRITO...");
        String producto = scanner.next();
        producto = producto.toUpperCase();
        switch (carrito) {
            default: {
                if (carrito.add(producto)) {
                    System.out.println("PRODUCTO AÑADIDO");
                    productos.removeAll(carrito);
                    break;
                } else System.out.println("ESTE PRODUCTO YA ESTÁ EN EL CARRITO");
            }
        }
    }

    public void listarestante(){
        for (String product : productos){
            System.out.println("PRODUCTOS QUE QUEDAN EN LA LISTA: " + product);
        }
    }

    public void mostrarcarro(){
        for (String carreto : carrito){
            System.out.println(carreto);
        }
    }


}