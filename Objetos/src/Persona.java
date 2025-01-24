public class Persona {
    private static final String dni = "";
    private String nombre;
    private String apellidos;
    private int edad;
    private final static int adultAge = 18;
    private final static int retiredAge = 65;


    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void print() {
        String printear = "EDAD: " + this.edad + " NOMBRE:" + this.nombre + " APELLIDOS" + this.apellidos + " DNI" + this.dni;
        System.out.println(printear);
    }

    public void isAdult(){
        if (this.edad >= adultAge){
            System.out.println("MAYOR DE EDAD");
        }
    }

    public void isRetired(){
        if (this.edad >= retiredAge){
            System.out.println("ES JUBILADO");
        }
    }

    public void ageDifference(Persona josema){
        int diferencia = 0;

        if (josema.edad > this.edad){
            diferencia = josema.edad - this.edad;
            System.out.println("LA DIFERENCIA DE EDAD ES: " + diferencia);
        } else if (this.edad > josema.edad) {
            diferencia = this.edad - josema.edad;
            System.out.println("LA DIFERENCIA DE EDAD ES: " + diferencia);
        }
    }










}
