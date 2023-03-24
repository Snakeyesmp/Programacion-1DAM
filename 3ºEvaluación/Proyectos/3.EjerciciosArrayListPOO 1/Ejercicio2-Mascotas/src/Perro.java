public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public String muestra() {
        return null;
    }

    public String habla() {

        return "Soy un perro que habla";
    }

    public Perro(String raza, boolean pulgas) {
        this.raza = raza;
        this.pulgas = pulgas;
    }

}
