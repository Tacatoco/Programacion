package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer2 {
    public static void main(String[] args) throws IOException {
        String ruta = "Documentos/usuarios.txt";
        try (BufferedReader leerarchivo = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = leerarchivo.readLine()) != null)
                System.out.println(linea);
            }
        }
    }

