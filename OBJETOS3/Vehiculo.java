package OBJETOS3;

import java.util.Scanner;

public class Vehiculo {
    Scanner scanner = new Scanner(System.in);
    private String marca;
    private int numeroruedas;
    private int precio;

    public Vehiculo(String marca, int numeroruedas, int precio) {
        this.marca = marca;
        this.numeroruedas = numeroruedas;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroruedas() {
        return numeroruedas;
    }

    public void setNumeroruedas(int numeroruedas) {
        this.numeroruedas = numeroruedas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String marcausu(){
        marca = scanner.next();
        return marca;
    }

    public int ruedasusu(){
        numeroruedas = scanner.nextInt();
        return numeroruedas;
    }

    public int preciousu(){
        precio = scanner.nextInt();
        return precio;
    }
}