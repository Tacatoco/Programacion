package EjerciciosFicheros;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainFunko {
    public static void main(String[] args) {
        String rutafunko = "Documentos/funkos.csv";  // Ruta del archivo CSV
        HashMap<String ,Funko> funkos = new HashMap<>();

        try {
            List<String> lineas = Files.readAllLines(Path.of(rutafunko));  // Lee las líneas del archivo
            // Recorre las líneas, pero no hace nada con ellas aquí
            for (int i = 1; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                String[] datos = linea.split(",");
                String codigo = datos[0];
                String nombre = datos[1];
                String modelo = datos[2];
                double precio = Double.parseDouble(datos[3]);
                String fecha = datos[4];
                Funko funkoprueba = new Funko(codigo,precio,modelo,nombre,fecha);
                funkos.put(codigo,funkoprueba);
            }
            anadirfunko(funkos, rutafunko);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // funcion para añadir un Funko al archivo
    public static void anadirfunko(HashMap<String, Funko> funkos, String rutafunko) {
        Scanner sc = new Scanner(System.in);
        // Solicita los datos del nuevo Funko
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
        // Crea el objeto Funko con los datos introducidos
        Funko funkousu = new Funko(codigousu, preciousu, modelousu, nombreusu, fechausu);
        String valores = codigousu + "," + nombreusu + "," + modelousu + "," + preciousu + "," + fechausu;  // Formatea los datos a CSV
        // Añade el nuevo Funko a la lista
        funkos.put(codigousu, funkousu);
        // Abre el archivo en modo append (para no sobrescribirlo) y escribe el nuevo Funko
        try (FileWriter escribirfunko = new FileWriter(Path.of(rutafunko).toFile(), true)) {
            escribirfunko.write("\n" + valores);  // Escribe la nueva línea con el Funko \n es para salto de linea antes de escribir
            System.out.println("FUNKO AÑADIDO CON ÉXITO");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void borrarfunko(List<String> lineas, List<Funko> funkos, String rutafunko){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE FUNKO QUIERES BORRAR? INTRODUCE EL CÓDIGO");
        String codeusu = sc.next();

        for (int i = 0; i < lineas.size(); i++) {
        funkos.remove(codeusu)
        }
    }


}
