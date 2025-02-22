package OBJETOS3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ciclomotor extends Vehiculo {
    Scanner scanner = new Scanner(System.in);
    private int cilindrada;
    public Ciclomotor(String marca, int numeroruedas, int precio, int cilindrada) {
        super(marca, numeroruedas, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int pedircilindrada(){
        cilindrada = scanner.nextInt();
        return cilindrada;
    }


    public void mostrarinfo(){
        System.out.println();
        System.out.println("CICLOMOTOR RUMRUM");
        System.out.println("MARCA --> " + getMarca());
        System.out.println("NUMERO DE RUEDAS --> " + getNumeroruedas());
        System.out.println("PRECIO --> " + getPrecio());
        System.out.println("CILINDRADA --> " + getCilindrada());
        if (getCilindrada() >= 125){
            System.out.println("EL CICLOMOTOR REQUIERE CARNET");
        }
        else System.out.println("EL CICLOMOTOR NO REQUIERE CARNET");
    }

}