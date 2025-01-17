package ARRAYS;
import java.util.*;

public class Buscarparejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] Animales;
        Animales = new String[]{"Perro", "Gato", "Elefante", "León", "Tigre", "Águila", "Ballena", "Cebra", "Jirafa", "Koala", "Perro", "Gato", "Elefante", "León", "Tigre", "Águila", "Ballena", "Cebra", "Jirafa", "Koala"};

        Collections.shuffle(Arrays.asList(Animales));

        boolean[] Visible;
        Visible = new boolean[20];


        while (!juegoterminado(Visible)) {
            Tablero(Animales, Visible);

            System.out.println("INSERTA LA POSICION 1");
            int pos1 = scanner.nextInt();

            System.out.println("INSERTA LA POSICION 2");
            int pos2 = scanner.nextInt();


            if (pos1 < 0 || pos1 > 19) {
                System.out.println("POSICION INCORRECTA");
                pos1 = scanner.nextInt();
            }

            if (pos2 < 0 || pos2 > 19) {
                System.out.println("POSICION INCORRECTA");
                pos2 = scanner.nextInt();
            }

            Visible[pos1] = true;
            Visible[pos2] = true;

            Tablero(Animales, Visible);

            if (Animales[pos1].equals(Animales[pos2])) {
                System.out.println("LA PAREJA ES IGUAL");
            } else {
                System.out.println("LA PAREJA NO ES IGUAL");
                Visible[pos1] = false;
                Visible[pos2] = false;
            }
        }

        System.out.println("FELICIDADES, HAS ENCONTRADO TODAS LAS PAREJAS");


    }

    public static void Tablero(String[] Animales, boolean[] Visible) {
        for (int i = 0; i < Animales.length; i++) {
            if (Visible[i] == true) {
                System.out.print(Animales[i] + "");
            } else {
                System.out.print("#");
            }

        }
        System.out.println();
    }


    public static boolean juegoterminado(boolean[] Visible) {
        for (int i = 0; i < Visible.length; i++) {
            if (!Visible[i]) {
                return false;
            }
        }
        return true;
    }
}