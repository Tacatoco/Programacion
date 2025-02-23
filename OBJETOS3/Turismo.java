package OBJETOS3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Turismo extends Vehiculo{
    Scanner scanner = new Scanner(System.in);
    private int numpasajeros;
    private String uso;

    public Turismo(String marca, int numeroruedas, int precio, int numpasajeros, String uso) {
        super(marca, numeroruedas, precio);
        this.numpasajeros = numpasajeros;
        this.uso = uso;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int pedirpasajeros(){
        numpasajeros = scanner.nextInt();
        return numpasajeros;
    }

    public String pediruso(){
        uso = scanner.next();
        return uso;
    }

    public void mostrarinfo(){
        System.out.println();
        System.out.println("TURISMO RUMRUM");
        System.out.println("MARCA --> " + getMarca());
        System.out.println("NUMERO DE RUEDAS --> " + getNumeroruedas());
        System.out.println("PRECIO --> " + getPrecio());
        System.out.println("NÚMERO DE PASAJEROS: " + getNumpasajeros());
        System.out.println("EL TURISMO SE USA A NIVEL: " + getUso());
    }



}