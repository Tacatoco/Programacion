package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de euros para convertirla a dolares");

        double EuroUsu = scanner.nextDouble();

        double dolares = (EuroUsu * 1.08);


        System.out.println("La conversion de euros a dólares resulta en: " + dolares);


    }
}
