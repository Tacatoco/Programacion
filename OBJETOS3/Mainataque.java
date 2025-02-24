package OBJETOS3;

public class Mainataque {
    public static void main(String[] args) {
        Ataquefisico ataqfis = new Ataquefisico();
        Ataquemagicoyfis ataqmagyfis = new Ataquemagicoyfis();
        Ataquemagico ataqmag = new Ataquemagico();

        System.out.println("ATAQUE FISICO");
        ataqfis.coste();
        ataqfis.danioafligido();
        ataqfis.lanzar();
        System.out.println();

        System.out.println("ATAQUE MAGICO");
        ataqmag.coste();
        ataqmag.danioafligido();
        ataqmag.lanzar();
        System.out.println();

        System.out.println("ATAQUE FISICO Y MAGICO");
        ataqmagyfis.coste();
        ataqmagyfis.danioafligido();
        ataqmagyfis.lanzar();
        System.out.println();
    }
}
