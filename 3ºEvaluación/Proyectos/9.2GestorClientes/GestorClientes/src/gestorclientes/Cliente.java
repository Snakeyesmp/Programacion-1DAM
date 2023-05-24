package gestorclientes;

/**
 * Clase base de Cliente. Contiene todos los datos del mismo.
 * 
 * @author Encarna Sánchez Gallego
 */
public class Cliente {

    public Cliente() {
        this.id = -1;
        this.nombre = "NULL";
        this.Direccion = "NULL";
    }

    public Cliente(int id, String nombre, String Direccion) {
        this.id = id;
        this.nombre = nombre;
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        String str = "Cliente " + id;
        str += "\tNombre: " + nombre;
        str += "\tDirección: " + Direccion;
        return str;
    }

    public int id;
    public String nombre;
    public String Direccion;
}
