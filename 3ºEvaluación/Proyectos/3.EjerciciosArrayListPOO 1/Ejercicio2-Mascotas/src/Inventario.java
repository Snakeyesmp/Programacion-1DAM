import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
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

        // fechaNacimiento=LocalDate.of(2022,10,21);

        System.out.println(
                "1. Mostrar la lista de animales\n2.Mostrar todos los datos en un animal concreto\n3.Mostrar todos los datos de todos los animales\n4.Insertar animales en el inventario\n5.ELiminar animales del inventario\n6.Vaciar el inventario");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                System.out.println("Datos de todos los animales: ");
                for (Mascota mascota : listadoAnimales) {
                    System.out.println(mascota);
                }
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                listadoAnimales.clear();
                System.out.println("El inventario ha sido vaciado correctamente");
                break;
            default:
                break;
        }

    }
}