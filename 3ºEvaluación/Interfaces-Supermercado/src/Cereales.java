import java.time.LocalDate;

public class Cereales implements esAlimento {

    private String Marca, tipoCereal;
    private Double Precio;
    private LocalDate FechaCaducidad;
    private int calorias;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public LocalDate getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        FechaCaducidad = fechaCaducidad;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Cereales(String marca, String tipoCereal, Double precio) {
        Marca = marca;
        this.tipoCereal = tipoCereal;
        Precio = precio;
        switch (tipoCereal) {
            case "espelta":
                calorias = 5;
                break;
            case "maíz":
                calorias = 8;
                break;
            case "trigo":
                calorias = 12;
                break;
            default:
                calorias = 15;
                break;
        }

    }

    @Override
    public void setCaducidad(LocalDate fc) {
        FechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return FechaCaducidad;

    }

    @Override
    public int getCalorias() {

        return calorias;

    }

    @Override
    public String toString() {
        return "Cereales [Marca=" + Marca + ", tipoCereal=" + tipoCereal + ", Precio=" + Precio + "€"
                + ", FechaCaducidad="
                + FechaCaducidad + ", calorias=" + calorias + "]";
    }

}
