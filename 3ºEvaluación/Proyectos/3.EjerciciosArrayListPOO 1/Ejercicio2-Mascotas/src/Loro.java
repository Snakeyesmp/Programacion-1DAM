public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public String saluda() {
        return "Hola, soy un Loro, se donde vives";
    }

    public void volar() {
        System.out.println("*vuela*");
    }

    public Loro(String pico, boolean vuela, String origen, boolean habla) {
        super(pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void muestra() {
        String palabracorta;
        if (habla) {
            palabracorta="si";
        } else{
            palabracorta="no";
        }
        System.out.println("origen: " + origen + ",habla: " + palabracorta);
    }

    @Override
    public void habla() {
        System.out.println("A las buenas, soy un loro que habla");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

}
