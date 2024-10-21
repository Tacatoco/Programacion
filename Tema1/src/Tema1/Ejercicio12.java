package Tema1;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

    int Año;

        Scanner Anousu = new Scanner(System.in);

        System.out.println("Introduce un año para saber si es bisiesto");
        Año = Anousu.nextInt();

       if (Año % 4 == 0 && Año % 100 !=0) {

           System.out.println("Es un año bisiesto");

       }

       else {

           System.out.println("No es un año bisiesto");


       }
        Anousu.close();

    }

    }

