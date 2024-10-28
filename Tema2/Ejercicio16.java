package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        double euros, dolares;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la Letra D para pasar de euros a dolares y la E para pasar de dolares a euros");
        char letraintro = scanner.next().charAt(0);


        if (letraintro != 'D' && letraintro != 'E') {

            System.out.println("INTRODUCE UNA LETRA VÁLIDA");

        }
        else {

            switch (letraintro) {

                case 'D':
                    System.out.println("INTRODUCE LA CANTIDAD DE EUROS PARA PASARLA A DOLARES ");
                    euros = scanner.nextDouble();
                    dolares = euros * 1.08;
                    System.out.println("CONVERSION DE EUROS A DOLARES: " + dolares);

                    break;

                case 'E':
                    System.out.println("INTRODUCE LA CANTIDAD DE DOLARES PARA PASARLA A EUROS");
                    dolares = scanner.nextDouble();
                    euros = dolares * 0.92;
                    System.out.println("CONVERSION DE DOLARES A EUROS: " + euros);

                    break;

            }
        }
    }
}