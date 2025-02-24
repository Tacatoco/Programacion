package OBJETOS3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Camion extends Vehiculo {
    Scanner scanner = new Scanner(System.in);
    private int pesomaximo;
    private boolean mercanciapeligrosa;

    public Camion(String marca, int numeroruedas, int precio, int pesomaximo, boolean mercanciapeligrosa) {
        super(marca, numeroruedas, precio);
        this.pesomaximo = pesomaximo;
        this.mercanciapeligrosa = mercanciapeligrosa;
    }

    public int getPesomaximo() {
        return pesomaximo;
    }

    public void setPesomaximo(int pesomaximo) {
        this.pesomaximo = pesomaximo;
    }

    public boolean isMercanciapeligrosa() {
        return mercanciapeligrosa;
    }

    public void setMercanciapeligrosa(boolean mercanciapeligrosa) {
        this.mercanciapeligrosa = mercanciapeligrosa;
    }

    public int pedirmasamaxima(){
        pesomaximo = scanner.nextInt();
        return pesomaximo;
    }

    public boolean espeligrosa(){
        boolean siono;
        String elecusu = scanner.next().toUpperCase().trim();
        if (elecusu.equals("SI")){
            siono = true;
        }
        else {
            siono = false;
        }
        return siono;
    }

    public void mostrarinfo(){
        System.out.println();
        System.out.println("CAMION RUMRUM");
        System.out.println("MARCA --> " + getMarca());
        System.out.println("NUMERO DE RUEDAS --> " + getNumeroruedas());
        System.out.println("PRECIO --> " + getPrecio());
        System.out.println("PESO MÁXIMO --> " + getPesomaximo());
        if (this.mercanciapeligrosa){
            System.out.println("EL CAMION TRANSPORTA MERCANCÍA PELIGROSA");
        }
        else System.out.println("EL CAMION NO TRANSPORTA MERCANCÍA PELIGROSA");
    }





}