package EjerciciosFicheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL NOMBRE");
        String nombreusu = sc.next();
        System.out.println("INTRODUCE LA EDAD");
        int edadusu = sc.nextInt();
        Persona Javier = new Persona(nombreusu, edadusu);
        String ruta = "Documentos/persona.dat";

        try(ObjectOutputStream prueba = new ObjectOutputStream(new FileOutputStream(ruta))) {
            prueba.writeObject(Javier);
            System.out.println("OBJETO SERIALIZADO CON EXITO");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
