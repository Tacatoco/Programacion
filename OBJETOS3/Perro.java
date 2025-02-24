package OBJETOS3;

public class Perro extends Animal{
    @Override
    public void comer(){
        System.out.println("EL PERRO COME");
    }

    @Override
    public void hacerRuido(){
        System.out.println("EL PERRO HACE RUIDO");
    }

    @Override
    public void dormir(){
        System.out.println("EL PERRO DUERME");
    }

    public void ladrar(){
        System.out.println("EL PERRO LADRA");
    }
}
