package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Arrayprincipal;
        Arrayprincipal = new int[]{1, 2, 3, 4, 5, 6};

        int[] Arraysecundario;
        Arraysecundario = new int[]{7, 8, 9, 10, 11, 12};

        int[] Arraycapicua;
        Arraycapicua = new int[]{1, 2, 3, 3, 2, 1};

        System.out.println("INTRODUCE UNA OPCION");
        String eleccionusu = scanner.next();


        switch (eleccionusu) {

            case "a": {
                Imprimirarray(Arrayprincipal);
            }

            case "b": {
                int valormaximo = Maximoarray(Arrayprincipal);
                System.out.println("El valor máximo es: " + valormaximo);
            }

            case "c": {
                int valorminimo = Minimoarray(Arrayprincipal);
                System.out.println("El valor minimo es: " + valorminimo);
            }

            case "d": {
                int valormedia = Mediarray(Arrayprincipal);
                System.out.println("La media es: " + valormedia);
            }

            case "e": {
                boolean resultadoexiste = Existeono(Arrayprincipal);
                if (resultadoexiste) {
                    System.out.println("SI QUE EXISTE");
                } else {
                    System.out.println("NO EXISTE");
                }
            }

            case "f": {
                Sumavectores(Arrayprincipal, Arraysecundario);

            }

            case "g": {
                Restavectores(Arrayprincipal, Arraysecundario);
            }

            case "h": {
                int resultadoproducto = 0;
                System.out.println("EL RESULTADO DEL PRODUCTO ESCALAR ES: " + Productoescalar(Arrayprincipal, Arraysecundario));
            }

            case "i": {
                Arrayprincipal = invertirorden(Arrayprincipal);
                System.out.println("EL ARRAY INVERTIDO ES: " + Arrays.toString(Arrayprincipal));
                break;
            }

            case "j": {
                funcioninvertirorden(Arrayprincipal);
                System.out.println("EL ARRAY INVERTIDO SIENDO PROCEDIMIENTO ES: " + Arrays.toString(Arrayprincipal));
            }

            case "k":{
                if (capicua(Arrayprincipal, Arraycapicua)) {
                    System.out.println("ES CAPICUA");
                }
                else {
                    System.out.println("NO ES CAPICUA");
                }

            }


        }

    }


    public static void Imprimirarray(int[] Arrayprincipal) {

        System.out.println(Arrays.toString(Arrayprincipal));
    }


    public static int Maximoarray(int[] Arrayprincipal) {
        int maximo = Arrayprincipal[0];

        for (int i = 1; i < Arrayprincipal.length; i++) {
            if (Arrayprincipal[i] > maximo) {
                maximo = Arrayprincipal[i];
            }
        }
        return maximo;
    }


    public static int Minimoarray(int[] Arrayprincipal) {
        int minimo = Arrayprincipal[0];

        for (int i = 1; i < Arrayprincipal.length; i++) {
            if (Arrayprincipal[i] < minimo) {
                minimo = Arrayprincipal[i];
            }

        }
        return minimo;
    }


    public static int Mediarray(int[] Arrayprincipal) {
        int media = (Arrayprincipal[0] + Arrayprincipal[1] + Arrayprincipal[2] + Arrayprincipal[3] + Arrayprincipal[4] + Arrayprincipal[5]) / 6;
        return media;
    }


    public static boolean Existeono(int[] Arrayprincipal) {
        Scanner scanner = new Scanner(System.in);
        boolean resultado;
        int numusu = scanner.nextInt();

        for (int i = 0; i < Arrayprincipal.length; i++) {
            if (numusu == Arrayprincipal[i]) {
                return true;
            }
        }
        return false;
    }


    public static void Sumavectores(int[] Arrayprincipal, int[] Arraysecundario) {

        System.out.println();
        System.out.println("SUMA DE EL PRIMER VECTOR DE LOS ARRAYS: " + (Arrayprincipal[0] + Arraysecundario[0]));
        System.out.println();

        System.out.println("SUMA DE EL SEGUNDO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[1] + Arraysecundario[1]));
        System.out.println();

        System.out.println("SUMA DE EL TERCER VECTOR DE LOS ARRAYS: " + (Arrayprincipal[2] + Arraysecundario[2]));
        System.out.println();

        System.out.println("SUMA DE EL CUARTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[3] + Arraysecundario[3]));
        System.out.println();

        System.out.println("SUMA DE EL QUINTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[4] + Arraysecundario[4]));
        System.out.println();
        System.out.println("SUMA DE EL SEXTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[5] + Arraysecundario[5]));
        System.out.println();


    }


    public static void Restavectores(int[] Arrayprincipal, int[] Arraysecundario) {

        System.out.println();
        System.out.println("RESTA DE EL PRIMER VECTOR DE LOS ARRAYS: " + (Arrayprincipal[0] - Arraysecundario[0]));
        System.out.println();

        System.out.println("RESTA DE EL SEGUNDO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[1] - Arraysecundario[1]));
        System.out.println();

        System.out.println("RESTA DE EL TERCER VECTOR DE LOS ARRAYS: " + (Arrayprincipal[2] - Arraysecundario[2]));
        System.out.println();

        System.out.println("RESTA DE EL CUARTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[3] - Arraysecundario[3]));
        System.out.println();

        System.out.println("RESTA DE EL QUINTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[4] - Arraysecundario[4]));
        System.out.println();
        System.out.println("RESTA DE EL SEXTO VECTOR DE LOS ARRAYS: " + (Arrayprincipal[5] - Arraysecundario[5]));
        System.out.println();

    }

    public static int Productoescalar(int[] Arrayprincipal, int[] Arraysecundario) {
        int resultadofinal = 0;

        for (int i = 0; i < Arrayprincipal.length; i++) {
            resultadofinal = resultadofinal + (Arrayprincipal[i] * Arraysecundario[i]);
        }

        return resultadofinal;
    }

    public static int[] invertirorden(int[] Arrayprincipal) {
        int temp;  // Usamos una variable temporal para intercambiar

        // Hacemos un ciclo para recorrer el array desde los dos extremos
        for (int i = 0, j = Arrayprincipal.length - 1; i < j; i++, j--) {
            // Intercambiamos los elementos en las posiciones i y j
            temp = Arrayprincipal[i];         // Guardamos el valor en la posición i
            Arrayprincipal[i] = Arrayprincipal[j];  // Colocamos el valor de j en la posición i
            Arrayprincipal[j] = temp;         // Colocamos el valor guardado de i en la posición j
        }
        return Arrayprincipal;
    }

    public static void funcioninvertirorden(int[] Arrayprincipal) {
        int temp;

        for (int i = 0, j = Arrayprincipal.length - 1; i < j; i++, j--) {
            temp = Arrayprincipal[i];
            Arrayprincipal[i] = Arrayprincipal[j];
            Arrayprincipal[j] = temp;
        }

    }

    public static boolean capicua(int[] Arrayprincipal, int[] Arraycapicua) {
        boolean arraycapicua = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ELEGIR ARRAY PRINCIPAL -> 1");
        System.out.println("ELEGIR ARRAY CAPICUA -> 2");
        int eleccionusu = scanner.nextInt();

        if (eleccionusu == 1) {
            if (Arrayprincipal[0] == Arrayprincipal[5] && Arrayprincipal[1] == Arrayprincipal[4] && Arrayprincipal[2] == Arrayprincipal[3]) {
            arraycapicua = true;
            }
            else {
                arraycapicua = false;
            }
        } else if (eleccionusu == 2) {
            if (Arraycapicua[0] == Arraycapicua[5] && Arraycapicua[1] == Arraycapicua[4] && Arraycapicua[2] == Arraycapicua[3]) {
                arraycapicua = true;
            }
            else {
                arraycapicua = false;
            }

        }
        return arraycapicua;
    }

}
