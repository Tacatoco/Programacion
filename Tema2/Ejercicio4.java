package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");

        double num1 = scanner.nextDouble();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce el segundo numero");

        double num2 = scanner1.nextDouble();


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce el tercer numero");

        double num3 = scanner2.nextDouble();


    if (num1 > num2 && num1 > num3) {

        System.out.println("El numero de mayor valor es " + num1);

    }

        else if (num2 > num1 && num2 > num3) {

            System.out.println("El numero de mayor valor es " + num2);

        }


    else if (num3 > num1 && num3 > num2) {

        System.out.println("El numero de mayor valor es " + num3);

    }


scanner.close();
scanner1.close();
scanner2.close();



    }
}
