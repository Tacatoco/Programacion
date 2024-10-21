package Tema1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner ValorUsu = new Scanner(System.in);

        System.out.println("Ingresa un numero");

        double radio = ValorUsu.nextDouble();

        double Area = 3.14 * radio * radio;

        System.out.println("El area del circulo es " + Area);


    }

}