package MODULAR;

import java.util.Scanner;

public class EJER10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");


        char elecusu = scanner.next().charAt(0);

        switch (elecusu){

            case ('a'):{
                double resultado;
                double valorusu = 0;
                System.out.println("INTRODUCE UN VALOR");

                resultado = EJER1.numberSign(valorusu);

                if (resultado ==0) {
                    System.out.println("0");
                }  else if (resultado == -1){
                    System.out.println("-1");
                } else if (resultado == 1) {
                    System.out.println("1");
                }

            }


            case ('b'):{

                System.out.println("INTRODUCE UNA EDAD PARA COMPROBAR SI ES MAYOR DE EDAD O NO");
                int age = scanner.nextInt();
                boolean mayorfinal = EJER2.isAdult (EJER2.age);

                if (mayorfinal){
                    System.out.println("ES MAYOR DE EDAD");
                }
                else {
                    System.out.println("ES MENOR DE EDAD");
                }
            }
            
            
            case ('c'):{
                double radius = 0;
                System.out.println("INTRODUCE UN RADIO VALIDO PARA CALCULAR LA SUPERFICIE Y EL PERIMETRO");
                boolean radiousu = EJER3.validRadius(radius);

                if (radiousu){
                    double perimetro = EJER3.calculateCirclePerimeter(radius);
                    double area = EJER3.calculatecirclearea(radius);

                    System.out.println("PERIMETRO ES: " + perimetro);
                    System.out.println("AREA ES: " + area);
                } else if (!radiousu) {

                    System.out.println("INTRODUCE UN VALOR VÁLIDO");

                }
            }

            
            case ('d'):{

                double resultfin = 0;
                boolean salirwhile = false;

                System.out.println("INTRODUCE 1 SI QUIERES PASAR DE EUROS A DOLARES");
                System.out.println("INTRODUCE 2 SI QUIERES PASAR DE DOLARES A EUROS");
                int valorusu = scanner.nextInt();
                System.out.println();

                
                while (!salirwhile){

                    if (valorusu == 1){
                        System.out.println("PASAR DE € A $");
                        System.out.println("INTRODUCE LOS LAUROS");

                        double monedausu = scanner.nextDouble();
                        resultfin = EJER4.euro2dollar(monedausu);

                        System.out.println("SON: " + resultfin + " dolares");

                        salirwhile = true;



                    }
                    else if (valorusu == 2){
                        System.out.println("PASAR DE $ A €");
                        System.out.println("INTRODUCE LOS DOLLARS");

                        double monedausu = scanner.nextDouble();
                        resultfin = EJER4.dollar2euro(monedausu);

                        System.out.println("SON " + resultfin + " euros");

                        salirwhile = true;

                    }

                    else {
                        System.out.println("INTRODUCE UN VALOR VÁLIDO");





                    }


                }

            }


            case ('e'):{
                boolean salirwhile = false;
                int numusu = 0;
                int tablamultiplicarfin ;
                System.out.println("INTRODUCE UN NUMERO PARA AVERIGUAR LA TABLA DE MULTIPLICAR");
                numusu = scanner.nextInt();
                System.out.println("INTRODUCE UN VALOR DEL 1 AL 10");

                while (!salirwhile){

                    if (numusu <= 10 && numusu > 0){
                        salirwhile = true;
                    }
                    else {
                        numusu = scanner.nextInt();
                    }

                }

                EJER5.tablamultiplicar(numusu);

            }

            case ('f'):{
                System.out.println("LAS TABLAS DE MULTIPLICAR");
                EJER6.tablasmultiplicar();

            }

            case ('g'):{
                int numero = 0;
                boolean salirbucle = false;
                int numerocomp = 3;

                System.out.println("PARA INTRODUCIR UN NUMERO PULSA 1, PARA SALIR PULSA 0");
                while (!salirbucle) {
                    numerocomp = scanner.nextInt();
                    if (numerocomp == 0){
                        System.out.println();
                        salirbucle = true;
                    } else if (numerocomp == 1) {
                        if (EJER7.esprimo(numero)) {
                            System.out.println("ES PRIMO");
                            System.out.println();
                            System.out.println("INTRODUCE 1 PARA SEGUIR 0 PARA SALIR");
                        } else {
                            System.out.println("NO ES PRIMO");
                            System.out.println();
                            System.out.println("INTRODUCE 1 PARA SEGUIR 0 PARA SALIR");
                        }
                    }
                }
            }

            case ('h'):{

                int añousu = 0;
                int mesusu = 0;
                int diausu = 0;

                if (EJER8.comprobarfecha(añousu, mesusu, diausu) == true){
                    System.out.println("ES VÁLIDA");
                }
                else {
                    System.out.println("NO ES VÁLIDA");
                }
            }


            case ('i'):{
                char caracterusu = 0;
                int numlineasusu = 0;

                System.out.println("INTRODUCE UN CARACTER");
                caracterusu = scanner.next().charAt(0);

                System.out.println("INTRODUCE UN NUMERO DE LINEAS");
                numlineasusu = scanner.nextInt();

                EJER9.triangulo(caracterusu, numlineasusu);


            }




        }




    }
}
