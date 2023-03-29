/**
 * Clase abstracta Aves, extendida de Mascota
 */
public abstract class Aves extends Mascota {

    private String pico;
    private boolean vuela;

    public abstract void volar();
    
    /**
     * 
     * @param nombre Nombre del ave
     * @param edad Numero de años del ave
     * @param estado Como se encuentra el ave
     * @param fechanac Año-mes-dia de nacimiento del ave
     * @param pico Color del pico del ave
     * @param vuela Si vuela o no el ave
     */
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
