
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Encarna Sánchez Gallego
 */
public class GestionFutbol {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        dbConnector.InitDbConnection();
        EquipoManager.InitEquipoManager();

        MostrarMenu();
    }

    public static void MostrarMenu() {
        System.out.println("Selecciona una opción: ");
        System.out.println("1.- Mostrar equipos.");
        System.out.println("2.- Añadir equipo.");
        System.out.println("3.- Eliminar equipo.");
        System.out.println("4.- Modifcar el nombre de un equipo.");
        System.out.println("5.- Modifcar la ciudad de un equipo.");
        System.out.println("6.- Salir");

        ElegirOpcion();

    }

    public static void ElegirOpcion() {
        System.out.print("Opción: ");
        int op = -1;

        try {
            op = sc.nextInt();
        } catch (Exception e) {
            System.err.println("Se debe introducir el número de la opción.");
            sc.nextLine();
            ElegirOpcion();
        }

        // Limpiamos la entrada.
        sc.nextLine();

        switch (op) {
            case 1: {
                MostrarEquipos();
                break;
            }
            case 2: {
                AddEquipo();
                break;
            }
            case 3: {
                EliminarEquipo();
                break;
            }
            case 4: {
                ModificarNombreEquipo();
                break;
            }
            case 5: {
                ModificarCiudadEquipo();
                break;
            }
            case 6: {
                return;
            }
            default: {
                System.out.println("La opción seleccionada no es válida.");
                MostrarMenu();
            }
        }

        MostrarMenu();

    }

    public static void MostrarEquipos() {
        ArrayList<Equipo> equipos = EquipoManager.GetListaEquipos();

        System.out.println("Lista de equipos: ");
        for (Equipo eq : equipos) {
            System.out.println("\t" + eq.toString());
        }
    }

    public static void AddEquipo() {
        System.out.println("Añade un nuevo equipo.");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();

        EquipoManager.AddEquipo(nombre, ciudad);
    }

    public static void EliminarEquipo() {
        System.out.println("Elimina un equipo.");
        System.out.print("Introduce el ID del equipo a eliminar: ");
        int id = sc.nextInt();

        EquipoManager.EliminarEquipo(id);

        // Limpiamos el Scanner.
        sc.nextLine();

    }

    public static void ModificarNombreEquipo() {
        System.out.println("Modifica el nombre de un equipo..");
        System.out.print("Introduce el ID del equipo a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        EquipoManager.ModNombreEquipo(id, nuevoNombre);
    }

    public static void ModificarCiudadEquipo() {
        System.out.println("Modifica la ciudad de un equipo..");
        System.out.print("Introduce el ID del equipo a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva Ciudad: ");
        String nuevaCiudad = sc.nextLine();

        EquipoManager.ModCiudadEquipo(id, nuevaCiudad);
    }

}
