package MODULAR;
import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("    MENU DE POSIBLES USOS");
        System.out.println();
        System.out.println("1-> Calcular perimetro cuadrado");
        System.out.println("2-> Calcular area cuadrado");
        System.out.println("3-> Calcular perimetro rectangulo");
        System.out.println("4-> Calcular area rectangulo");
        System.out.println("5-> Calcular perimetro circulo");
        System.out.println("6-> Calcular area circulo");
        System.out.println("7-> Saber si un numero es primo o no");
        System.out.println("8-> Saber los digitos de un numero");
        System.out.println("9-> Saber los dígitos pares de un número");
        System.out.println("10-> Saber los digitos impares de un numero");
        System.out.println("11-> Calcular el factorial de un número");
        System.out.println("12-> Calcular el factorial de un número de manera recursiva");
        System.out.println("13-> Saber la cantidad de soluciones de una ecuación ");
        System.out.println("14-> Sumar digitos de un entero");


        int eleccionusu = scanner.nextInt();


        switch (eleccionusu){

            case 1:{
                System.out.println("Introduce el lado del cuadrado");
                double perimetrousu = scanner.nextDouble();
                System.out.println("PERIMETRO: " + squarePerimeter(perimetrousu));
                break;
            }

            case 2:{
                System.out.println("Introduce el lado del cuadrado");
                double ladousu = scanner.nextDouble();
                System.out.println("AREA: " + squareArea(ladousu));
                break;
            }

            case 3:{
                System.out.println("Introduce la altura del rectángulo");
                double alturausu = scanner.nextDouble();

                System.out.println("Introduce el ancho del rectangulo");
                double baseusu = scanner.nextDouble();

                System.out.println("PERIMETRO: " + rectanglePerimeter(baseusu, alturausu));
                break;
            }

            case 4:{
                System.out.println("Introduce la altura del rectángulo");
                double alturausu = scanner.nextDouble();

                System.out.println("Introduce el ancho del rectangulo");
                double baseusu = scanner.nextDouble();

                System.out.println("AREA: " + rectangleArea(baseusu, alturausu));
                break;
            }

            case 5:{
                System.out.println("INTRODUCE EL RADIO DEL CIRCULO");
                double radiousu = scanner.nextDouble();
                System.out.println("PERIMETRO DEL CIRCULO" + circleperimeter(radiousu));
                break;
            }

            case 6:{
                System.out.println("INTRODUCE EL RADIO DEL CIRCULO");
                double radiousu = scanner.nextDouble();
                System.out.println("AREA DEL CIRCULO" + circlearea(radiousu));
                break;            }

            case 7: {
                System.out.println("INTRODUCE ");
                int numero = scanner.nextInt();
                if (EJER7.esprimo(numero)){
                    System.out.println("ES PRIMO");
                }
                else {
                    System.out.println("NO ES PRIMO");
                }
                break;
            }

            case 8:{
                System.out.println("INTRODUCE UN NÚMERO ENTERO PARA SABER SUS DÍGITOS");
                int numerousu = scanner.nextInt();
                int resultfin = saberdigitos(numerousu);

                System.out.println("EL NÚMERO DE DIGITOS ES: " + resultfin);
                break;

            }

            case 9: {
                System.out.println("INTRODUCE UN NUMERO ENTERO PARA DETERMINAR LA CANTIDAD DE DIGITOS PARES QUE POSEE");
                int numerousu = scanner.nextInt();

                int pares = calculardigitospares(numerousu);

                System.out.println("LA CANTIDAD DE DIGITOS PARES ES: " + pares);
                break;
            }


            case 10: {
                System.out.println("INTRODUCE UN NUMERO ENTERO PARA DETERMINAR LA CANTIDAD DE DIGITOS IMPARES QUE POSEE");
                int numerousu = scanner.nextInt();

                int pares = calculardigitosimpares(numerousu);

                System.out.println("LA CANTIDAD DE DIGITOS IMPARES ES: " + pares);
                break;
            }


            case 11: {
                int resultadofactorial;
                System.out.println("INTRODUCE UN NUMERO ENTERO PARA CALCULAR SU FACTORIAL");
                int numerousu = scanner.nextInt();

                resultadofactorial = numfactorial(numerousu);

                System.out.println("EL FACTORIAL DE: " + numerousu + " ES: " + resultadofactorial);
                break;
            }


            case 12: {
                int resultadofactorial;
                System.out.println("INTRODUCE UN NUMERO ENTERO PARA CALCULAR SU FACTORIAL DE MANERA RECURSIVA");
                int numerousu = scanner.nextInt();

                resultadofactorial = numfactorialrecurs(numerousu);

                System.out.println("EL FACTORIAL DE: " + numerousu + " ES: " + resultadofactorial);
                break;
            }


            case 13:{
                System.out.println("INTRODUCE EL VALOR DE B");
                 double b = scanner.nextDouble();

                System.out.println("INTRODUCE EL VALOR DE A");
                double a = scanner.nextDouble();

                System.out.println("INTRODUCE EL VALOR DE C");
                double c = scanner.nextDouble();

                int resultado = calcularsolequa(b, a, c);

                System.out.println("LA CANTIDAD DE SOLUCIONES POSIBLES ES:  " + resultado);

            }

            case 14:{
                System.out.println("INTRODUCE UN NUMERO ENTERO PARA SUMAR SUS DÍGITOS");
                int numerousu = scanner.nextInt();
                int digitosfin = sumardigitos(numerousu);

                System.out.println("LA SUMA DA: " + digitosfin);

            }





        }




}




public static double squarePerimeter (double perimetrousu){
    return perimetrousu * 4;
}

public static double squareArea (double ladousu){
    return ladousu * 2;
}

public static double rectanglePerimeter (double baseusu, double alturausu){
    return ((baseusu * 2) + (alturausu * 2));
}

public static double rectangleArea (double baseusu, double alturausu){
    return baseusu * alturausu;
}

public static double circleperimeter (double radiousu){
    return Math.PI * radiousu;
}

public static double circlearea (double radiousu){
    return Math.PI * (radiousu * radiousu);
}



public static int saberdigitos (int numerousu){
    int contadordigitos = 0;
    while (numerousu > 0){
        numerousu = numerousu / 10;
        contadordigitos++;
    }
    return contadordigitos;
}


public static int calculardigitospares (int numerousu){
    int contadorpares = 0;
    while (numerousu > 0){
        int digito = numerousu % 10;

        if (digito % 2 == 0){
            contadorpares++;
        }

        numerousu = numerousu / 10;
    }
    return contadorpares;
}

public static int calculardigitosimpares (int numerousu){
    int contadorimpares = 0;
    while (numerousu > 0) {
        int digito = numerousu % 10;

        if (digito % 2 != 0) {
            contadorimpares++;
        }

        numerousu = numerousu / 10;
    }
    return contadorimpares;
}


public static int numfactorial (int numerousu){
    int factorial = 1;
    for (int i = 1; i<= numerousu; i++){

        factorial = factorial * i;
    }
    return factorial;
}


public static int numfactorialrecurs(int numerousu){
    if (numerousu == 0 || numerousu == 1) {
        return 1;
    }
    return numerousu * numfactorialrecurs(numerousu - 1);
}


public static int calcularsolequa(double b, double a, double c){
        int contadorsol = 0;
        double resultfin = b*2 - 4*a*c;
        if (resultfin > 0){
            contadorsol = 2;
        }
        else if (resultfin == 0){
            contadorsol = 1;
        }
        return contadorsol;
}


public static int sumardigitos (int numerousu){
        int fin = 0;
        while (numerousu > 0){
            fin = fin + numerousu % 10;
            numerousu = numerousu / 10;

        }
        return fin;
}







}