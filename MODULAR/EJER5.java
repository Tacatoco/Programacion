package MODULAR;

import java.util.Scanner;

public class EJER5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salirwhile = false;
        int numusu = 0;
        int tablamultiplicarfin ;
        System.out.println("INTRODUCE UN NUMERO PARA AVERIGUAR LA TABLA DE MULTIPLICAR");
        numusu = scanner.nextInt();
        System.out.println("INTRODUCE UN VALOR DEL 1 AL 10");

        while (!salirwhile){

            if (numusu <= 10 && numusu > 0){
                salirwhile = true;
            }
            else {
                numusu = scanner.nextInt();
            }

        }
        tablamultiplicar(numusu);
    }

    public static void tablamultiplicar(int numusu){
        System.out.println("LA TABLA DE MULTIPLICAR DE " + numusu);
        for (int i = 1 ; i <= 10 ; i++){
            int resultadofin = numusu * i;
            System.out.println(numusu * i);
        }


    }


}
