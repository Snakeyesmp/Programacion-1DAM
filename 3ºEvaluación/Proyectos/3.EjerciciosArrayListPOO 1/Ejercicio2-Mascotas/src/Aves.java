public abstract class Aves extends Mascota {

    private String pico;
    private boolean vuela;

    public void volar() {
        System.out.println("*vuela*");
    }

    public Aves(String pico, boolean vuela) {
        this.pico = pico;
        this.vuela = vuela;
    }

    @Override
    public void muestra() {
        String palabracorta;
        if (vuela) {
            palabracorta = "si";
        } else {
            palabracorta = "no";
        }
        System.out.println("pico: " + pico + ",vuela:" + palabracorta);
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

}
