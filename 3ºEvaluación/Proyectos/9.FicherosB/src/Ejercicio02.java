import java.io.File;
import java.io.FileNotFoundException;
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

        File notasAlumnos = new File("documentos/alumnos_notas.txt");

        try {

            Scanner sc = new Scanner(notasAlumnos);
            double notaSuma = 0;
            double notaMedia = 0;
            int numNotas = 0;

            while (sc.hasNextInt()) {
                notaSuma = notaSuma + sc.nextInt();
                System.out.println(notaSuma);
                numNotas++;
            }

            notaMedia = (notaSuma / numNotas);

            System.out.println(notaMedia);

            sc.close();

        } catch (FileNotFoundException e) {

            System.out.println("El archivo no se ha encontrado");
        }

    }
}
