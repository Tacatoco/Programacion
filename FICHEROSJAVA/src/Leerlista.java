package EjerciciosFicheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Leerlista {
    public static void main(String[] args) {
        String ruta = "Documentos/personas.dat";
        try(ObjectInputStream prueba = new ObjectInputStream(new FileInputStream(ruta))) {
            for (Persona persona1 :(ArrayList<Persona>) prueba.readObject()) {
                System.out.println(persona1);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
