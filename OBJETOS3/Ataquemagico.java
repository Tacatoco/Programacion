package OBJETOS3;

public class Ataquemagico implements Ataque{
    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE MÁGICO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 10€ EL ATAQUE MAGICO");
    }

    @Override
    public void danioafligido() {
        System.out.println("INFRINGE 20 DE SALUD");
    }
}
