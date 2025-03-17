package EjerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE NÚMERO QUIERES INTRODUCIR");
        int numusu = sc.nextInt();

        String rutapi = "./Documentos/pi-million.txt";

        try (BufferedReader archivo = new BufferedReader(new FileReader(rutapi))) {
            ArrayList<Integer> numerostring = new ArrayList<>();
            ArrayList<Integer> numerousu = new ArrayList<>();
            int caracter, caracter2;

            while ((caracter = archivo.read()) != -1) {
                numerostring.add(caracter);
            }

            for (int i = 0; i < String.valueOf(numusu).length(); i++) {
            numerousu.add((int) String.valueOf(numusu).charAt(i));



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }






    }
}