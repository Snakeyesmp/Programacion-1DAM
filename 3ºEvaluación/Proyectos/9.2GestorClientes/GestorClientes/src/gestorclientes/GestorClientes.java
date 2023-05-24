package gestorclientes;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Sistema encargado de gestionar los clientes, tenerlos en memoria y proporcionar el acceso pertienente al frontend.
 * @author Encarna Sánchez Gallego
 */
public class GestorClientes
{
    public GestorClientes()
    {
        activado = false;
        //listaClientes = new ArrayList<Cliente>();
        mapaClientes = new LinkedHashMap<>();
        
        dbConnector.InitDbConnection();
        //Quizás cargamos todos los clientes ya en memoria?
        
        DB_ObtenerClientes();
    }

    public HashMap<Integer, Cliente> getMapaClientes()
    {
        return mapaClientes;
    }
    
    
    /***
     * Permite añadir un clientea la DB.
     * Tras eso, se debe actualizar la lista local de clientes.
     * @param nombre Nombre del nuevo cliente.
     * @param direcc Dirección del cliente a añadir.
     */
    public void AddCliente(String nombre, String direcc)
    {
        if(!dbConnector.AddCliente(nombre, direcc))
        {
            System.err.println("No se ha podido añadir el cliente: " + nombre);
            return;
        }
        DB_ObtenerClientes();
    }
    
    
    /***
     * Permite eliminar al cliente de DB.
     * Tras eso, elimina al cliente con ese ID de la lista local.
     * @param idCliente ID del cliente a eliminar.
     */
    public void EliminarCliente(int idCliente)
    {
        if(!dbConnector.EliminarCliente(idCliente))
        {
            System.err.println("No se ha podido eliminar al cliente con ID: " + idCliente);
            return;
        }
        mapaClientes.remove(idCliente);
    }
    
    
    /***
     * Permite modificar los datos del cliente con ID indicado.
     * @param id ID del cliente a modificar.
     * @param nombre Nuevo nombre para el cliente.
     * @param direcc Nueva dirección para el cliente.
     */
    public void ModificarCliente(int id, String nombre, String direcc)
    {
        if(!dbConnector.ActualizarCliente(id, nombre, direcc))
        {
            System.err.println("No se ha podido actualizar los datos del cliente con ID: " + id);
            return;
        }
        
        //Modificamos el cliente también en local.
        Cliente cli = mapaClientes.get(id);
        cli.nombre = nombre;
        cli.Direccion = direcc;
        
        mapaClientes.put(id, cli);
    }
    
    
    
    /***
     * Llama al sistema de comunicación con la base de datos, 
     * obtiene los clientes y los añade al ArrayList.
     */
    private void DB_ObtenerClientes()
    {
        //Limpiamos los datos del ArrayList actual.
        mapaClientes.clear();
        
        ResultSet clientes = dbConnector.ObtenerClientes();
        if(clientes == null)
        {
            return;
        }
        
        try
        {
            while(clientes.next())
            {
                int id = clientes.getInt(1);
                String nombre = clientes.getString(2);
                String direcc = clientes.getString(3);
                
                Cliente cl = new Cliente(id, nombre, direcc);
                
                mapaClientes.put(id, cl);
            }
        } 
        catch (Exception e)
        {
            System.err.println("No ocurrido un error al cargar los datos.");
        }
        activado = true;
        
    }

    public boolean isActivado()
    {
        return activado;
    }
    
    
    
    
    // ToDo: Se podría cambiar el ArrayList 
    //  por un HashMap en que los datos estuvieran ordenador por su ID.
    //      De esta forma, sería más sencillo modificarlo en local 
    //      sin volver a cargar toda la lista desde la BD.
    //private ArrayList<Cliente> listaClientes;
    
    //Utilizamos un LinkedHashMap para mantener el orden de inserción de los datos.
    private LinkedHashMap<Integer, Cliente> mapaClientes;
    private boolean activado;
    
}
