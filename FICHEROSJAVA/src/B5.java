package EjerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listapalabras = new ArrayList<>();
        Map<Character, List<String>> lista=new HashMap<>();
        for(char letra='a';letra<='z';letra++){
            lista.put(letra,new ArrayList<>());
        }
        File carpeta = new File("../Diccionario");

        if (!carpeta.exists()){
            carpeta.mkdir();
        }
        else System.out.println("LA CARPETA YA ESTA CREADA");


        String rutadic = "Documentos/diccionario.txt";
        try (BufferedReader archivos = new BufferedReader(new FileReader(rutadic))){
        ArrayList<String> linearchivo = new ArrayList<>();
        String linea;
        while((linea = archivos.readLine()) != null){
        linea.trim();
        linearchivo.add(linea);
        }



        }



        for (int i = 0; i < abecedario.size(); i++) {
            String nombrearchivo = abecedario.get(i) + ".txt";
            File archivo = new File(carpeta+"/"+nombrearchivo);
            if (archivo.createNewFile()){
                System.out.println("Archivo creado");
            }
        }








    }
}
