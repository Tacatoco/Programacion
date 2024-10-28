package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora");
        int hora = scanner.nextInt();

        System.out.println("Introduce los minutos");
        int minutos = scanner.nextInt();

        System.out.println("Introduce los segundos");
        int segundos = scanner.nextInt();

        segundos = segundos + 1;

        if (segundos > 60 || minutos > 60 || hora > 24) {

            System.out.println("Introduce una cantidad válida horas, minutos y segundos");
        }
         if (segundos == 60) {

             segundos = 0;
             minutos = minutos + 1;

         }

         if (minutos == 60) {

             minutos = 0;
             hora = hora + 1;

         }

         if (hora == 24) {
             hora = 00;

         }

        System.out.println (hora + ":" + minutos + ":" + segundos);




    }
}
