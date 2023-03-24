public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public String muestra() {
        return null;
    }

    public String saluda() {
        return "Hola, soy un Loro, se donde vives";
    }

    public String volar() {
        return "*vuela*";
    }

    public Loro(String pico, boolean vuela, String origen, boolean habla) {
        super(pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
}
