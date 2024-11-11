package src.BUCLES;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {


        int Numrandom = 0;
        int Valorusu = 1;


        System.out.println("ADIVINA UN NUMERO DEL 1 AL 100, EL PROGRAMA TE DARÁ PISTAS");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Numrandom = random.nextInt(100);


        do {
            Valorusu = scanner.nextInt();

         if (Valorusu > Numrandom){

             System.out.println("EL NUMERO ES MENOR");

         }

         else {

             System.out.println("EL NUMERO ES MAYOR");

         }

        }
        while (Valorusu != Numrandom) ;


        System.out.println("ACERTASTE");



    }
        }



