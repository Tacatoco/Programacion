import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {
    private Map<String, Usuario> listausuarios;
    private String DNI;

    public Gimnasio() {
        this.listausuarios = new HashMap<>();
        this.DNI = "12345678D";
    }

    public Map<String, Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(Map<String, Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


    public void anadirusuarios(String DNIusu, String nombreusu, int edadusu){
      if (listausuarios.containsKey(DNIusu)){
          System.out.println("ESTE USUARIO YA SE ENCUENTRA EN EL GIMNASIO");
      }
      else listausuarios.put(DNIusu, new Usuario(nombreusu, edadusu));
    }

    public void dardebajausuarios(String DNIusu){
        if (listausuarios.containsKey(DNIusu)){
            listausuarios.remove(DNIusu);
            System.out.println("USUARIO ELIMINADO");
        }
        else System.out.println("NO SE ENCUENTRA EL USUARIO SELECCIONADO");
    }

    public void mostrardatosusu(String DNIusu){
        if (listausuarios.containsKey(DNIusu)){
            Usuario usuario1 = listausuarios.get(DNIusu);
            System.out.println("NOMBRE: " + usuario1.getNombre());
            System.out.println("EDAD: " + usuario1.getEdad());
        }
        else System.out.println("NO EXISTE EL USUARIO MENCIONADO");
    }

    public void modificarusuario (String DNIusu){
        Scanner scanner = new Scanner(System.in);
        if (listausuarios.containsKey(DNIusu)){
            Usuario usuario1 = listausuarios.get(DNIusu);
            System.out.println("QUE QUIERES MODIFICAR: NOMBRE O EDAD");
            String elecusu = scanner.next();
            elecusu = elecusu.toUpperCase().trim();

            switch (elecusu){
                case "NOMBRE":{
                    System.out.println("NOMBRE...");
                    String nuevonombre = scanner.next();
                    usuario1.setNombre(nuevonombre);
                    break;
                }
                case "EDAD":{
                    System.out.println("EDAD...");
                    int nuevaedad = scanner.nextInt();
                    usuario1.setEdad(nuevaedad);
                    break;
                }
                default:{
                    System.out.println("OPCIÓN INCORRECTA");
                    break;
                }
            }
        }
        else System.out.println("NO EXISTE EL USUARIO MENCIONADO");
    }



}
