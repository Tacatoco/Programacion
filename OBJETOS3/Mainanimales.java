package OBJETOS3;

public class Mainanimales {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Mono mono = new Mono();
        Gato gato = new Gato();
        Perro perro = new Perro();
        Elefante elefante = new Elefante();

        System.out.println("LEON");
        leon.comer();
        leon.dormir();
        leon.hacerRuido();
        leon.rugir();
        System.out.println();

        System.out.println("ELEFANTE");
        elefante.comer();
        elefante.dormir();
        elefante.hacerRuido();
        elefante.barritar();
        System.out.println();

        System.out.println("PERRO");
        perro.comer();
        perro.dormir();
        perro.hacerRuido();
        perro.ladrar();
        System.out.println();

        System.out.println("GATO");
        gato.comer();
        gato.dormir();
        gato.hacerRuido();
        gato.maullar();
        System.out.println();

        System.out.println("MONO");
        mono.comer();
        mono.dormir();
        mono.hacerRuido();
        mono.chillar();
    }
}
