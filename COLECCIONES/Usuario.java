package COLECCIONES;

public class Usuario {
    private String nombre;
    private int edad;
    private String DNI;

    public Usuario(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(){
        this.DNI = DNI;
    }

}