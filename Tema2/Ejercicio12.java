package Tema2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduce tres números para ordenarlos de mayor a menor:");

        Scanner scanner = new Scanner(System.in);
        double Numusu1 = scanner.nextDouble();
        double Numusu2 = scanner.nextDouble();
        double Numusu3 = scanner.nextDouble();

        double mayor, medio, menor;

        if (Numusu1 >= Numusu2 && Numusu1 >= Numusu3) {
            mayor = Numusu1;
            if (Numusu2 >= Numusu3) {
                medio = Numusu2;
                menor = Numusu3;
            } else {
                medio = Numusu3;
                menor = Numusu2;
            }
        } else if (Numusu2 >= Numusu1 && Numusu2 >= Numusu3) {
            mayor = Numusu2;
            if (Numusu1 >= Numusu3) {
                medio = Numusu1;
                menor = Numusu3;
            } else {
                medio = Numusu3;
                menor = Numusu1;
            }
        } else {
            mayor = Numusu3;
            if (Numusu1 >= Numusu2) {
                medio = Numusu1;
                menor = Numusu2;
            } else {
                medio = Numusu2;
                menor = Numusu1;
            }
        }

        System.out.println("El orden es: " + mayor + ", " + medio + ", " + menor);
        scanner.close();
    }
}