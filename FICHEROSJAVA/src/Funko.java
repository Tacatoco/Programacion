package EjerciciosFicheros;

import javax.print.DocFlavor;

public class Funko {
   private String cod;
   private String nombre;
   private String modelo;
   private double precio;
   private String fecha_lanzamiento;


    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Funko(String cod, double precio, String modelo, String nombre, String fecha_lanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fecha_lanzamiento='" + fecha_lanzamiento + '\'' +
                '}';
    }
}

