package OBJETOS3;

public class Ataqueespadazoencantado implements Ataqueavanzado{
    @Override
    public void lanzar() {
        System.out.println("SE LANZA UN ESPADAZO ENCANTADO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 300 DE MANA Y 10 MINUTOS DE REPOSO");
    }

    @Override
    public void danioafligido() {
        System.out.println("HACE 1000 DE DAÑO");

    }
}
