package src.BUCLES;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        int Sumanum = 0;
        int Divisioncontador = 0;
        boolean holaaaa = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numeros enteros positivos para calcular la media,en el momento que se introduzca un negativo, se calculara la media de los positivos");


            while (holaaaa){
                int NumUsu = scanner.nextInt();
                if (NumUsu < 0){
                    holaaaa = false;



            }
                else {

                    Sumanum = Sumanum + NumUsu;
                    Divisioncontador = Divisioncontador + 1;


                }

        }

        System.out.println("La media es " + (Sumanum / Divisioncontador));


    }

}
