package Tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número para determinar si es positivo, negativo o zero.");

        double NumUsu = scanner.nextDouble();

        if (NumUsu == 0) {

            System.out.println("El número introducido es 0");

        }else if (NumUsu > 0){

                System.out.println("El número introducido es positivo");

            }

        else {

                System.out.println("El número introducido es negativo");
            }
        }

    }

