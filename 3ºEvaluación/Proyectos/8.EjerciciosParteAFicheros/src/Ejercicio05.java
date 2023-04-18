import java.io.File;

/**
 * Implementa un programa con una función boolean borraTodo(File f) que borre f:
 * Si no existe lanzará una excepción. Si es un archivo lo borrará. Si es un
 * directorio, borrará primero sus archivos y luego el propio directorio
 * (recuerda que para poder borrar un directorio debe estar vacío). Devolverá
 * ‘true’ si pudo borrar el ‘File f’ (‘false’ si no fué posible).
 * Prueba la función borrando las carpetas: ‘Documentos/Fotografias’,
 * ‘Documentos/Libros’ y ‘Documentos’ (es decir, tres llamadas a la función, en
 * ese orden).
 * Super extra challenge: Esta función, tal y como está definida, no borrará las
 * subcarpetas que estén dentro de una carpeta (para ello habría que borrar
 * primero el contenido de dichas subcarpetas).
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        // Se crea un archivo con la ruta de la carpeta documentos
        File archivoABorrar = new File("Documentos");

        if (borraTodo(archivoABorrar)) {
            System.out.println("La carpeta se ha eliminado correctamente");
        } else {
            System.out.println("No se ha podido eliminar la carpeta");
        }

    }

    /**
     * Elimina un archivo o carpeta con todos sus componentes
     * 
     * @param f el archivo o carpeta que queremos borrar
     * @return True si se ha podido borrar el archivo o False en caso contrario
     */
    public static boolean borraTodo(File f) {
        // Si lo que queremos borrar es un archivo sencillamente se borra
        if (f.isFile()) {
            f.delete();
            System.out.println("El archivo se ha borrado");
            return true;
            // Si lo que queremos eliminar es una carpeta tenemos que eliminar primero todos
            // sus elementos
        } else if (f.isDirectory()) {
            borrarElementosCarpeta(f);
            return true;
        }
        return false;
    }

    /**
     * Metodo para borrar todos los elementos de una carpeta y posteriormente poder
     * eliminar la carpeta en sí, ya que necesitamos que esté vacía para poder
     * eliminarla
     * 
     * @param carpeta carpeta que queremos vaciar
     */
    private static void borrarElementosCarpeta(File carpeta) {
        File[] elementos = carpeta.listFiles(); // Obtenemos los elementos de la carpeta

        for (File elemento : elementos) {
            if (elemento.isDirectory()) {
                // Si el elemento es una subcarpeta, borramos su contenido de forma recursiva
                borrarElementosCarpeta(elemento);
            } else {
                // Si el elemento es un archivo, lo borramos
                elemento.delete();
            }
        }
        carpeta.delete(); // Se elimina la carpeta vacío
    }

}
