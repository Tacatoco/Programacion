package tema8;

import java.util.Date;

public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private int idCasa;
    private int anyoCurso;
    private Date fechaNacimiento;

    // Constructor
    public Estudiante(int idEstudiante, String nombre, String apellido, int idCasa, int anyoCurso, Date fechaNacimiento) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCasa = idCasa;
        this.anyoCurso = anyoCurso;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Estudiante() {

    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public int getAnyoCurso() {
        return anyoCurso;
    }

    public void setAnyoCurso(int anyoCurso) {
        this.anyoCurso = anyoCurso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método toString para representar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idCasa=" + idCasa +
                ", anyoCurso=" + anyoCurso +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
