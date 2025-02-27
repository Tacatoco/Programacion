public class Articulo {
   private String nombre;
   private boolean gratis;
   private int precioart;

    public int getPrecioart() {
        return precioart;
    }

    public void setPrecioart(int precioart) {
        this.precioart = precioart;
    }

    public Articulo(String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public Articulo() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }

    public String tipoarticulo() {
        return "";
    }

    public int precioarticulo(){
        return precioarticulo();
    }



}
