package tema8;

public class Asignatura {
    private int id_asignatura;
    private String nombre;
    private String aula;
    private boolean obligatoria;

    // Constructor vacío
    public Asignatura() {}

    // Constructor con parámetros
    public Asignatura(int id_asignatura, String nombre, String aula, boolean obligatoria) {
        this.id_asignatura = id_asignatura;
        this.nombre = nombre;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }

    // Getters y Setters
    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

    @Override
    public String toString() {
        return "Asignatura" +
                "id_asignatura=" + id_asignatura +
                ", nombre='" + nombre + '\'' +
                ", aula='" + aula + '\'' +
                ", obligatoria=" + obligatoria;
    }
}
