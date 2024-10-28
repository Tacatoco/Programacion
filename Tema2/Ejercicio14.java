package Tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de personas");
        int personas = scanner.nextInt();

        System.out.println("Introduce la cantidad de días");
        int dias = scanner.nextInt();

        double costefin;


        if (personas < 5) {

            costefin = dias * 15;


        }

        else {

            costefin = (dias * 15) * 0.75;

        }


        System.out.println("El precio será: " + costefin);


    }

}
