import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String numero = scanner.nextLine();

        BufferedReader lectorPi = new BufferedReader(
                new FileReader("E:\\Ficheros\\src\\ParteB\\Documentos\\pi-million.txt"));
        String linea;
        int lineaActual = 1;
        boolean encontrado = false;

        while ((linea = lectorPi.readLine()) != null) {
            if (linea.contains(numero)) {
                System.out.println("El número " + numero + " se encuentra en la línea " + lineaActual
                        + " del archivo pi-million.txt.");
                encontrado = true;
                break;
            }
            lineaActual++;
        }

        if (!encontrado) {
            System.out.println("El número " + numero + " no se encuentra en los primeros millones de decimales de pi.");
        }

        lectorPi.close();
        scanner.close();
    }
}
