package EjerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPersonas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        boolean compwhile = false;
        String ruta = "Documentos/personas.dat";

        while (!compwhile) {
            System.out.println("AÑADIR PERSONA -> 1");
            System.out.println("FINALIZAR LISTA Y SERIALIZAR --> 2");
            int elecusu = sc.nextInt();

            switch (elecusu) {
                case 1: {
                    System.out.println("INTRODUCE LA EDAD");
                    int edadusu = sc.nextInt();
                    System.out.println("INTRODUCE EL NOMBRE");
                    String nombreusu = sc.next();
                    Persona personausu = new Persona(nombreusu, edadusu);
                    lista.add(personausu);
                    break;
                }
                case 2: {
                    try (ObjectOutputStream prueba = new ObjectOutputStream(new FileOutputStream(ruta))) {
                       prueba.writeObject(lista);
                    }
                    System.out.println("PERSONAS SERIALIZADAS CON ÉXITO");
                    compwhile = true;
                    break;
                }
                default: System.out.println("ELECCIÓN NO VÁLIDA");
            }
        }
    }
}