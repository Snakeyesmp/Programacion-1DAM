public abstract class Mascota {

    private String nombre, estado;
    private int edad;
    private String fechaNacimiento;

    abstract void muestra();

    abstract void habla();

    public String cumpleaños() {
        return "Feliz cumpleaños";
    }

    public String morir() {
        return "muelto";
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mascota(String nombre, int edad, String estado, String fechanac) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechanac;
    }

}
