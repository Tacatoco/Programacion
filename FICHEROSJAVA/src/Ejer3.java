package EjerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejer3 {
    public static void main(String[] args) throws IOException {

        String ruta = "Documentos/texto.txt";
       try (BufferedReader archivo = (new BufferedReader(new FileReader(ruta)))){
            int contador = 0;
           ArrayList<String> lista= new ArrayList<>();
            String linea;
           while((linea = archivo.readLine()) != null){
            String[] array = linea.split("\\s+");
            for (String palabra : array){
                lista.add(palabra);
            }
           }
           for (String palabros : lista){
               contador++;
           }
           System.out.println("LA CANTIDAD DE PALABRAS ES: " + contador);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
