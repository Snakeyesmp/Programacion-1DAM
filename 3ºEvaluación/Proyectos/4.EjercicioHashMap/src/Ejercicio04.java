import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 4.-Almacena en un HashMaplos códigos y descripciones de los 5 primeros pokemon.
 * a. Muestra por pantalla los datos almacenados
 * b. Pide un código y muestra el nombre del pokemon
 * c. Lista solo los nombres de todos los pokemon
 */

public class Ejercicio04 {
    public static void main(String[] args) {

        Map<Integer, String> pokedex = new HashMap<>();

        // SE CREA UN MAPA CON LOS 5 PRIMEROS POKEMON
        pokedex.put(001, "Bulbasur");
        pokedex.put(002, "Ivysaur");
        pokedex.put(003, "Venusaur");
        pokedex.put(004, "Charmander");
        pokedex.put(005, "Charmeleon");

        // pokedex.values().remove("Ivysaur"); CODIGO PARA ELIMINAR EN UN MAPA
        // UTILIZANDO EL VALOR EN VEZ DE LA CLAVE
        // SE IMPRIMEN LOS 5 PRIMEROS POKEMON
        System.out.println(pokedex);

        Scanner sc = new Scanner(System.in);
        int numPokedex = sc.nextInt();

        System.out.println("El pokemon con ese numero es: " + pokedex.get(numPokedex));

        System.out.println(pokedex.values());    
    }
}
