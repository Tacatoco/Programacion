package MODULAR;

import java.util.Scanner;

public class EJER8 {
    public static void main(String[] args) {

        int añousu = 0;
        int mesusu = 0;
        int diausu = 0;

      if (comprobarfecha(añousu, mesusu, diausu)){
          System.out.println("ES VÁLIDA");
      }
      else {
          System.out.println("NO ES VÁLIDA");
      }



    }

    public static boolean comprobarfecha (int diausu, int mesusu, int añousu) {
        Scanner scanner = new Scanner(System.in);
        int dialimite = 0;
        boolean salirwhile = false;

        System.out.println("INTRODUCE UN AÑO");
        añousu = scanner.nextInt();

        System.out.println("INTRODUCE UN MES 1-12");
        mesusu = scanner.nextInt();

        System.out.println("INTRODUCE UN DIA 1-31");
        diausu = scanner.nextInt();

        while (!salirwhile) {

            switch (mesusu) {
                case 1, 3, 5, 7, 8, 10, 12: {
                    dialimite = 31;
                    salirwhile = true;
                    break;
                }

                case 4, 6, 9, 11: {
                    dialimite = 30;
                    salirwhile = true;
                    break;
                }

                case 2: {
                    dialimite = 28;
                    if ((añousu % 4 == 0 && añousu % 100 != 0) || (añousu % 400 == 0)) {
                        dialimite = 29;
                        salirwhile = true;
                        break;
                    }
                }
                default:{
                    return false;
                }

            }
        }

    if (diausu <= dialimite && diausu >= 1 && mesusu <=12 && mesusu >= 1 ){
        return true;
    }
    else {
        return false; }



    }


}



