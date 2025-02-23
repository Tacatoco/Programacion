package OBJETOS3;

public class DVDs extends Ficha{
    private String director;
    private int anio,tipo;

    public DVDs(int numero, String titulo, int tipo, int anio, String director) {
        super(numero, titulo);
        this.tipo = tipo;
        this.anio = anio;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void queDirector() {
        System.out.println("EL DIRECTOR DEL DVD ES: " + director);
    }

    public void queAnio() {
        System.out.println("EL AÑO DE LANZAMIENTO DEL DVD ES: " + anio);
    }

    public void queTipo() {
        System.out.println("EL GÉNERO DEL DVD ES: " + tipo);
    }




}
