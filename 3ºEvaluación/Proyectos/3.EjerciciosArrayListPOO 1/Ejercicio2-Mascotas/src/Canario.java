public class Canario extends Aves {
    private String color;
    private boolean canta;

    public String muestra() {
        return null;
    }

    public String habla() {
        return "Soy un canario que habla(Canario el pájaro, no una persona procedente de canarias)";
    }

    public String volar() {
        return "*vuela*";
    }

    public Canario(String pico, boolean vuela, String color, boolean canta) {
        super(pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "color=" + color + ", canta=" + canta;
    }

}
