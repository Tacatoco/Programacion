package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("Introduce el primer número");
        Scanner scanner = new Scanner(System.in);

        double Num1 = scanner.nextDouble();


        System.out.println("Introduce el segundo número");
        Scanner scanner1 = new Scanner(System.in);

        double Num2 = scanner1.nextDouble();


        if (Num1 > Num2) {

            System.out.println("La resta del más grande al más pequeño es: " + (Num1 - Num2));
        }

        else {
            System.out.println("La resta del más grande al más pequeño es: " + (Num2 - Num1));
            }
        }
    }

