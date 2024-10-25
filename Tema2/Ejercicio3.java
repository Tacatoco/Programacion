package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la base del triangulo");

        double base = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe la altura del triangulo");

        double altura = scanner1.nextDouble();

        double superficie = (base * altura) / 2;

        System.out.println("La superficie es " + superficie);

        scanner.close();
        scanner1.close();

    }

    }
