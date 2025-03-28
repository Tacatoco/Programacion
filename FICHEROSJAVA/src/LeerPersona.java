package EjerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class LeerPersona{
    public static void main(String[] args) {
        String ruta = "Documentos/persona.dat";
        try(ObjectInputStream prueba = new ObjectInputStream(new FileInputStream(ruta))) {
            Persona persona = (Persona) prueba.readObject();
            System.out.println(persona);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
