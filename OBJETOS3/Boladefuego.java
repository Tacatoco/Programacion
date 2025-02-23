package OBJETOS3;

public class Boladefuego implements Ataqueavanzado{
    @Override
    public void lanzar() {
        System.out.println("SE LANZA LA BOLA DE FUEGO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 100 DE MANA Y 2 MINUTOS DE REPOSO");
    }

    @Override
    public void danioafligido() {
        System.out.println("HACE 100 DE DAÑO DE TIPO MAGICO");

    }
}
