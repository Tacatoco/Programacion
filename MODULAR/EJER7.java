package MODULAR;

import java.util.Scanner;

public class EJER7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean salirbucle = false;
        int numerocomp = 3;

        System.out.println("PARA INTRODUCIR UN NUMERO PULSA 1, PARA SALIR PULSA 0");
        while (!salirbucle) {
            numerocomp = scanner.nextInt();
            if (numerocomp == 0) {
                System.out.println();
                salirbucle = true;
            } else if (numerocomp == 1) {
                if (esprimo(numero)) {
                    System.out.println("ES PRIMO");
                    System.out.println();
                    System.out.println("INTRODUCE 1 PARA SEGUIR 0 PARA SALIR");
                } else {
                    System.out.println("NO ES PRIMO");
                    System.out.println();
                    System.out.println("INTRODUCE 1 PARA SEGUIR 0 PARA SALIR");

                }

            }

        }


    }

    public static boolean esprimo(int numero) {
        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


}








