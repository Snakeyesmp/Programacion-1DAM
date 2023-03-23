import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // 1.Crear 5 instancias de la clase producto
        Producto p1 = new Producto("Natillas", 1);
        Producto p2 = new Producto("Yogur", 2);
        Producto p3 = new Producto("Cereales", 4);
        Producto p4 = new Producto("Secador", 6);
        Producto p5 = new Producto("Lavadora", 5);

        // 2.Crea un ArrayList
        ArrayList<Producto> lista = new ArrayList<Producto>();

        // 3.Añade las 5 instancias de Producto al ArrayList
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        // 4. Visualiza el contenido de ArrayList utilizando Iterator
        Iterator<Producto> iter = lista.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 5. Elimina dos elementos del ArrayList
        lista.remove(p1);
        lista.remove(p2);

        // 6. Inserta un nuevo objeto producto en medio de la lista
        lista.add(3, p1);

        // 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
        System.out.println("CON LOS DATOS MODIFICADOS");
        iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 8. Elimina todos los valores del ArrayList
        lista.clear();

    }
}
