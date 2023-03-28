public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public String saluda() {
        return "Hola, soy un Loro, se donde vives";
    }

    public void volar() {
        System.out.println("*vuela*");
    }

    public Loro(String nombre, int edad, String estado, String fechanac, String pico, boolean vuela, String origen,boolean habla) {
        super(nombre, edad, estado, fechanac, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
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
