import java.time.LocalDate;

public class MainSupermercado {
    public static void main(String[] args) {

        Detergente ariel = new Detergente("Carrefour", 7.0);
        Vino torres = new Vino("Chino", "Roble", 4, 12);
        Cereales AllBran = new Cereales("Antonia", "Trigo", 6.5);
        Detergente clinex = new Detergente(null, null);

        System.out.println(ariel);
        torres.setCaducidad(LocalDate.of(2023, 11, 27));
        System.out.println(torres);
        System.out.println(AllBran);
        System.out.println(clinex);

        /*
         * 
         * 
         * SI PEGAS ESTO LocalDate.of Y LE DAS A CONTRL ESPACIO TE SALEN LAS OPCIONES
         * CON LOQ UE ES CADA CAMPO perdon por mayus
         */
    }
}
