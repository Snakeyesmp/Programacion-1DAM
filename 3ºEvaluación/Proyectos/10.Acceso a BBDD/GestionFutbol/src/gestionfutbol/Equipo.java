
/**
 * Contiene todos los datos de un equipo.
 * 
 * @author Encarna Sánchez Gallego
 */
public class Equipo {
    private final int id;
    private final String nombre;
    private final String ciudad;

    public Equipo(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String rs = "Equipo " + id + " - " + nombre + " , ciudad: " + ciudad;
        return rs;
    }

}
