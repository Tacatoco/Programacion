package Matrices;


import java.util.Scanner;


public class joutel {
    public static void main(String[] args) {
        int[][] hotel;
        hotel = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},


        };
        matrizhotel(hotel);
    }

    public static int[][] matrizhotel (int[][] hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UNA PLANTA DEL HOTEL (0-10)");
        System.out.println();
        int plantausu = scanner.nextInt();


        System.out.println("INTRODUCE UNA HABITACION DE LA PLANTA (0-4)");
        System.out.println();
        int habitacionusu = scanner.nextInt();


        System.out.println("INTRODUCE LA INTENSIDAD DE LA SEÑAL (1-3");
        System.out.println();
        int senalusu = scanner.nextInt();


        hotel[plantausu][habitacionusu] = senalusu;


        if (plantausu > 0) hotel[plantausu - 1][habitacionusu] = Math.max(0, senalusu - 1);
        if (plantausu < hotel.length - 1) hotel[plantausu + 1][habitacionusu] = Math.max(0, senalusu - 1);
        if (habitacionusu > 0) hotel[plantausu][habitacionusu - 1] = Math.max(0, senalusu - 1);
        if (habitacionusu < hotel[plantausu].length - 1) hotel[plantausu][habitacionusu + 1] = Math.max(0, senalusu - 1);




        if (plantausu > 0 && habitacionusu > 0)
            hotel[plantausu - 1][habitacionusu - 1] = Math.max(0, senalusu - 2);
        if (plantausu > 0 && habitacionusu < hotel[plantausu].length - 1)
            hotel[plantausu - 1][habitacionusu + 1] = Math.max(0, senalusu - 2);
        if (plantausu < hotel.length - 1 && habitacionusu > 0)
            hotel[plantausu + 1][habitacionusu - 1] = Math.max(0, senalusu - 2);
        if (plantausu < hotel.length - 1 && habitacionusu < hotel[plantausu].length - 1)
            hotel[plantausu + 1][habitacionusu + 1] = Math.max(0, senalusu - 2);




        if (plantausu < hotel.length - 2 && hotel[plantausu + 1][habitacionusu] > 1)
            hotel[plantausu + 2][habitacionusu] = 1;


        if (plantausu > 1 && hotel[plantausu - 1][habitacionusu] > 1)
            hotel[plantausu - 2][habitacionusu] = 1;


        if (habitacionusu < hotel[plantausu].length - 2 && hotel[plantausu][habitacionusu + 1] > 1)
            hotel[plantausu][habitacionusu + 2] = 1;


        if (habitacionusu > 1 && hotel[plantausu][habitacionusu - 1] > 1)
            hotel[plantausu][habitacionusu - 2] = 1;




        for (int i = 0; i< hotel.length; i++){
            for (int j = 0; j < hotel[i].length; j++){
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }
        return hotel;
    }














}

