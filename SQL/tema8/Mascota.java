package tema8;

public class Mascota {
    private String nombre;
    private String especie;
    private int idEstudiante;

    // Constructor
    public Mascota(String nombre, String especie, int idEstudiante) {
        this.nombre = nombre;
        this.especie = especie;
        this.idEstudiante = idEstudiante;
    }

    public Mascota() {

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
