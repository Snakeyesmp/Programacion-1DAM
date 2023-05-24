
import java.util.ArrayList;

import java.sql.ResultSet;

/**
 * Clase encargada de gestionar los equipos.
 * Puente entre los programas del usuario y la BD.
 * 
 * @author Encarna Sánchez Gallego
 */
public class EquipoManager {
    private static ArrayList<Equipo> listaEquipos = new ArrayList<>();

    public static void InitEquipoManager() {
        listaEquipos = new ArrayList<>();
        ActualizarEquipos();
    }

    public static void AddEquipo(String nombre, String ciudad) {
        dbConnector.AddEquipo(nombre, ciudad);
        ActualizarEquipos();
    }

    public static void EliminarEquipo(int id) {
        dbConnector.RemoveEquipo(id);
        ActualizarEquipos();
    }

    public static Equipo GetEquipo(int id) {
        Equipo eq = GetEquipoFromDB(id);

        if (eq == null) {
            System.err.println("No se ha podido recuperar el equipo.");
        }
        return eq;
    }

    public static ArrayList<Equipo> GetListaEquipos() {
        return listaEquipos;
    }

    public static void ModNombreEquipo(int id, String nuevoNombre) {
        dbConnector.ModNombreEquipo(id, nuevoNombre);
        ActualizarEquipos();
    }

    public static void ModCiudadEquipo(int id, String nuevaCiudad) {
        dbConnector.ModCiudadEquipo(id, nuevaCiudad);
        ActualizarEquipos();
    }

    private static void ActualizarEquipos() {
        listaEquipos.clear();

        ResultSet equipos = dbConnector.ObtenerEquipos();

        try {
            while (equipos.next()) {
                Equipo eq = GetEquipoFromDB(equipos.getInt("id"));

                if (eq == null) {
                    System.err.println("Ha ocurrido un error al actualizar los equipos.");
                    return;
                }

                listaEquipos.add(eq);

            }
        } catch (Exception e) {
            System.err.println("No ha podido actualizar la lista de equipos.");
            return;
        }

    }

    private static Equipo GetEquipoFromDB(int id) {

        ResultSet datosEquipo = dbConnector.ObtenerEquipoByID(id);

        try {
            datosEquipo.next();
            String nombre = datosEquipo.getString("nombre");
            String ciudad = datosEquipo.getString("ciudad");

            Equipo eq = new Equipo(id, nombre, ciudad);

            return eq;

        } catch (Exception e) {
            System.err.println("No se ha podido obtener el equipo con ID " + id);
            return null;
        }
    }

}
