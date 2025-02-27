import java.util.ArrayList;
import java.util.List;

public class Pocion extends Articulo{
    int nivel;
     ArrayList efectos;

    public Pocion(String nombre, boolean gratis) {
        super(nombre, gratis);
    }

    public Pocion(String nombrepoti, boolean esgratis, int nivelusu, ArrayList efectos) {
        super();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList getEfectos() {
        return efectos;
    }

    public void setEfectos(ArrayList efectos) {
        this.efectos = efectos;
    }
}
