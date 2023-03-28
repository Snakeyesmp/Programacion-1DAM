public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public void habla() {
        System.out.println("Soy un perro que habla, buenas tardes");
    }

    public Perro(String nombre, int edad, String estado, String fechanac, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechanac);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
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