package Tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el lado de un cuadrado");
        double ladousu = scanner.nextDouble();


        double perimetro = ladousu * 4;
        double superficie = Math.pow(ladousu, 2);


        System.out.println("El perimetro del cuadrado es " + perimetro);
        System.out.println("La superficie del cuadrado es " + superficie);


        scanner.close();

    }
}