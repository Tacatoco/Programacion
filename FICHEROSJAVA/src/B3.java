import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE ARCHIVO QUIERES ALMACENAR ALFABETICAMENTE?");
        String lecturausu = sc.next();
        System.out.println();
        System.out.println("¿EN QUE ARCHIVO QUIERES GUARDAR EL CONTENIDO?");
        String escriturausu = sc.next();

        try (BufferedReader valorusu = new BufferedReader(new FileReader(lecturausu))) {
            ArrayList<String> lineasarchivo = new ArrayList<>();
            String linea;

            while ((linea = valorusu.readLine()) != null) {
                linea = linea.trim();
                lineasarchivo.add(linea);
            }

            Collections.sort(lineasarchivo);

            try (BufferedWriter escribirarchivo = new BufferedWriter(new FileWriter(escriturausu))) {
                for (String lineaOrdenada : lineasarchivo) {
                    escribirarchivo.write(lineaOrdenada);
                    escribirarchivo.newLine();
                }
                System.out.println("El contenido ha sido ordenado y guardado correctamente.");
            } catch (IOException e) {
                System.out.println("Error al escribir el archivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
