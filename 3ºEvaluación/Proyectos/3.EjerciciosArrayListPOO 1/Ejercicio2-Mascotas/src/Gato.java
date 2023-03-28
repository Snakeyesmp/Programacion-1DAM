public class Gato extends Mascota {
    private String color;
    private boolean peloLargo;

    public void habla() {
        System.out.println("Soy un gato que habla, a las buenas tardes");
    }

    public Gato(String nombre, int edad, String estado, String fechanac, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechanac);
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
        System.out.println("Nombre    : " + this.getNombre());
        System.out.println("Edad      : " + this.getEdad());
        System.out.println("Estado    : " + this.getEstado());
        System.out.println("Nacido    : " + this.getFechaNacimiento());
        System.out.println("Color     : " + this.getColor());
        System.out.println("peloLargo : " + palabracorta);
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
