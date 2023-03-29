public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public String saluda() {
        return "Hola, soy un Loro, se donde vives";
    }

    public void volar() {
        System.out.println("*vuela*");
    }
    /**
     * 
     * @param nombre El nombre del loro
     * @param edad el numero de años del loro
     * @param estado como se encuentra el loro
     * @param fechanac año-mes-dia de nacimiento del loro
     * @param pico el color del pico
     * @param vuela para saber si vuela o no
     * @param origen La procedencia del loro
     * @param habla Para saber si habla o no habla
     */
    public Loro(String nombre, int edad, String estado, String fechanac, String pico, boolean vuela, String origen,boolean habla) {
        super(nombre, edad, estado, fechanac, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    /**
     * Imprime todos los datos del loro [Nombre,edad,estado,nacido,habla]
     * 
     */
    public void muestra() {
        
        String palabracorta;
        if (habla) {
            palabracorta = "si";
        } else {
            palabracorta = "no";
        }
        System.out.println("Nombre   : " + this.getNombre());
        System.out.println("Edad     : " + this.getEdad());
        System.out.println("Estado   : " + this.getEstado());
        System.out.println("Nacido   : " + this.getFechaNacimiento());
        System.out.println("habla    : " + palabracorta);
    }

    @Override
    public void habla() {
        System.out.println("A las buenas, soy un loro que habla");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

}
