import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1.-Almacena en un HashMap los códigos postales de las provincias de la Comunidad Valenciana, Cataluña y Aragón. 
 * a. Muestra por pantalla los datos introducidos 
 * b. Pide un código postal y muestra la provincia asociada si existe sino avisa al usuario
 * c. Elimina las provincias Barcelona, Alicante y Zaragoza 
 * d. Muestra por pantalla los datos
 */

public class Ejercicio01 {

    public static void main(String[] args) {

        Map<Integer, String> codigosPostales = new HashMap<>();

        codigosPostales.put(46001, "Valencia");
        codigosPostales.put(46002, "Alicante");
        codigosPostales.put(47001, "Zaragoza");
        codigosPostales.put(47002, "Teruel");
        codigosPostales.put(48001, "Barcelona");
        codigosPostales.put(48002, "Tarragona");
        // Se muestran por pantalla los datos introducidos
        System.out.println(codigosPostales);

        // Se pide un codigo postal y se muestra la provincia asociada, si no se avisa
        // al usuario
        Scanner sc = new Scanner(System.in);
        int codPostal = sc.nextInt();
        codigosPostales.get(codPostal);

        if (codigosPostales.get(codPostal) != null) {
            System.out.println("La provincia asociada es: " + codigosPostales.get(codPostal));

        } else {
            System.out.println("No se ha encontrado una provincia asociada a ese código postal");
        }
        
        // Eliminar las provincias Barcelona,Alicante y Zaragoza

        codigosPostales.remove(48001); // Borrar Barcelona
        codigosPostales.remove(46002); // Borrar Alicante
        codigosPostales.remove(47001); // Borrar Zaragoza
        
        // Volver a mostrar los datos de pantalla
        System.out.println(codigosPostales);
    }
}
