package src.BUCLES;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        int Numusu;
        int Numrandom = 0;
        int contador = 0;


        System.out.println("LOTERIA  DE NAVIDAD, INGRESA UN NÚMERO ENTRE 0 Y 99999");


        while (contador < 5){

            Scanner scanner = new Scanner(System.in);
            Numusu = scanner.nextInt();
            Random random = new Random();
            Numrandom = random.nextInt(99999);

            if (Numusu == Numrandom){

                System.out.println("HAS GANADO LA LOTERÍA");

                contador++;
            }
            else {

                System.out.println("NO HAS GANADO LA LOTERÍA");

                contador++;
            }

        }


        System.out.println("MALA SUERTE, EL NÚMERO ERA: " + Numrandom);



    }


}
