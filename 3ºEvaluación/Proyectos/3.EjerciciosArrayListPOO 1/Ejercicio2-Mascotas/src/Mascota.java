import java.time.LocalDate;

public abstract class Mascota {

    private String nombre, estado;
    private int edad;
    private static LocalDate fechaNacimiento;

    abstract void muestra();
    abstract void habla();

    public String cumpleaños() {
        return "Feliz cumpleaños";
    }

    public String morir() {

        return "muelto";
    }

    @Override
    public String toString() {
        return " nombre=" + nombre + ", estado=" + estado + ", edad=" + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static void setFechaNacimiento(LocalDate fechaNacimiento) {
        Mascota.fechaNacimiento = fechaNacimiento;
    }


}
