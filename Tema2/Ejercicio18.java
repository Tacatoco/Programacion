package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        double raiz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO PARA CALCULAR LA RAIZ CUADRADA");
        double Valorusu = scanner.nextDouble();

       raiz = Math.sqrt(Valorusu);

        if (Valorusu <= 0){
            System.out.println("ERRORRRR");

        }

        else {

            System.out.println("La raiz es: " + raiz);

        }




    }
}
