package OBJETOS3;

public class Revistas extends Ficha{
    private int numpubli, anio;

    public Revistas(int numero, String titulo, int numpubli, int anio) {
        super(numero, titulo);
        this.numpubli = numpubli;
        this.anio = anio;
    }

    public int getNumpubli() {
        return numpubli;
    }

    public void setNumpubli(int numpubli) {
        this.numpubli = numpubli;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void quenumpubli(){
        System.out.println("EL NUMERO DE PUBLICACION DE LA REVISTA ES: " + numpubli);
    }

    public void queanio(){
        System.out.println("EL AÑO DE PUBLICACION DE LA REVISTA ES: " + anio);
    }


}
