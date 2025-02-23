package OBJETOS3;

public class Mono extends Animal{
    @Override
    public void comer(){
        System.out.println("EL MONO COME");
    }

    @Override
    public void hacerRuido(){
        System.out.println("EL MONO HACE RUIDO");
    }
    @Override
    public void dormir(){
        System.out.println("EL MONO DUERME");
    }

    public void chillar(){
        System.out.println("EL MONO CHILLA");
    }
}
