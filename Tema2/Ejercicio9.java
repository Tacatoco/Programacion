package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de dolares para convertirla a euros");

        double dolares = scanner.nextDouble();

        double euro = (dolares * 0.93);

        System.out.println("La conversion de dolares a euros resulta en: " + euro);


    }
}