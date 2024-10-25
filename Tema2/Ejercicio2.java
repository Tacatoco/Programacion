package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la base del rectangulo");

        double base = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe la altura del rectangulo");

        double altura = scanner1.nextDouble();


double perimetro = (base * 2) + (altura * 2);
double superficie = (base * altura);


        System.out.println("El perimetro es " + perimetro);
        System.out.println("La superficie es " + superficie);


scanner.close();
scanner1.close();

    }
}