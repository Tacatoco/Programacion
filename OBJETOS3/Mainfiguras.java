package OBJETOS3;


public class Mainfiguras {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(2);
        Triangulo triangulo = new Triangulo(2,3,1,2,3);
        Rectangulo rectangulo = new Rectangulo(4,3);
        Circulo circulo = new Circulo(4.9);

        System.out.println("CUADRADO");
        System.out.println("EL AREA ES: " + cuadrado.area());
        System.out.println("EL PERIMETRO ES: " + cuadrado.perimetro());
        System.out.println(cuadrado.toString());
        System.out.println();


        System.out.println("RECTANGULO");
        System.out.println("EL AREA ES: " + rectangulo.area());
        System.out.println("EL PERIMETRO ES: " + rectangulo.perimetro());
        System.out.println(rectangulo.toString());
        System.out.println();

        System.out.println("TRIANGULO");
        System.out.println("EL AREA ES: " + triangulo.area());
        System.out.println("EL PERIMETRO ES: " + triangulo.perimetro());
        System.out.println(triangulo.toString());
        System.out.println();

        System.out.println("CIRCULO");
        System.out.println("EL AREA ES: " + circulo.area());
        System.out.println("EL PERIMETRO ES: " + circulo.perimetro());
        System.out.println(circulo.toString());


    }
}
