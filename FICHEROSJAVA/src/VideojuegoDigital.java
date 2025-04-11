package EjerciciosFicheros.Videojuego;

import java.io.Serializable;

public class VideojuegoDigital extends Videojuego implements Serializable {

    String tiendaOnline;
    double tamanyoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota,String tiendaOnline, double tamanyoGB) {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanyoGB = tamanyoGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }

    public double getTamanyoGB() {
        return tamanyoGB;
    }

    public void setTamanyoGB(double tamanyoGB) {
        this.tamanyoGB = tamanyoGB;
    }

    @Override
    public String getTipo() {
        return "DIGITAL";
    }

    @Override
    public String toString() {
        return "VideojuegoDigital:" +
                "tiendaOnline='" + tiendaOnline + '\'' +
                ", tamanyoGB=" + tamanyoGB +
                ", titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota ;
    }
}
