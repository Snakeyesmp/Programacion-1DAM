import java.time.LocalDate;

public class Vino implements esAlimento, conDescuento {

    private String marca, tipoVino;
    private double gradosAlcohol, precio, cantDescuento;
    private LocalDate fechaCaducidad;

    public Vino(String marca, String tipoVino, double gradosAlcohol, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(Double des) {
        this.cantDescuento = des;
    }

    @Override
    public double getDescuento() {
        return cantDescuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (cantDescuento * precio);
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return (int) gradosAlcohol * 10;

    }

    @Override
    public String toString() {
        return "Vino [marca=" + marca + ", tipoVino=" + tipoVino + ", gradosAlcohol=" + gradosAlcohol + ", precio="
                + precio + "€" + ", cantDescuento=" + cantDescuento + ", fechaCaducidad=" + fechaCaducidad + "]";
    }

}
