import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3.-Programa que implemente una lista de NIF y nombre y apellidos de trabajadores. Crea un menú que permita:
 * a. Introducir un trabajador, controlar reacción ante los duplicados
 * b. Buscar un trabajador por NIF, si existe mostrar su nombre y sino avisarlo
 * c. Buscar un trabajador por nombre, si existe mostrar su NIF y sino avisarlo
 * d. Modificar trabajador,controlar si existe, en caso que sí, se deberá borrar el existente y volverlo a crear con los nuevos datos.
 * e. Borrar trabajador
 */

public class Ejercicio03 {
    public static void main(String[] args) {

        int opcion;
        String nombre, nif = "";
        Map<String, String> trabajadoresMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    "\n \n 1. Introducir un trabajador \n 2. Buscar un trabajador por NIF \n 3. Buscar un trabajador por nombre \n 4. Modificar trabajador \n 5. Borrar trabajador \n 0. Salir del programa ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el DNI");
                    nif = sc.next();
                    System.out.println("Introduzca el nombre");
                    nombre = sc.next();
                    trabajadoresMap.put(nif, nombre);
                    break;
                case 2:
                    System.out.println("Introduzca el DNI a buscar");
                    nif = sc.next();
                    comprobarDNI(nif);
                    buscarTrabajador(trabajadoresMap, nif);
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del trabajador a buscar");
                    nombre = sc.next();
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Porfavor, introduce una opción válida");
                    break;
            }

        } while (opcion != 0);

    }

    public static void buscarTrabajador(Map<String, String> trabajadoresMap, String NIF) {
        if (trabajadoresMap.get(NIF) != null) {
            System.out.println("El empleado con ese NIF es : " + trabajadoresMap.get(NIF));
        } else {
            System.out.println("No se ha encontrado ningun empleado con ese NIF");
        }
    }

    /**
     * 
     * Metodo para comprobar si el formato del DNI es correcto,[8 numeros y una
     * letra] y que la letra introducida se acorrecta
     * 
     * @param dni un String con el DNI que se va a comprobar
     */
    public static void comprobarDNI(String dni) {

        if (dni.length() == 9) { // Comprueba si la longitud del DNI es correcta
            String numeros = dni.substring(0, 8);
            String letra = dni.substring(8);

            try {
                int num = Integer.parseInt(numeros); // Convierte los 8 primeros caracteres en un número
                char letraCalculada = calcularLetra(num); // Calcula la letra correspondiente
                if (letra.charAt(0) == letraCalculada) { // Comprueba si la letra es correcta
                    System.out.println("Formato de DNI válido.");
                } else {
                    System.out.println("Formato de DNI inválido.");
                }
            } catch (NumberFormatException e) { // Si los 8 primeros caracteres no son un número, entonces el DNI es
                                                // inválido
                System.out.println("Formato de DNI inválido.");
            }
        } else { // Si la longitud del DNI es incorrecta, entonces el DNI es inválido
            System.out.println("Formato de DNI inválido.");
        }
    }

    private static char calcularLetra(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Cadena con todas las letras posibles
        int resto = numero % 23; // Calcula el resto de dividir el número por 23
        return letras.charAt(resto); // Devuelve la letra correspondiente al resto calculado
    }
}
