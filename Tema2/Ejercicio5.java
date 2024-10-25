package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCRIBE EL PRIMER NÚMERO");
        double Primernum = scanner.nextDouble();

        System.out.println("ESCRIBE EL SEGUNDO NÚMERO");
        double Segundonum = scanner.nextDouble();

        System.out.println("ESCRIBE EL TERCER NÚMERO");
        double Tercernum = scanner.nextDouble();


        double Mediacondeci;

        Mediacondeci = (Primernum + Segundonum + Tercernum) / 3;


        int Mediasindeci = (int) Mediacondeci;
        Mediasindeci = (int)(Primernum + Segundonum + Tercernum) / 3;


        System.out.println("La media sin decimal es " + Mediasindeci);

        System.out.println("La media con decimal es " + Mediacondeci);

    }
}
