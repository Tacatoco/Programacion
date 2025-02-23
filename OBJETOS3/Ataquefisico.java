package OBJETOS3;

public class Ataquefisico implements Ataque{
    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE FISICO");
    }

    @Override
    public void coste() {
        System.out.println("CUESTA 20€ EL ATAQUE FISICO");
    }

    @Override
    public void danioafligido() {
        System.out.println("INFRINGE 40 DE SALUD");
    }
}


