package src.BUCLES;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int A;
        int B;
        int NumeroImpar = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE EL PRIMER NUMERO ENTERO");
        A = scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("INTRODUCE EL SEGUNDO NUMERO ENTERO");
        B = scanner1.nextInt();


        NumeroImpar = B;

        if (B>A){
            for (int i = A; i <= B; i++) {
                if (i%2!=0){
                    System.out.println(i);
                }
            }

        }



}

        }


