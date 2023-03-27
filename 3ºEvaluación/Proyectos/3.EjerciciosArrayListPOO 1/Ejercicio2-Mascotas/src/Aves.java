public abstract class Aves extends Mascota {

    private String pico;
    private boolean vuela;

    public String volar() {
        return "*Vuela*";
    }

    public Aves(String pico, boolean vuela) {
        this.pico = pico;
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return "pico=" + pico + ", vuela=" + vuela;
    }

}
