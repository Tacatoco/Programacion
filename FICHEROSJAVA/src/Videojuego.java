package EjerciciosFicheros.Videojuego;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    String titulo;
    String plataforma;
    int nota;

    public Videojuego(String titulo, String plataforma, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws NotaInvalidaException {
        String mensaje = "LA NOTA DEBE ESTAR ENTRE 1 Y 10";
        String rutaerror = "Documentos/errores.log";

        if (nota > 0 && nota <= 10) {
            this.nota = nota;
        } else {
            // Escribir en el archivo
            try (BufferedWriter errores = new BufferedWriter(new FileWriter(rutaerror, true))) {
                errores.write(mensaje);
                errores.newLine();
            } catch (IOException en) {
                throw new RuntimeException(en);
            }


            // Lanzar la excepción
            throw new NotaInvalidaException(mensaje);
        }
    }



    public abstract String getTipo();

}
