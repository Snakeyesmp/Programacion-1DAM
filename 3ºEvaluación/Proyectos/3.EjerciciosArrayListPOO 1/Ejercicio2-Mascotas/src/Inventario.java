import java.util.ArrayList;

public class Inventario {

    public static void eliminarAnimales(ArrayList<Mascota> listadoAnimales) {
        listadoAnimales.clear();
        System.out.println("El inventario ha sido vaciado correctamente");
    }

    public static void datosDeTodosLosAnimales(ArrayList<Mascota> listadoAnimales) {
        System.out.println("Datos de todos los animales: ");
        for (Mascota mascota : listadoAnimales) {
            System.out.println(mascota);
        }
    }

    public static void eliminarUnAnimal(ArrayList<Mascota> listadoAnimales, Mascota nombre) {
        for (Mascota mascota : listadoAnimales) {
            if (mascota.getNombre().equals(nombre)) {
                listadoAnimales.remove(mascota);
                System.out.println("Animal eliminado: " + mascota);
            }
        }
    }

    public String getTipoMascota(Mascota mascota) {
        
        return mascota.getClass().getSimpleName();
    }

}