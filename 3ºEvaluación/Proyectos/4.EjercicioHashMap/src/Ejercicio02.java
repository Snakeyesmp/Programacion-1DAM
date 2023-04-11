import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 2.-Programa que almacene y gestione los Nºexpediente y alumnos de la clase. Utiliza un HashMap para almacenar los datos de tus compañeros de clase.
 * a. Indica cuantos alumnos hay
 * b. Pide un Nº expediente, si existe muestra el nombre del alumno, sino indica elerror
 * c. Permite eliminar un alumno de nuestra lista
 */

public class Ejercicio02 {
    public static void main(String[] args) {

        Map<Integer, String> expedientesAlumnos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Integer numExpediente=0;
        String nombreAlumno = "";
        // Bucle para establecer un mapa con los numeros de expediente y los nombres de
        // los alumnos
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca el numero de expediente del alumno");
            numExpediente = sc.nextInt();
            System.out.println("Introduzca el nombre del alumno");
            nombreAlumno = sc.next();

            expedientesAlumnos.put(numExpediente, nombreAlumno);

        }
        // a. Imprimir el numero de alumnos que hay
        System.out.println("El total de alumnos es: " + expedientesAlumnos.size());

        System.out.println("Introduzca un numero de expediente");
        numExpediente = sc.nextInt();
        if (expedientesAlumnos.get(numExpediente) != null) {
            System.out.println("El alumno con ese número de expediente es: " +expedientesAlumnos.get(numExpediente));

        } else {
            System.out.println("No se ha encontrado ningun alumno con ese numero de expediente");
        }

        System.out.println("Introduzca el expediente del alumno que quiere borrar");
        numExpediente = sc.nextInt();

        if (expedientesAlumnos.get(numExpediente) != null) {
            expedientesAlumnos.remove(numExpediente);

        } else {
            System.out.println("No se ha encontrado ningun alumno con ese codigo de expediente");
        }

        System.out.println(expedientesAlumnos);
    }
}
