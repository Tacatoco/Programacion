package MODULAR;

import java.util.Scanner;
public class EJER1 {
    public static void main(String[] args) {
        double resultado;
        double valorusu = 0;
        System.out.println("INTRODUCE UN VALOR");

        resultado = numberSign(valorusu);

        if (resultado ==0) {
            System.out.println("0");
        }  else if (resultado == -1){
            System.out.println("-1");
        } else if (resultado == 1) {
            System.out.println("1");
        }

    }

    public static double numberSign(double valorusu) {
        Scanner scanner = new Scanner(System.in);

        valorusu = scanner.nextDouble();

        if (valorusu == 0) {
            return 0;
        } else if (valorusu < 0) {
            return -1;
        } else {
            return 1;
        }


    }
}
