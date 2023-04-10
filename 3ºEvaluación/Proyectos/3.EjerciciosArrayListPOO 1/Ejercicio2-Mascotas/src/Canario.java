/**
 * Clase canario, extendida de aves, a su vez extendida de mascotas
 */
public class Canario extends Aves {
    private String color;
    private boolean canta;

    public void habla() {
        System.out.println("Soy un canario que habla(Canario el pájaro, no una persona procedente de canarias)");
    }

    public void volar() {
        System.out.println("*vuela*");
    }
    /**
     * Constructor para el canario
     * 
     * @param nombre El nombre del canario
     * @param edad El numero de años del canario
     * @param estado Como se encuentra el canario
     * @param fechanac año-mes-dia de nacimiento del canario
     * @param pico Color del pico del canario
     * @param vuela Si vuela o no el canario
     * @param color Color del plumaje del canario
     * @param canta Si canta o no el canario
     */
    public Canario(String nombre, int edad, String estado, String fechanac, String pico, boolean vuela, String color,
            boolean canta) {
        super(nombre, edad, estado, fechanac, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    /**
     * Mostrar los datos del canario [Nombre,Edad,Estado,Nacido,Color,Canta]
     */
    public void muestra() {

        String palabracorta;
        if (canta) {
            palabracorta = "si";
        } else {
            palabracorta = "no";
        }
        System.out.println("Nombre   : " + this.getNombre());
        System.out.println("Edad     : " + this.getEdad());
        System.out.println("Estado   : " + this.getEstado());
        System.out.println("Nacido   : " + this.getFechaNacimiento());
        System.out.println("color    : " + this.getColor());
        System.out.println("canta    : " + palabracorta);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

}
