package MODULAR;

public class EJER6 {
    public static void main(String[] args) {
        System.out.println("LAS TABLAS DE MULTIPLICAR");

tablasmultiplicar();
    }
    public static void tablasmultiplicar (){
        for (int u = 1 ; u <= 10 ; u++) {
            System.out.println();
            System.out.println("LA TABLA DEL " + u);
            for (int i = 1; i <= 10; i++) {
                System.out.println(u * i);
            }
        }

    }


}
