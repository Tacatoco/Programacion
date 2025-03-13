import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String nombres = "Documentos/usa_nombres.txt";
        String apellidos = "Documentos/usa_apellidos.txt";
        ArrayList<String> randoms = new ArrayList<>();
        try (BufferedReader valorusu = new BufferedReader(new FileReader(nombres))) {
            ArrayList<String> lineasarchivo1 = new ArrayList<>();
            String linea;

            while ((linea = valorusu.readLine()) != null) {
                linea = linea.trim();
                lineasarchivo1.add(linea);
            }

            try (BufferedReader valorusu2 = new BufferedReader(new FileReader(apellidos))) {
                ArrayList<String> lineasarchivo2 = new ArrayList<>();
                String linea2;

                while ((linea2 = valorusu2.readLine()) != null) {
                    linea2 = linea2.trim();
                    lineasarchivo2.add(linea2);
                }

                System.out.println("¿CUANTOS NOMBRES QUIERES GENERAR?");
                int cantidadnombres = sc.nextInt();
                System.out.println("¿EN QUE ARCHIVO LOS QUIERES GUARDAR?");
                String archivodestino = sc.next();

                for (int i = 0; i < cantidadnombres; i++) {
                    String nombrecompleto = lineasarchivo1.get(random.nextInt(lineasarchivo1.size() - 1)) + " " + lineasarchivo2.get(random.nextInt(lineasarchivo2.size() - 1));
                    randoms.add(nombrecompleto);
                }

                try (BufferedWriter escribirarchivo = new BufferedWriter(new FileWriter(archivodestino))) {
                    for (String lineausu : randoms) {
                        escribirarchivo.write(lineausu);
                        escribirarchivo.newLine();
                    }
                    System.out.println("El contenido ha sido guardado correctamente.");
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}