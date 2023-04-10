import java.util.ArrayList;
/**
 * Clase inventario que contendrá metodos para trabajar con el arrayList de mascotas
 * 
 */
public class Inventario {
    
    private static ArrayList<Mascota> listadoAnimales = new ArrayList<Mascota>();

    public Inventario() {
    }
    /**
     * Vacia el ArrayList por completo y lo deja vacío
     * 
     */
    public static void eliminarAnimales() {
        listadoAnimales.clear();
        System.out.println("El inventario ha sido vaciado correctamente");
    }
    /**
     * Muestra todos los datos de todos los animales del arraylist
     * 
     */
    public static void datosDeTodosLosAnimales() {
        System.out.println("Datos de todos los animales: ");
        for (Mascota mascota : listadoAnimales) {
            mascota.muestra();
            System.out.println();
        }
    }
    
    /** 
     * Metodo que recibe un String con el nombre del animal, lo busca en el array y lo elimina
     * 
     * @param nombre el nombre del animal a eliminar
     */
    public static void eliminarUnAnimal(String nombre) {
        for (int j = 0; j < listadoAnimales.size(); j++) {
            if (listadoAnimales.get(j).getNombre().equals(nombre)) {
                listadoAnimales.remove(j);
            }
        }
    }
    /**
     * Muestra los datos de un animal específico, según el nombre que haya recibido
     * 
     * @param nombre el nombre del animal a mostrar datos
     */
    public static void mostrarDatosUnAnimal(String nombre) {
        for (int j = 0; j < listadoAnimales.size(); j++) {
            if (listadoAnimales.get(j).getNombre().equals(nombre)) {
                listadoAnimales.get(j).muestra();
            }
        }
    }
    /**
     * Inserta un objeto del tipo mascota en el arraylist
     * 
     * @param mascota el objeto mascota que se va a introducir en el arraylist
     */
    public void insertarAnimal(Mascota mascota) {
        listadoAnimales.add(mascota);
    }
    /**
     * Muestra unicamente el tipo de animal y su nombre de todos los animales de la lista
     * 
     */
    public static void mostrarListaAnimales() {
        for (Mascota mascota : listadoAnimales) {
            System.out.println( "Tipo :"+ mascota.getClass().getSimpleName() + ", Nombre : " + mascota.getNombre()); 
            // doraemon.getClass().getSimpleName(); getClass() devuelve
            // "Class Gato" y con el getSimpleName te devuelve el nombre de la clase
            // solamente
        }
    }

}