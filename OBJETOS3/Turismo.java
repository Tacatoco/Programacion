package OBJETOS3;

import java.util.Scanner;

public class Turismo extends Vehiculo{
    Scanner scanner = new Scanner(System.in);
    private int numpasajeros;
    private String uso;


    public Turismo(int numpasajeros, String uso) {
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

    public void pedirpasajeros(int numpasajeros){
       System.out.println("INTRODUCE EL NUMERO DE PASAJEROS DEL TURISMO");
        numpasajeros = scanner.nextInt();
    }

    public void pedirusu(String uso){
        System.out.println("INTRODUCE EL USO DEL TURISMO");
         uso = scanner.next();
    }




}
