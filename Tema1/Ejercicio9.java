package Tema1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        int Num1,Num2;

        int Suma,Resta,Producto,División,Resto;

        Scanner Numero = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        Num1 = Numero.nextInt();

        System.out.println("Introduce el primer número");
        Num2 = Numero.nextInt();

        Suma = Num1 + Num2;
        Resta = Num1 - Num2;
        Producto = Num1 * Num2;
        División = Num1 / Num2;
        Resto = Num1 % Num2;

        System.out.println("La suma de los numeros es " + Suma);
        System.out.println("La resta de los numeros es " + Resta);
        System.out.println("El producto de los numeros es " + Producto);
        System.out.println("La división de los numeros es " + División);
        System.out.println("El resto de los numeros es " + Resto);




    }

}