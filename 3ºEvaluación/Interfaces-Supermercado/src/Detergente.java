
public class Detergente implements esLiquido, conDescuento {

    private String Marca;
    private Double precio, cantDescuento, volumen;
    private String tipoEnvase;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double Precio) {
        precio = Precio;
    }

    public Detergente(String marca, Double Precio) {
        Marca = marca;
        precio = Precio;
    }

    public void setVolumen(double v) {
    }

    public double getVolumen() {
        return volumen;
    }

    public void setTIpoEnvase(String env) {
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public void setDescuento(Double des) {
        cantDescuento = des;
    }

    @Override
    public double getDescuento() {
        return cantDescuento;
    }

    @Override
    public double getPrecioDescuento() {
        return cantDescuento * precio;
    }

    @Override
    public String toString() {
        return "Detergente [Marca=" + Marca + ", Precio=" + precio + "€" + "]";
    }

}
