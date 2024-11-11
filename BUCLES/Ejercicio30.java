package src.BUCLES;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacion;
        int Num1;
        int Num2 = 0;
        boolean continuar = true;

        System.out.println("INTRODUCE UN NUMERO ENTERO, SEGUIDO DE UN OPERADOR Y OTRA NUMERO PARA CALCULAR");

        do {

            System.out.println("PRIMER NUMERO");
            Num1 = scanner.nextInt();

            System.out.println("OPERADOR +, -, /, *, %");
            operacion = scanner.next();

            if (operacion.equals("Exit")){

                continuar = false;


            }

            else {

                System.out.println("SEGUNDO NUMERO");
                Num2 = scanner.nextInt();
            }

            if (operacion.equals("+")){

                System.out.println(Num1 + Num2);


                }

            else if (operacion.equals("-")) {

                System.out.println(Num1 - Num2);

            }

            else if (operacion.equals("*")) {

                System.out.println(Num1 * Num2);

            } else if (operacion.equals("/")) {

                System.out.println(Num1 / Num2);

            }

            else if (operacion.equals("%")) {

                System.out.println(Num1 % Num2);

            }

            else {

                System.out.println("VALOR INCORRECTO");

            }



        }
        while (continuar) ;


        System.out.println("FIN DEL PROGRAMA");

    }

}
