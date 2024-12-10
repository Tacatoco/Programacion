package MODULAR;

import java.util.Scanner;
public class EJER2 {
    static int age;
    public static void main(String[] args) {
        System.out.println("INTRODUCE UNA EDAD PARA COMPROBAR SI ES MAYOR DE EDAD O NO");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        boolean mayorfinal = isAdult (age);

        if (mayorfinal){
            System.out.println("ES MAYOR DE EDAD");
        }
        else {
            System.out.println("ES MENOR DE EDAD");
        }


    }
    public static boolean isAdult(int age) {
        return age >= 18;



    }

    }
