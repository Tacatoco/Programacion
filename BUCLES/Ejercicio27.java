package src.BUCLES;

public class Ejercicio27 {
    public static void main(String[] args) {

        int Num = 0;
        int contador = 0;

        while (contador<20){

            int divi = 0;

            for (int i = 1; i <= Num ; i++) {

                if (Num % i == 0) {

                    divi++;
                }
            }

                if (divi == 2) {

                    System.out.println(Num + " ");

                    contador++;

                }

                Num++;

            }

        }






    }


