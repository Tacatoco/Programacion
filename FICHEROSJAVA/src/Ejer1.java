package EjerciciosFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = "Documentos/usuarios.txt";
        System.out.println("INTRODUCE EL NOMBRE");
        String nombreusu = sc.next();

        System.out.println("INTRODUCE LA EDAD");
        String edadusu = sc.next();

       try (BufferedWriter archivo = new BufferedWriter(new FileWriter(ruta))){
        archivo.write("Nombre:" + nombreusu);
        archivo.newLine();
        archivo.write("Edad:" + edadusu);
        }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       


}

}
