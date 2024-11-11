package src.BUCLES;

public class Ejercicio21 {

    public static void main(String[] args) {

        int Numero;
        int Resultado = 0;

        for (Numero = 1; Numero <= 1000; Numero = Numero + 1) {

            if (Numero % 2 == 0) {
               Resultado = Resultado + Numero;
            }
        }

            System.out.println(Resultado);


    }
}
