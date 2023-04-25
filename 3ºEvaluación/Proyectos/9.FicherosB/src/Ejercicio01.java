import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Implementa un programa que muestre por pantalla los valores máximos y mínimos
 * del archivo ‘numeros.txt’.
 */
public class Ejercicio01 {
    public static void main(String[] args) {

        File archNumeros = new File("Documentos/numeros.txt");
        int numMax = 0, numMin = 999999999;

        try {
            // Scanner en el archivo en el que se encuentran los numeros
            Scanner sc = new Scanner(archNumeros);

            while (sc.hasNextInt()) {
                int numeroAux = sc.nextInt();
                if (numeroAux > numMax) {
                    numMax = numeroAux;
                }
                if (numeroAux < numMin) {
                    numMin = numeroAux;
                }
            }

            sc.close();

            System.out.println("Valor máximo: " + numMax);
            System.out.println("Valor mínimo: " + numMin);

        } catch (FileNotFoundException e) {
            // Excepcion en caso de que el archivo especificado en la ruta no se encuentre
            System.out.println("El archivo no se ha encontrado");
        }
    }

}
