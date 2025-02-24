package OBJETOS3;

public class Cuadrado extends Figura2D{
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
    @Override
    public double perimetro(){
        return lado * 4;
    }
    @Override
    public String toString(){
        return "HOLA SOY UN CUADRADO";
    }




}
