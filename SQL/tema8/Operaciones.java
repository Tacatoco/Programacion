package tema8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class Operaciones {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean compwhile = false;
        loadDatabaseProperties();
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        while (!compwhile) {
            System.out.println(
                    "0 → Salir\n" +
                            "1 → Consultar estudiantes por casa\n" +
                            "2 → Obtener la mascota de un estudiante específico\n" +
                            "3 → Obtener el número de estudiantes por casa\n" +
                            "4 → Insertar una nueva asignatura\n" +
                            "5 → Modificar el aula de una asignatura\n" +
                            "6 → Eliminar una asignatura\n" +
                            "7 → Listar todas las asignaturas\n");

            int elecusu = sc.nextInt();

            switch (elecusu) {
                case 0:
                    compwhile = true;
                    conn.close();
                    System.out.println("Conexión cerrada. ¡Hasta luego!");
                    break;
                case 1:
                    ejer1(conn);
                    break;
                case 2:
                    ejer2(conn);
                    break;
                case 3:
                    ejer3(conn);
                    break;
                case 4:
                    ejer4(conn);
                    break;
                case 5:
                    ejer5(conn);
                    break;
                case 6:
                    ejer6(conn);
                    break;
                case 7:
                    mostrarasignaturas(conn);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void loadDatabaseProperties() {
        Properties properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get("db.properties"))) {
            properties.load(input);
            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.password");
        } catch (IOException ex) {
            System.err.println("Error al cargar el archivo de propiedades: " + ex.getMessage());
        }
    }

    public static void mostrarasignaturas(Connection conn) {
        ArrayList<Asignatura> listaasig = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM asignatura");

            while (result.next()) {
                Asignatura asig = new Asignatura();
                asig.setId_asignatura(result.getInt("id_asignatura"));
                asig.setNombre(result.getString("nombre"));
                asig.setAula(result.getString("aula"));
                asig.setObligatoria(result.getBoolean("obligatoria"));
                listaasig.add(asig);
            }

            for (Asignatura asig : listaasig) {
                System.out.println(asig.toString());
            }

            result.close();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejer1(Connection conn) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> listaest = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            System.out.println("¿DE QUÉ CASA QUIERES AVERIGUAR LOS ESTUDIANTES? (Introduce ID de casa)");
            int casausu = sc.nextInt();
            ResultSet result = st.executeQuery("SELECT nombre, apellido from Estudiante where id_casa = " + casausu);

            while (result.next()) {
                Estudiante est = new Estudiante();
                est.setNombre(result.getString("nombre"));
                est.setApellido(result.getString("apellido"));
                listaest.add(est);
            }

            for (Estudiante est : listaest) {
                System.out.println(est.getNombre() + " " + est.getApellido());
            }

            result.close();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejer2(Connection conn) {
        Scanner sc = new Scanner(System.in);
        try {
            Statement st = conn.createStatement();
            System.out.println("INTRODUCE EL ID DEL ESTUDIANTE PARA SABER SU MASCOTA:");
            int mascotausu = sc.nextInt();
            ResultSet result = st.executeQuery("SELECT nombre from Mascota where id_estudiante = " + mascotausu);

            while (result.next()) {
                Mascota masc = new Mascota();
                masc.setNombre(result.getString("nombre"));
                System.out.println(masc.getNombre());
            }

            result.close();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejer3(Connection conn) {
        ArrayList<Estudiante> estudiantesg = new ArrayList<>();
        ArrayList<Estudiante> estudiantess = new ArrayList<>();
        ArrayList<Estudiante> estudiantesh = new ArrayList<>();
        ArrayList<Estudiante> estudiantesr = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery("SELECT nombre, id_casa from Estudiante");
            while (result.next()) {
                Estudiante est = new Estudiante();
                est.setNombre(result.getString("nombre"));
                est.setIdCasa(result.getInt("id_casa"));
                switch (est.getIdCasa()) {
                    case 1:
                        estudiantesg.add(est);
                        break;
                    case 2:
                        estudiantesh.add(est);
                        break;
                    case 3:
                        estudiantesr.add(est);
                        break;
                    case 4:
                        estudiantess.add(est);
                        break;
                }
            }

            System.out.println("GRYFFINDOR: " + estudiantesg.size() + " estudiantes");
            System.out.println("HUFFLEPUFF: " + estudiantesh.size() + " estudiantes");
            System.out.println("RAVENCLAW: " + estudiantesr.size() + " estudiantes");
            System.out.println("SLYTHERIN: " + estudiantess.size() + " estudiantes");

            result.close();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejer4(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE DE LA ASIGNATURA:");
        String nombreusu = sc.nextLine();

        System.out.println("AULA DE LA ASIGNATURA:");
        String aulausu = sc.nextLine();

        System.out.println("¿ES OBLIGATORIA? SI → 1 | NO → 2");
        int obliga = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        boolean obligatoria = (obliga == 1);

        String query = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";

        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, nombreusu);
            pst.setString(2, aulausu);
            pst.setBoolean(3, obligatoria);
            int rowsAffected = pst.executeUpdate();
            System.out.println("Asignatura insertada correctamente.");
        }
    }

    public static void ejer5(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE EL ID DE LA ASIGNATURA:");
        int asigusu = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        System.out.println("INTRODUCE LA NUEVA AULA:");
        String aulausu = sc.nextLine();

        String consulta = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";
        try (PreparedStatement prueba = conn.prepareStatement(consulta)) {
            prueba.setString(1, aulausu);
            prueba.setInt(2, asigusu);
            int rowsAffected = prueba.executeUpdate();
            System.out.println("Aula modificada correctamente.");
        }
    }

    public static void ejer6(Connection conn) {
        Scanner sc = new Scanner(System.in);
        String consulta = "DELETE FROM Asignatura WHERE nombre = ?";

        try {
            System.out.println("INTRODUCE EL NOMBRE DE LA ASIGNATURA A ELIMINAR:");
            String asigusu = sc.nextLine();
            PreparedStatement prueba = conn.prepareStatement(consulta);
            prueba.setString(1, asigusu);
            int rowsAffected = prueba.executeUpdate();
            System.out.println("Asignatura eliminada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
