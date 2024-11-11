package src.BUCLES;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int contador = 0;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO PARA SABER SI ES PRIMO");

        int Numusu = scanner.nextInt();

        for (i = 1; i<=Numusu; i++) {

            if (Numusu % i == 0) {

                contador++;


            }

            }
        if (contador <= 2) {

            System.out.println("ES PRIMO");
        } else {

            System.out.println("NO ES PRIMO");



        }


    }

}


