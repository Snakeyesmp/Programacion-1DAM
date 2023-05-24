package Frontend;

import gestorclientes.Cliente;
import gestorclientes.GestorClientes;
import java.util.Scanner;

/**
 *
 * @author Encarna Sánchez Gallego
 */
public class TextApp
{


    public TextApp(GestorClientes gc)
    {
        this.gc = gc;
        sc = new Scanner(System.in);
        
        MostrarMenu();
    }
    
    
    public void MostrarMenu()
    {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Listar Clientes.");
        System.out.println("2. Nuevo Cliente.");
        System.out.println("3. Modificar Cliente.");
        System.out.println("4. Eliminar Cliente.");
        System.out.println("5. Salir.");
        ElegirOpcion();
    }
    
    public void ElegirOpcion()
    {
        int op = sc.nextInt();
        switch (op)
        {
            case 1:
            {
                ListarClientes();
                break;
            }
            case 2:
            {
                AddCliente();
                break;
            }
            case 3:
            {
                ModCliente();
                break;
            }
            case 4:
            {
                RemoveCliente();
                break;
            }
            case 5:
            {
                return;
            }
            default:
            {
                System.out.println("La opción seleccionada no es válida."
                    + "\nVuelva a intentarlo.");
                MostrarMenu();
            }
        }
    }
    
    private void ListarClientes()
    {
        System.out.println("\nLista de clientes:");
        for(Cliente c : gc.getMapaClientes().values())
        {
            System.out.println(c);
        }
        System.out.println();
        MostrarMenu();
    }
    
    private void AddCliente()
    {
        //Limpiamos entrada.
        sc.nextLine();
        
        System.out.println("\nAñadir un nuevo cliente.");
        System.out.println("Indica el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Indica la dirección: ");
        String direcc = sc.nextLine();
        
        gc.AddCliente(nombre, direcc);
        
        MostrarMenu();
    }
    
    private void ModCliente()
    {
        //Limpiamos entrada.
        sc.nextLine();
        
        System.out.println("\nModificar los datos de un cliente.");
        System.out.println("Indica el ID del cliente a modificar: ");
        int id = sc.nextInt();
        //Limpiamos entrada.
        sc.nextLine();
        System.out.println("Nuevo nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Nueva dirección: ");
        String direcc = sc.nextLine();
        
        gc.ModificarCliente(id, nombre, direcc);
        
        MostrarMenu();
    }
    
    private void RemoveCliente()
    {
        //Limpiamos entrada.
        sc.nextLine();
        
        System.out.println("\nElimina a un cliente.");
        System.out.println("Indica el ID del cliente a eliminar: ");
        int id = sc.nextInt();
        
        gc.EliminarCliente(id);
        
        MostrarMenu();
    }
    
    GestorClientes gc;
    Scanner sc;
}
