package src.BUCLES;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        int Contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        int Numusu;
        Numusu = scanner.nextInt();
        Numusu = Math.abs(Numusu);

        if (Numusu == 0) {

            System.out.println("Tiene un dígito");

        }

        else {

            while (Numusu > 0) {

                Numusu = Numusu / 10;

                Contador = Contador + 1;



            }

            System.out.println("El numero de dígitos es  " + Contador);

        }





    }



}
