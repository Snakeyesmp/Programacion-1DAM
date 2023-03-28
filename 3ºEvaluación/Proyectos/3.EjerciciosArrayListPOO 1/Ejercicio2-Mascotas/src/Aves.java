public abstract class Aves extends Mascota {

    private String pico;
    private boolean vuela;

    public abstract void volar();
    

    public Aves(String nombre, int edad, String estado, String fechanac, String pico, boolean vuela) {
        super(nombre, edad, estado, fechanac);
        this.pico = pico;
        this.vuela = vuela;
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
