package Frontend;

import gestorclientes.GestorClientes;
import javax.swing.JOptionPane;
/**
 *
 * @author Encarna Sánchez Gallego
 */
public class EntryPoint
{
    public static void main(String[] args)
    {
        GestorClientes gc = new GestorClientes();
        if(gc.isActivado())
        {
            System.out.println("Conexión correcta... OK");
            
            //TextApp app = new TextApp(gc);
            AppFrame.main(gc);
        }
        else
        {
            System.out.println("No se ha podido conectar...");
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la BD", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
