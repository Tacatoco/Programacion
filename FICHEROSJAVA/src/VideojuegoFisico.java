package EjerciciosFicheros.Videojuego;

import java.io.Serializable;
import java.util.Scanner;

public class VideojuegoFisico extends Videojuego implements Serializable {

    String tiendaCompra;
    String estado;

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado) {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "FISICO";
    }

    @Override
    public String toString() {
        return "VideojuegoFisico:" +
                "tiendaCompra='" + tiendaCompra + '\'' +
                ", estado='" + estado + '\'' +
                ", titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota;
    }
}
