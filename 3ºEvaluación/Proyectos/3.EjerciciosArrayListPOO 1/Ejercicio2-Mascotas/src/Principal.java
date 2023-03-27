import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Mascota> listadoAnimales = new ArrayList<Mascota>();

        Mascota perro1 = new Perro("Doberman", false);
        Mascota doraemon = new Gato("Azul", false);
        Mascota loro1 = new Loro("Amarillo", true, "Uganda", true);
        Mascota canario1 = new Canario("Verde", true, "Marron", true);
        listadoAnimales.add(perro1);
        listadoAnimales.add(doraemon);
        listadoAnimales.add(loro1);
        listadoAnimales.add(canario1);

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(
                    "\n1. Mostrar la lista de animales\n2.Mostrar todos los datos en un animal concreto\n3.Mostrar todos los datos de todos los animales\n4.Insertar animales en el inventario\n5.ELiminar animales del inventario\n6.Vaciar el inventario,\n0.Salir del programa");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    System.out.println("Datos de doraemon: ");
                    doraemon.muestra();
                    break;
                case 3:
                    Inventario.datosDeTodosLosAnimales(listadoAnimales);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Se eliminará a Doraemon");
                    Inventario.eliminarUnAnimal(listadoAnimales, doraemon);
                    break;
                case 6:
                    Inventario.eliminarAnimales(listadoAnimales);
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        // System.out.println(doraemon.getClass().getSimpleName()); getClass() devuelve
        // "Class Gato" y con el getSimpleName te devuelve el nombre de la clase
        // solamente
        sc.close();
        System.out.println("Ha salido del programa existosamente");
    }

}
