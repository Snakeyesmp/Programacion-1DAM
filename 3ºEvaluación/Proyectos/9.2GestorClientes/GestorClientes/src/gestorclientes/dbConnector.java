package gestorclientes;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Clase estática que permite a "frontend" del programa comunicarse con la DB.
 * 
 * @author Encarna Sánchez Gallego
 */
public class dbConnector {
    private final static String dbName = "tienda";
    private final static String tableName = "clientes";

    public static void InitDbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/tienda";
            connect = DriverManager.getConnection(url, "root", "admin123@");

            Statement stt = null;
            try {
                stt = connect.createStatement();
                stt.execute("use tienda;");
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

    public static ResultSet ObtenerClientes() {

        Statement stt = CrearStatatement();

        ResultSet data = null;
        try {
            data = stt.executeQuery("select * from " + tableName + ";");
        } catch (Exception e) {
            System.err.println("No se han podido obtener los clientes de la DB.");
        }

        // CerrarStatement(stt);

        return data;
    }

    public static boolean ActualizarCliente(int id, String nombre, String direcc) {
        Statement stt = CrearStatatement();

        String sql = "update tienda.clientes set nombre='" + nombre +
                "', direccion='" + direcc +
                "' where id='" + id + "';";
        try {
            stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println("No se ha podido actualizar los datos del cliente ID" + id);
            return false;
        }

        // CerrarStatement(stt);

        return true;
    }

    public static boolean EliminarCliente(int idCliente) {
        Statement stt = CrearStatatement();

        String sql = "delete from " + tableName + " where id=" + idCliente + ";";
        try {
            stt.execute(sql);
        } catch (Exception e) {
            System.err.println("No se ha podido eliminar al cliente ID" + idCliente);
            return false;
        }

        // CerrarStatement(stt);

        return true;
    }

    public static boolean AddCliente(String nombre, String direcc) {
        Statement stt = CrearStatatement();

        String sql = "insert into clientes(nombre, direccion) values ('"
                + nombre + "', '" + direcc + "');";
        try {
            stt.execute(sql);
        } catch (Exception e) {
            System.err.println("No se ha podido añadir el cliente: " + nombre);
            return false;
        }

        // CerrarStatement(stt);
        return true;
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
    /*
     * private static void CerrarStatement(Statement sttCerrar)
     * {
     * try
     * {
     * sttCerrar.close();
     * }
     * catch (Exception e)
     * {
     * System.err.println("No se ha podido cerrar el Statement.");
     * }
     * }
     */

    private static Connection connect;

}
