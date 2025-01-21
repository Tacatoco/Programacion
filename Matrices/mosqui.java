package Matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mosqui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] posicionesmosca;
        posicionesmosca = new int[][]{
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        bienvenida();

        posicionesmosca = randomizarmatriz(posicionesmosca);

        juegogeneral(posicionesmosca);

    }

    public static void bienvenida(){
        System.out.println("INTRODUCE UNA POSICION ENTRE LA 0,0 Y LA 3,3");
        System.out.println();
    }


    public static int[][] randomizarmatriz (int[][]posicionesmosca){
        Random random = new Random();
        for (int i = 0; i < posicionesmosca.length; i++){
            for (int j = 0; j < posicionesmosca[i].length; j++){
                posicionesmosca[i][j] = 0;
            }
        }
        int randomfila = random.nextInt(posicionesmosca.length);
        int randomcolumna = random.nextInt(posicionesmosca[0].length);
        posicionesmosca[randomfila][randomcolumna] = 1;

        return posicionesmosca;
    }

    public static void juegogeneral(int[][] posicionesmosca){
       Scanner scanner = new Scanner(System.in);
        boolean compwhile = false;

       while(!compwhile){
           System.out.println("INSERTA LA FILA 0-3");
           System.out.println();
           int filausu = scanner.nextInt();

           System.out.println("INSERTA LA COLUMNA 0-3");
           System.out.println();
           int columnausu = scanner.nextInt();

           if (posicionesmosca[filausu][columnausu] == 1){
               System.out.println("FELICIDADES, HAS ATRAPADO A LA MOSCA");
               System.out.println(" __\n" +
                       "   -. (#)(#) .-\n" +
                       "    '\\.';;'./'\n" +
                       " .-\\.'  ;;  './-.\n" +
                       "   ;    ;;    ;\n" +
                       "   ;   .''.   ;\n" +
                       "    '''    ''' ");
               compwhile = true;
           }

           else if (esVecinoValido(filausu, columnausu, posicionesmosca)){
               System.out.println("CASI, LA MOSCA SE HA MOVIDO");
               randomizarmatriz(posicionesmosca);
           }
           else {
               System.out.println("SIGUE INTENTÁNDOLO!!!");
           }
       }
    }

    public static boolean esVecinoValido(int filausu, int columnausu, int[][] posicionesmosca) {
        if (filausu > 0 && posicionesmosca[filausu - 1][columnausu] == 1) { // Arriba
            return true;
        }
        if (columnausu > 0 && posicionesmosca[filausu][columnausu - 1] == 1) { // Izquierda
            return true;
        }
        if (filausu < posicionesmosca.length - 1 && posicionesmosca[filausu + 1][columnausu] == 1) { // Abajo
            return true;
        }
        if (columnausu < posicionesmosca[0].length - 1 && posicionesmosca[filausu][columnausu + 1] == 1) { // Derecha
            return true;
        }
        // Si ninguna celda vecina tiene la mosca, devolvemos falso
        return false;
    }
}
