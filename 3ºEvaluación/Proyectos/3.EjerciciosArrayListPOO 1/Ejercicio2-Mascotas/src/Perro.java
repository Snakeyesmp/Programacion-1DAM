/**
 * Clase perro, heredada de mascota
 */
public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public void habla() {
        System.out.println("Soy un perro que habla, buenas tardes");
    }
    /**
     * Constructor de perro
     * 
     * @param nombre Nombre del perro
     * @param edad Numero de años del perro
     * @param estado Como se encuentra el perro
     * @param fechanac año-mes-dia de nacimiento
     * @param raza Que raza es el perro
     * @param pulgas Si el perro tiene pulgas o no
     */
    public Perro(String nombre, int edad, String estado, String fechanac, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechanac);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    @Override
    /**
     * Imprime todos los datos del perro [nombre,edad,estado,nacido,raza,pulgas]
     */
    public void muestra() {
  
        String palabracorta;
        if (pulgas) {
            palabracorta = "si";
        } else {
            palabracorta = "no";
        }
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNacimiento());
        System.out.println("Raza   : " + this.getRaza());
        System.out.println("pulgas : " + palabracorta);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

}