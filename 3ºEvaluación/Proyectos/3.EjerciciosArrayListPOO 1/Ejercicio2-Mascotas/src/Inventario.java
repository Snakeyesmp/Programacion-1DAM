import java.time.LocalDate;
import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {

        ArrayList<Mascota> listadoAnimales = new ArrayList<Mascota>();

        Mascota perro1 = new Perro(null, false);
        Mascota doraemon = new Gato("Azul", false);
        Mascota loro1 = new Loro("Amarillo", true, "Uganda", true);
        Mascota canario1 = new Canario("Verde", true, "Marron", true);
        listadoAnimales.add(perro1);
        listadoAnimales.add(doraemon);
        listadoAnimales.add(loro1);
        listadoAnimales.add(canario1);

        // fechaNacimiento=LocalDate.of(2022,10,21);

        
    }
}