public class Gato extends Mascota {
    private String color;
    private boolean peloLargo;

    public String muestra() {
        return null;

    }

    public String habla() {
        return "Soy un gato que habla";
    }

    public Gato(String color, boolean peloLargo) {
        this.color = color;
        this.peloLargo = peloLargo;
    }

}
