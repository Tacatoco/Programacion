package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Atrapalamosca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean comprobadorwhile = false;
        int elecasilla = 0;
        int eleccionusu;
        int posicionmosca = 0;
        int[] Arraymosca;
        Arraymosca = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("VAMOS A JUGAR A ATRAPA A LA MOSCA");
        System.out.println();
        System.out.println("DIME UNA POSICION DEL 0 AL 14, SI ACIERTAS TE LO DIRÉ, SINO SEGUIRAS INTENTANDOLO");
        System.out.println();
        System.out.println("¿EMPEZAMOS?  EMPEZAR -> 1  SALIR -> 2");
        eleccionusu = scanner.nextInt();

        if (eleccionusu == 2) {
            System.out.println("ADIOS");
        } else if (eleccionusu == 1) {
            posicionmosca = random.nextInt(Arraymosca.length);
            while (!comprobadorwhile) {

                System.out.println("ELIGE UNA POSICION DEL 0 AL 14");
                elecasilla = scanner.nextInt();

                if (elecasilla == posicionmosca) {
                    System.out.println("FELICIDADES!!! HAS ATRAPADO A LA MOSCA");
                    System.out.println(" __\n" +
                            "   -. (#)(#) .-\n" +
                            "    '\\.';;'./'\n" +
                            " .-\\.'  ;;  './-.\n" +
                            "   ;    ;;    ;\n" +
                            "   ;   .''.   ;\n" +
                            "    '''    ''' ");
                    comprobadorwhile = true;
                } else if (elecasilla == (posicionmosca - 1) || elecasilla == (posicionmosca + 1)) {
                    System.out.println("CASI, HA FALTADO POCO, PERO LA MOSCA SE HA MOVIDO :( ");
                    posicionmosca = random.nextInt(Arraymosca.length);

                } else if (elecasilla != posicionmosca) {
                    System.out.println("NO HAS ACERTADO, SIGUE PROBANDO");
                }

            }

        }

    }
}
