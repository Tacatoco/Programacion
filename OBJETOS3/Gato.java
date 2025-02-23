package OBJETOS3;

public class Gato extends Animal{
    @Override
    public void comer(){
        System.out.println("EL GATO COME");
    }

    @Override
    public void hacerRuido(){
        System.out.println("EL GATO HACE RUIDO");
    }
    @Override
    public void dormir(){
        System.out.println("EL GATO DUERME");
    }

    public void maullar(){
        System.out.println("EL GATO MAULLA");
    }
}
