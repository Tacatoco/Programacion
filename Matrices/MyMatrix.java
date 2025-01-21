package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] Matriz = new int[][] {{1,2,3}, {4,5,6} ,{7,8,9}};

        int [][] Matrizrepetirnum = new int[][] {{1,2,3}, {1,2,4} ,{1,8,9}};

        int [][] Matrizsumada = new int[3][3];

        int [][] Matrizrestada = new int[3][3];

        int [][] Matrizunidad = new int [][] {{1,0,0}, {0,1,0}, {0,0,1}};

        System.out.println("INSERTA UN NUMERO:");
        System.out.println("1--> IMPRIMIR MATRIZ");
        System.out.println("2--> CUAL ES EL MAYOR");
        System.out.println("3--> CUAL ES EL MENOR");
        System.out.println("4--> CUAL ES LA MEDIA");
        System.out.println("5--> EXISTE O NO");

        int elecusu = scanner.nextInt();

        switch (elecusu){
            case 1: imprimirmatriz(Matriz);
                break;

            case 2: int maximo = maxmatriz(Matriz);
                System.out.println("EL MÁXIMO ES: " + maximo);
                break;

            case 3: int minimo = minmatriz(Matriz);
                System.out.println("EL MINIMO ES: " + minimo);
                break;

            case 4: int media = mediamatriz(Matriz);
                System.out.println("LA MEDIA ES: " + media);
                break;

            case 5:
                System.out.println("INSERTA UN VALOR");
                int valorusu = scanner.nextInt();
                 boolean comprobaçion = existeono(Matriz,valorusu);
                if (comprobaçion){
                    System.out.println("SI QUE EXISTE");
                }
                else{
                    System.out.println("NO EXISTE");
                }
                break;

            case 6: int contador = vecesrepetir(Matrizrepetirnum);
                System.out.println("EL NUMERO SE REPITE " + contador + " VECES");


            case 7:
                Matrizsumada = sumarmatrices(Matriz, Matrizrepetirnum, Matrizsumada);
                System.out.println("LA SUMA DE LAS MATRICES DA: " + Arrays.deepToString(Matrizsumada));


            case 8: Matrizrestada = restamatrices(Matriz, Matrizrepetirnum, Matrizrestada);
                System.out.println("LA RESTA DE LAS MATRICES DA: " + Arrays.deepToString(Matrizrestada));


        }

    }



    public static void imprimirmatriz (int[][] Matriz){
        System.out.println(Arrays.deepToString(Matriz));
    }

    public static int maxmatriz (int[][] Matriz){
        int maximo = 0;
        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                if (Matriz[i][j] > maximo){
                    maximo = Matriz[i][j];
                }
            }
        }
        return maximo;
    }



    public static int minmatriz (int[][] Matriz){
        int minimo = 1;
        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                if (Matriz[i][j] < minimo){
                    minimo = Matriz[i][j];
                }
            }
        }
        return minimo;
    }
    
    
    public static int mediamatriz (int[][] Matriz){
        int media = 0;
        int contador = 0;

        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                media = media + Matriz[i][j];
                contador++;
            }
        }
        return (media / contador);
    }


    public static boolean existeono (int [][] Matriz, int valorusu){
        boolean exisornot = false;

        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                if (valorusu == Matriz[i][j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static int vecesrepetir (int [][] Matrizrepetirnum){
        int contadorveces = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSERTA UN NUMERO PARA CALCULAR LAS VECES QUE SE REPITE");
        int elecusu = scanner.nextInt();

        for (int i = 0; i < Matrizrepetirnum.length; i++){
            for (int j = 0; j < Matrizrepetirnum[i].length; j++){
                if (elecusu == Matrizrepetirnum[i][j]){
                    contadorveces++;
                }
            }
        }
        return contadorveces;
    }


    public static int[][] sumarmatrices(int[][]Matriz, int[][] Matrizrepetirnum, int[][] Matrizsumada){

        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                Matrizsumada[i][j] = (Matriz[i][j] + Matrizrepetirnum[i][j]);
            }
        }
        return Matrizsumada;
    }


    public static int[][] restamatrices(int[][]Matriz, int[][] Matrizrepetirnum, int[][] Matrizrestada){

        for (int i = 0; i < Matriz.length; i++){
            for (int j = 0; j < Matriz[i].length; j++){
                Matrizrestada[i][j] = (Matriz[i][j] - Matrizrepetirnum[i][j]);
            }
        }
        return Matrizrestada;
    }






}
