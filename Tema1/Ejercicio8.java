package Tema1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int Num1, Num2;
        Scanner Numero = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        Num1 = Numero.nextInt();
        System.out.println("Introduce el segundo número");
        Num2 = Numero.nextInt();


        if (Num1 > Num2) {
            System.out.println(Num1 + " es mayor a " + Num2);
        }

        else if (Num2 > Num1){


            System.out.println(Num2 + " es mayor a " + Num1);


        }
            else {

            System.out.println(Num2 + " es igual a " + Num1);


        }

    }


}
