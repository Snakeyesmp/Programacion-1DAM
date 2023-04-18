import java.io.File;
import java.util.Scanner;

/**
 * Implementa un programa que pida al usuario introducir por teclado una ruta
 * del sistema de archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre
 * información sobre dicha ruta (ver función más abajo). El proceso se repetirá
 * una y otra vez hasta que el usuario introduzca una ruta vacía (tecla intro).
 * Deberá manejar las posibles excepciones.
 * Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una
 * ruta de tipo File haga lo siguiente:
 * ● Si es un archivo, mostrará por pantalla el nombre del archivo.
 * ● Si es un directorio, mostrará por pantalla la lista de directorios y
 * archivos que contiene (sus nombres). Deberá mostrar primero los directorios y
 * luego los archivos.
 * ● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para
 * indicar si es un directorio o un archivo respectivamente.
 * ● Si el path no existe lanzará un FileNotFoundException.
 */
public class Ejercicio01 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una ruta a buscar");

        String rutaABuscar = sc.nextLine();
        sc.close();
        // Se crea un archivo con la ruta que ha introducido el usuario
        File archivo01 = new File(rutaABuscar);

        muestraInfoRuta(archivo01);

    }

    /**
     * Recibe un archivo e imprime por pantalla todos los elementos que contiene,
     * dependiendo de si es un archivo o una carpeta mostrará un texto u otro
     * 
     * @param archivo archivo del que se va a mostrar informacion sobre la ruta
     */
    static void muestraInfoRuta(File archivo) {

        File[] lista = archivo.listFiles();
        System.out.println(archivo.getAbsolutePath());

        if (archivo.isFile()) {
            System.out.println("Nombre del archivo: " + archivo.getName());
        } else {

            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];

                if (f.isDirectory()) {
                    System.out.println("[DIR]" + f.getName()); // DIR SI ES UNA CARPETA
                } else {
                    System.out.println("[ARX]" + f.getName()); // ARX SI ES UN ARCHIVO
                }
            }
        }
    }
}
