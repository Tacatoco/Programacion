package MODULAR;

import java.util.Scanner;
public class EJER3 {

    public static void main(String[] args) {
        double radius = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE UN RADIO VALIDO PARA CALCULAR LA SUPERFICIE Y EL PERIMETRO");
        boolean radiousu = validRadius(radius);

       if (radiousu){
           double perimetro = calculateCirclePerimeter(radius);
           double area = calculatecirclearea(radius);

           System.out.println("PERIMETRO ES: " + perimetro);
           System.out.println("AREA ES: " + area);
       } else if (!radiousu) {
           System.out.println("INTRODUCE UN VALOR VÁLIDO");

       }


    }



    public static boolean validRadius(double radius) {
        Scanner scanner = new Scanner(System.in);
        double radiousuboolean = scanner.nextDouble();

            if (radiousuboolean > 0) {
                return true;
            } else {
                return false;

        }
    }


    public static double calculateCirclePerimeter(double radius){
        Scanner scanner = new Scanner(System.in);
         radius = scanner.nextDouble();

        return (radius * radius) * 3.14;
    }


    public static double calculatecirclearea (double radius){
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        return (2 * radius * 3.14);

    }



}