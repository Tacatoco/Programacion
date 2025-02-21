package OBJETOS3;

import java.util.Scanner;

public class Camion {
    Scanner scanner = new Scanner(System.in);
    private int pesomaximo;
    private boolean mercanciapeligrosa;

    public Camion(int pesomaximo, boolean mercanciapeligrosa) {
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

    public void pedirmasamaxima(int pesomaximo){
        System.out.println("INTRODUCE LA MASA MÁXIMA DEL CAMIÓN");
        pesomaximo = scanner.nextInt();
    }
    public void espeligrosa(boolean mercanciapeligrosa){
        System.out.println("¿TRANSPORTA MERCANCIA PELIGROSA? --> SI     ¿NO TRANSPORTA? --> NO");


    }




}
