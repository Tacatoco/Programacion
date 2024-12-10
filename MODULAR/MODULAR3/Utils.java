package MODULAR.MODULAR3;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccionusu = scanner.nextInt();

        switch (eleccionusu){

            case 1:{
                System.out.println("          INTRODUCE LA CANTIDAD DE MILLAS");
                double millasusu = scanner.nextDouble();
                double resultfin = miles2kilometers(millasusu);
            }

            case 2:{
                System.out.println("INTRODUCE LOS EUROS");
                double eurosusu = scanner.nextDouble();

                System.out.println("AHORA INTRODUCE EL PORCENTAJE");
                double porcentajeusu = scanner.nextDouble();

                double resultfinal = getTaxes(eurosusu, porcentajeusu);

                System.out.println("EL RESULTADO FINAL ES: " + resultfinal);
            }

            case 3:{
                System.out.println("INTRODUCE LOS EUROS");
                double eurosusu = scanner.nextDouble();

                System.out.println("AHORA INTRODUCE EL PORCENTAJE");
                double porcentajeusu = scanner.nextDouble();

                double resultsuma = getNetPrice(eurosusu, porcentajeusu);

                System.out.println("LA SUMA DE LOS EUROS MAS EL PORCENTAJE APLICADO ES: " + resultsuma);
            }

            case 4:{



            }


        }



    }













    public static double miles2kilometers (double millasusu){
        double kilometros = millasusu * 0.62;
        System.out.println("LOS KILOMETROS RESULTANTES SON: " + kilometros);
        return kilometros;
    }


    public static double getTaxes (double eurosusu, double porcentajeusu){
        porcentajeusu = porcentajeusu / 100;
       double resultadoeuros = eurosusu * porcentajeusu;
       double resultfinal = Math.round(resultadoeuros * 100.0)/100.0;
       return resultfinal;
    }

    public static double getNetPrice (double eurosusu, double porcentajeusu){
        double porcentajetotal = getTaxes(eurosusu, porcentajeusu);
        return porcentajetotal + eurosusu;

    }





}
