
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listapalabras = new ArrayList<>();
        Map<Character, List<String>> lista = new HashMap<>();
        for (char letra = 'a'; letra <= 'z'; letra++) {
            lista.put(letra, new ArrayList<>());
        }
        File carpeta = new File("./Diccionario");

        if (!carpeta.exists()) {
            carpeta.mkdir();
        } else System.out.println("LA CARPETA YA ESTA CREADA");

        String rutadic = "Documentos/diccionario.txt";
        try (BufferedReader archivos = new BufferedReader(new FileReader(rutadic))) {
            ArrayList<String> linearchivo = new ArrayList<>();
            String linea;
            while ((linea = archivos.readLine()) != null) {
                linea = linea.trim();
                linearchivo.add(linea);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            for (char letra1 = 'a'; letra1 <= 'z'; letra1++) {
                String nombrearchivo = letra1 + ".txt";
                File archivo = new File(carpeta + "/" + nombrearchivo);
                if (archivo.createNewFile()) {
                    System.out.println(nombrearchivo + " ha sido creado");
                }
            }
        }

        String rutadiccionario = "C:\\Users\\Usuario\\IdeaProjects\\FICHEROSJAVA\\Documentos\\diccionario.txt";

        try (BufferedReader lecturapalabras = new BufferedReader(new FileReader(rutadiccionario))) {
            ArrayList<String> palabros = new ArrayList<>();
            String linea;
            while ((linea = lecturapalabras.readLine()) != null) {
                linea = linea.trim();
                palabros.add(linea);
            }
            for (String palabro : palabros) {
                char caracter = palabro.charAt(0);
                if (lista.containsKey(caracter)) {
                    lista.get(caracter).add(palabro);
                    System.out.println(palabro);
                }
            }
        }
        for (char letra1 = 'a'; letra1 <= 'z'; letra1++) {
            String archivodestino = "Diccionario\\" + letra1 + ".txt";
            try (BufferedWriter palabraescrita = new BufferedWriter(new FileWriter(archivodestino))) {
                for (String palabra : lista.get(letra1)) {
                    palabraescrita.write(palabra);
                    palabraescrita.newLine();
                }
            }
        }
    }
}
