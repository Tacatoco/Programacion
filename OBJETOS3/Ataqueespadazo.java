package OBJETOS3;

public class Ataqueespadazo implements Ataqueavanzado{
    @Override
    public void lanzar() {
        System.out.println("SE LANZA UN ESPADAZO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 0 DE MANA Y 1 MINUTO DE REPOSO");
    }

    @Override
    public void danioafligido() {
        System.out.println("HACE 20 DE DAÑO");

    }
}
