public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public void habla() {
        System.out.println("Soy un perro que habla, buenas tardes");
    }

    public Perro(String raza, boolean pulgas) {
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
        System.out.println("raza:" + raza + ",pulgas: " + palabracorta);
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