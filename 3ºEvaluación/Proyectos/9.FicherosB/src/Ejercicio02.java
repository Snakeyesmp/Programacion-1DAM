import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas
 * que han obtenido en cada asignatura. El número de asignaturas de cada alumno
 * es variable. Implementa un programa que muestre por pantalla la nota media de
 * cada alumno junto a su nombre y apellido, ordenado por nota media de mayor a
 * menor.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        String nombre, apellido, linea; // Creaciones de variables String
        double media, suma; // Creaciones de las variables de tipo double

        try {
            File fichero = new File("Documentos/alumnos_notas.txt"); // Se crea un fichero con el archivo con las notas
            Scanner lector = new Scanner(fichero); // Se crea un scanner para el fichero creado
            do {
                media = 0;
                suma = 0;
                linea = lector.nextLine(); // Variable que contenga la linea del scanner
                String parte[] = linea.split(" "); // Se divide el String en 2, teniendo en cuenta el
                                                   // espacio(Nombre,apellido)
                nombre = parte[0]; // Primera parte antes del espacio(Nombre)
                apellido = parte[1]; // Segunda parte después de espacio(Apellido)

                String nombreCompleto= nombre + " " + apellido;

                for (int i = 2; i < parte.length; i++) { // For a partir del segundo split, para no contar el nombre y
                                                         // el apellido

                    int numero = Integer.valueOf(parte[i]); // se coge el numero de cada split
                    suma = suma + numero; // Se va sumando el numero de cada split

                }
                media = suma / (parte.length - 2); // Se hace la media, contando la cantidad de splits que hay y
                                                   // restando 2 del nombre y del apellido

                System.out.println(
                        "Nombre completo : " + nombreCompleto + "\nNota media: " + df.format(media) + "\n"); // Se imprime el nombre del alumno junto a su nota

            } while (lector.hasNextLine());
            lector.close();

        } catch (FileNotFoundException ex) {
            System.err.println("ERROR. La ruta no existe"); 
        }
    }
}