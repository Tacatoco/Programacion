public class Libro {
   private  String ISBN;
   private  String nombre = "";
   private  String autor = "";
   private int numeropaginas;
   private String genero;
   private String formato;

    public Libro(String ISBN, String nombre, String autor, int numeropaginas, String genero, String formato) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.genero = genero;
        this.formato = formato;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int pesolibro(){
        int pesolibrog = 0;
        if (formato.equals("DURA")){
            pesolibrog = (numeropaginas * 2) + 50;
        } else if (formato.equals("BLANDA")) {
            pesolibrog = (numeropaginas * 2) + 20;
        } else if (formato.equals("BOLSILLO")) {
              pesolibrog = numeropaginas + 10;
        }
        return pesolibrog;
    }


}
