import java.util.ArrayList;

public class Empresa {
    private final String nombre;
    private final String cif;
    private String telefono;
    private String direccion;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.empleados = new ArrayList<Empleado>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
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

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void removeEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void printEmpleados() {
        System.out.println("Empleados de " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }

    public void printSueldos() {
        System.out.println("Sueldos de los empleados de " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getDni() + ": " + empleado.getSueldoBrutoMensual() + " (bruto) / "
                    + empleado.calcularSueldoNeto() + " (neto)");
        }
    }

    public double getTotalSueldosBrutos() {
        double totalSueldosBrutos = 0;
        for (Empleado empleado : empleados) {
            totalSueldosBrutos += empleado.getSueldoBrutoMensual();
        }
        return totalSueldosBrutos;
    }

    public double getTotalSueldosNetos() {
        double totalSueldosNetos = 0;
        for (Empleado empleado : empleados) {
            totalSueldosNetos += empleado.calcularSueldoNeto();
        }
        return totalSueldosNetos;
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void mostrarEmpleados() {

        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
            ;
        }

    }

}
