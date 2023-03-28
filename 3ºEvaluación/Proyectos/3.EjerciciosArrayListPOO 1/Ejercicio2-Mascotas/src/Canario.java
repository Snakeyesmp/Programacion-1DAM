public class Canario extends Aves {
    private String color;
    private boolean canta;

    public void habla() {
        System.out.println("Soy un canario que habla(Canario el pájaro, no una persona procedente de canarias)");
    }

    public void volar() {
        System.out.println("*vuela*");
    }

    public Canario(String nombre, int edad, String estado, String fechanac, String pico, boolean vuela, String color,
            boolean canta) {
        super(nombre, edad, estado, fechanac, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
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
