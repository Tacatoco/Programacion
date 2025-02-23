package OBJETOS3;

public class Triangulo extends Figura2D{
    private double base, altura, lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado2, double lado1, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado1 = lado1;
        this.lado3 = lado3;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double area(){
        return (base*altura)/2;
    }
    @Override
    public double perimetro(){
        return lado1+lado2+lado3;
    }
    @Override
    public String toString(){
        return "HOLA SOY UN TRIANGULO";
    }
}
