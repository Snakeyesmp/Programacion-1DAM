public class Gato extends Mascota {
    private String color;
    private boolean peloLargo;

    public void habla() {
        System.out.println("Soy un gato que habla, a las buenas tardes");
    }

    public Gato(String color, boolean peloLargo) {
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        String palabracorta;
        if (peloLargo) {
            palabracorta = "si";
        } else {
            palabracorta = "no";
        }

        System.out.println("color: " + color + ",peloLargo: " + palabracorta);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

}
