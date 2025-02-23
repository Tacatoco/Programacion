package OBJETOS3;

public class Ataquemagicoyfis implements Ataque{
    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE MÁGICO Y FISICO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 50€ EL ATAQUE MAGICO YFISICO");
    }

    @Override
    public void danioafligido() {
        System.out.println("INFRINGE 200 DE SALUD");
    }
}


