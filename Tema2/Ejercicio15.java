package Tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int dias=0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año");
        int anio = scanner.nextInt();

        System.out.println("Introduce el mes");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1,3,5,6,8,10,12:
                dias=31;
                break;

            case 4,7,9,11:
                dias=30;
                break;

            case 2: if ((anio % 4 == 0) && (anio % 100 != 0) || anio % 400 == 0) {

                dias = 29;

            } else {

                dias = 28;

            }
            break;
            default:
                System.out.println("ERROOOOOOOOOOOOOH");

        }


        System.out.println("La cantidad de dias es: " + dias);

    }

    
}
