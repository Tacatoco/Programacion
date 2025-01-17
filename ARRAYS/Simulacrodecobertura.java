package ARRAYS;

import java.util.Scanner;

public class Simulacrodecobertura {
    public static void main(String[] args) {
        int[] Arraywifi;
        Arraywifi = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner scanner = new Scanner(System.in);
        int eleccionusu = 0;
        int eleccionhab = 0;
        int eleccionpotencia = 0;
        int j = 0;
        int k = 0;
        System.out.println("SIMULACRO DE COBERTURA");
        System.out.println();
        System.out.println("EMPEZAR --> 1   SALIR --> 2");
        eleccionusu = scanner.nextInt();

        switch (eleccionusu){
            case 2:{
                System.out.println("ADIOS :(");
                break;
            }

            case 1:{
                System.out.println("INSERTA UN NÚMERO DE HABITACIÓN, DE LA 0 A LA 19");
                eleccionhab = scanner.nextInt();

                if (eleccionhab >= 0 && eleccionhab <= 19){
                    System.out.println("HABITACIÓN CORRECTA");
                }
                else {
                    while (eleccionhab > 19 || eleccionhab < 0){
                        System.out.println("VALOR INCORRECTO, INTRODUCE EL NUMERO DE HABITACION OTRA VEZ");
                        eleccionhab = scanner.nextInt();
                    }
                }
                System.out.println();
                System.out.println("SEGUIDAMENTE INSERTA UNA POTENCIA DE TRANSMISIÓN, DEL 1 AL 6");
                eleccionpotencia = scanner.nextInt();

                if (eleccionpotencia >= 1 && eleccionpotencia <= 6){
                    System.out.println("POTENCIA CORRECTA");
                }
                else {
                    while (eleccionpotencia < 1 || eleccionpotencia > 6){
                        System.out.println("VALOR INCORRECTO, INTRODUCE UNA POTENCIA DEL 1 AL 6");
                        eleccionpotencia = scanner.nextInt();
                    }
                }

                for (int i = 0; i < Arraywifi.length; i++){
                    Arraywifi[i] = 0;
                }

                for (int i = 0; i < eleccionpotencia; i++){
                  if (eleccionhab - i >= 0) {
                      Arraywifi[eleccionhab - i] = Math.max(Arraywifi[eleccionhab - i], eleccionpotencia - i);
                  }
                  if (eleccionhab + i < Arraywifi.length){
                      Arraywifi[eleccionhab + i] = Math.max(Arraywifi[eleccionhab + i], eleccionpotencia - i);
                  }
                }

                System.out.println("SIMULACION DE COBERTURA:");
                for (int i = 0; i < Arraywifi.length; i++){
                    System.out.println(Arraywifi[i] + "");
                }


            }
        }


    }
}
