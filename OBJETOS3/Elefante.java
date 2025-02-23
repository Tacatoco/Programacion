package OBJETOS3;

public class Elefante extends Animal{

    @Override
    public void comer(){
        System.out.println("EL ELEFANTE COME");
    }

    @Override
    public void hacerRuido(){
        System.out.println("EL ELEFANTE HACE RUIDO");
    }
    @Override
    public void dormir(){
        System.out.println("EL ELEFANTE DUERME");
    }

    public void barritar(){
        System.out.println("EL ELEFANTE BARRITA");
    }
}
