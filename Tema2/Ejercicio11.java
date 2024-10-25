package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si son consecutivos");
        int NumUsu1 = scanner.nextInt();


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si son consecutivos");
        int NumUsu2 = scanner2.nextInt();


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para determinar si son consecutivos");
        int NumUsu3 = scanner3.nextInt();


        if (NumUsu1 - NumUsu3 == -2 && NumUsu1 - NumUsu2 == -1) {

            System.out.println("Son consecutivos");
        }

        else {

            System.out.println("No son consecutivos");


        }

        }

        }

