package OBJETOS3;

public class Libros extends Ficha{
    private String autor, editorial;

    public Libros(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public void queautor(){
        System.out.println("EL AUTOR DEL LIBRO ES: " + autor);
    }

    public void queeditorial(){
        System.out.println("LA EDITORIAL DEL LIBRO ES: " + editorial);
    }


}
