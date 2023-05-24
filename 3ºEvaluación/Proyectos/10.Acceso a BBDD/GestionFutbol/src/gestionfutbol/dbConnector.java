import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Clase estática que permite al "frontend" de un programa comunicarse con la
 * DB.
 * 
 * @author Encarna Sánchez Gallego
 */
public class dbConnector {
    private final static String dbName = "futbol";
    // private final static String tableName = "clientes";

    private final static String mensajeErrorGenerico = "No se ha podido interactuar con la BD.";

    public static void InitDbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/futbol";
            connect = DriverManager.getConnection(url, "root", "admin123@");

            Statement stt = null;
            try {
                stt = connect.createStatement();
                stt.execute("use " + dbName + ";");
            } catch (Exception e) {
                System.err.println("No ha sido posible comunicarse con la BD.");
                return;
            }

            // CerrarStatement(stt);
        } catch (Exception e) {
            System.err.println("No se ha podido cargar el Driver de MySQL.");
            return;
        }

    }

    public static ResultSet ObtenerEquipoByID(int id) {

        Statement stt = CrearStatatement();

        ResultSet data = null;
        try {
            data = stt.executeQuery("select * from equipos where id = " + id + ";");
        } catch (Exception e) {
            System.err.println(mensajeErrorGenerico);
        }

        // CerrarStatement(stt);

        return data;
    }

    public static void AddEquipo(String nombre, String ciudad) {

        Statement stt = CrearStatatement();

        try {
            stt.execute("insert into equipos (nombre, ciudad) values ('" + nombre + "', '" + ciudad + "');");
        } catch (Exception e) {
            System.err.println("Error al añadir equipo...");
        }

        // CerrarStatement(stt);
    }

    public static void RemoveEquipo(int id) {

        Statement stt = CrearStatatement();

        try {
            stt.execute("delete from equipos where id = " + id + ";");
        } catch (Exception e) {
            System.err.println(mensajeErrorGenerico);
        }

        // CerrarStatement(stt);
    }

    public static void ModNombreEquipo(int id, String nuevoNombre) {

        Statement stt = CrearStatatement();

        try {
            stt.executeUpdate("update equipos set nombre='" + nuevoNombre + "' where id=" + id + ";");
        } catch (Exception e) {
            System.err.println(mensajeErrorGenerico);
        }

        // CerrarStatement(stt);
    }

    public static void ModCiudadEquipo(int id, String nuevaCiudad) {

        Statement stt = CrearStatatement();
        try {
            stt.executeUpdate("update equipos set ciudad='" + nuevaCiudad + "' where id=" + id + ";");
        } catch (Exception e) {
            System.err.println(mensajeErrorGenerico);
        }

        // CerrarStatement(stt);
    }

    public static ResultSet ObtenerEquipos() {

        Statement stt = CrearStatatement();

        String querry = "select id from equipos;";

        ResultSet data = null;
        try {
            data = stt.executeQuery(querry);
        } catch (Exception e) {
            System.err.println(mensajeErrorGenerico);
        }

        // CerrarStatement(stt);

        return data;
    }

    private static Statement CrearStatatement() {
        Statement stt = null;
        try {
            stt = connect.createStatement();
            stt.execute("use " + dbName + ";");
        } catch (Exception e) {
            System.err.println("No ha sido posible comunicarse con la BD.");
        }
        return stt;
    }

    /**
     * CUIDADO!! Al cerrar Statement, se rompen los datos de ResultSet.
     * 
     * @param sttCerrar
     */
    private static void CerrarStatement(Statement sttCerrar) {
        try {
            sttCerrar.close();
        } catch (Exception e) {
            System.err.println("No se ha podido cerrar el Statement.");
        }
    }

    private static Connection connect;

}
