import java.io.File;

/**
 * Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas:
 * ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro
 * de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra
 * del alfabeto (en mayúsculas)
 */
public class Ejercicio04 {
    public static void main(String[] args) {

        // Creacion de dos carpetas vacias en la carpeta documentos
        File misCosas = new File("Documentos/Mis cosas");
        File alfabeto = new File("Documentos/Alfabeto");

        // Comprobacion de si se han podido crear las carpetas, y dar informacion sobre
        // ello al usuario
        crearCarpeta(alfabeto);
        crearCarpeta(misCosas);

        File fotografias = new File("Documentos/fotografias");
        File fotografias2 = new File("Documentos/Mis cosas/fotografias");
        File libros = new File("Documentos/libros");
        File libros2 = new File("Documentos/Mis cosas/libros");
        // Se mueven las dos carpetas
        renombrarCarpeta(fotografias, fotografias2);
        renombrarCarpeta(libros, libros2);
        // Se crea uan carpeta para cada letra del abecedario
        carpetasAbecedario();

    }

    /**
     * Imprime un mensaje en caso de que se haya podido crear la carpeta, o da un
     * error avisando al usuario de que no se ha realizado
     * 
     * @param archivo archivo que se va a crear
     */
    public static void crearCarpeta(File archivo) {
        if (archivo.mkdir()) {
            System.out.println("Se ha creado la carpeta " + archivo.getName());
        } else {
            System.out.println("La carpeta \"" + archivo.getName() + "\" no se ha creado, es posible que ya exista");
        }
    }

    /**
     * Recibe dos rutas como parametros, una de origen y otra a la que va a mover o
     * renombrar un archivo/carpeta, indica si ha podido realizar la acción o si ha
     * dado algún error
     * 
     * @param archivoOrigen  ruta del archivo origen
     * @param archivoDestino ruta del archivo en el que va a acabar
     */
    public static void renombrarCarpeta(File archivoOrigen, File archivoDestino) {
        if (archivoOrigen.renameTo(archivoDestino)) {
            System.out.println("La carpeta \"" + archivoDestino.getName() + "\" se ha movido");
        } else {
            System.out.println(
                    "La carpeta\" " + archivoDestino.getName()
                            + "\" no se ha movido, es posible que ya esté en la carpeta destino");
        }
    }

    /**
     * Metodo que crea una carpeta para cada letra del abecedario en la carpeta de
     * documentos/alfabeto/
     * 
     * 
     */
    public static void carpetasAbecedario() {
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        for (int i = 0; i < abecedario.length(); i++) {
            File carpetaLetra = new File("Documentos/Alfabeto/" + abecedario.charAt(i));

            if (!carpetaLetra.exists()) {
                carpetaLetra.mkdir();
            }
        }
    }
}
