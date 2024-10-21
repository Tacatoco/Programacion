package Tema1;

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Introduce un num:");
        Scanner ValorUsu = new Scanner(System.in);

        int cara = ValorUsu.nextInt();

        if (cara < 1 || cara > 6) {
            System.out.println("El numero introducido no es correcto");
        } else {
            System.out.println("El numero introducido es correcto");
            System.out.println("La cara opuesta es " + (7 - cara));
        }

    }

}



