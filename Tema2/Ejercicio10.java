package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si estan ordenados de menor a mayor");
        double NumUsu1 = scanner.nextDouble();


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si estan ordenados de menor a mayor");
        double NumUsu2 = scanner2.nextDouble();


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si estan ordenados de menor a mayor");
        double NumUsu3 = scanner3.nextDouble();


        if (NumUsu1 < NumUsu2 && NumUsu2 < NumUsu3) {

            System.out.println("Los numeros introducidos estan ordenados de menor a mayor");
        }
        else
            {
                System.out.println("Los numeros introducidos no estan ordenados de menor a mayor");

            }

        }


    }



