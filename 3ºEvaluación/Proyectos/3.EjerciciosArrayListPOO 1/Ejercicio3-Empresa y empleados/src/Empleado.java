public class Empleado {

    private String nombre;
    private String dni;
    private double sueldoBrutoMensual;
    private int edad;
    private String telefono;
    private String direccion;

    // Constructor
    public Empleado(String nombre, String dni, double sueldoBrutoMensual) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para imprimir la información de un empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo bruto mensual: " + sueldoBrutoMensual);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
    }

    // Método para calcular el sueldo neto de un empleado
    public double calcularSueldoNeto() {
        double sueldoBrutoAnual = sueldoBrutoMensual * 12;
        double porcentajeIrpf;
        if (sueldoBrutoAnual < 12000) {
            porcentajeIrpf = 0.20;
        } else if (sueldoBrutoAnual < 25000) {
            porcentajeIrpf = 0.30;
        } else {
            porcentajeIrpf = 0.40;
        }
        double sueldoNetoMensual = sueldoBrutoMensual * (1 - porcentajeIrpf);
        return sueldoNetoMensual;
    }
}
