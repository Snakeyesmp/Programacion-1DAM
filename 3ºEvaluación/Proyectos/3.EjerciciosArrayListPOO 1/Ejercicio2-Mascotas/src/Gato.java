/**
 * Clase Gato, heredada de mascota
 */
public class Gato extends Mascota {
    private String color;
    private boolean peloLargo;

    public void habla() {
        System.out.println("Soy un gato que habla, a las buenas tardes");
    }
    /**
     * 
     * @param nombre El nombre del gato
     * @param edad El numero de años del gato
     * @param estado Como está el gato
     * @param fechanac año-mes-dia de nacimiento del gato
     * @param color Que color tiene el gato
     * @param peloLargo Saber si tiene el pelo largo o no
     */
    public Gato(String nombre, int edad, String estado, String fechanac, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechanac);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    /**
     * Imprime todos los datos del gato [Nombre,edad,estado,origen,color,pelolargo]
     */
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
