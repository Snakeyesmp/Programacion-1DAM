import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase main en la que se crearán varios objetos de tipo mascota, y el menú para que el usuario opere
 * 
 */
public class Principal {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        Inventario inventario1 = new Inventario();

        Mascota perro1 = new Perro("Paquito", 2, "Ta guay", "21-03-2005", "Doberman", true);
        Mascota gato1 = new Gato("Doraemon", 3, "Metalico", "33-21-3033", "Azul", false);
        Mascota loro1 = new Loro("ChibiChoncho", 4, "Morido", "12-11-2010", "Rojo", true, "Uganda", true);
        Mascota canario1 = new Canario("Juan", 6, "VivitoYColeando", "20-10-2018", "Gris", true, "Marron", true);
        inventario1.insertarAnimal(perro1);
        inventario1.insertarAnimal(gato1);
        inventario1.insertarAnimal(loro1);
        inventario1.insertarAnimal(canario1);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(
                    "\n1. Mostrar la lista de animales\n2.Mostrar todos los datos en un animal concreto\n3.Mostrar todos los datos de todos los animales\n4.Insertar animales en el inventario\n5.Eliminar animales del inventario\n6.Vaciar el inventario,\n0.Salir del programa");

            opcion = sc.nextInt();
            String nombreMascota;
            switch (opcion) {
                case 1:
                    Inventario.mostrarListaAnimales();
                    break;
                case 2:
                    System.out.println("Escriba el nombre de la mascota");
                    nombreMascota = sc.next();
                    Inventario.mostrarDatosUnAnimal(nombreMascota);
                    break;
                case 3:
                    Inventario.datosDeTodosLosAnimales();
                    break;
                case 4:
                    System.out.println("Puedes añadir un perro, introduzca el nombre");
                    nombreMascota = sc.next();
                    System.out.println("Introduzca su edad");
                    int edadPerro = sc.nextInt();
                    System.out.println("Introduzca su estado");
                    String estadoPerro = sc.next();
                    System.out.println("Introduzca su fecha de nacimiento");
                    String fechaPerro = sc.next();
                    System.out.println("Introduzca la raza del perro");
                    String razaPerro = sc.next();
                    System.out.println("introduzca true si el perro tiene pulgas, false si no");
                    Boolean pulgasPerro = sc.nextBoolean();
                    Mascota perro2 = new Perro(nombreMascota, edadPerro, estadoPerro, fechaPerro, razaPerro,
                            pulgasPerro);
                    inventario1.insertarAnimal(perro2);
                    break;
                case 5:
                    System.out.println("Introduzca el nombre del animal a borrar");
                    nombreMascota = sc.next();
                    Inventario.eliminarUnAnimal(nombreMascota);
                    break;
                case 6:
                    Inventario.eliminarAnimales();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        sc.close();
        System.out.println("Ha salido del programa existosamente");
    }

}
