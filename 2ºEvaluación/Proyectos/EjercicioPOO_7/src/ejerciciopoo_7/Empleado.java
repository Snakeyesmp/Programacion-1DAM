/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_7;

/**
 *
 * @author admin
 */
public class Empleado {

    private String nif, nombre;
    private double sueldoBase, irpf;
    private boolean casado;
    private int numeroHijos, horasExtraMes;
    static private int importeHoraExtra;

    public Empleado() {
    }

    public Empleado(String nif, String nombre, double sueldoBase, double irpf, boolean casado, int numeroHijos, int horasExtraMes) {
        this.nif = nif;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.irpf = irpf;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
        this.horasExtraMes = horasExtraMes;
    }

    public Empleado(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public void setHorasExtraMes(int horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public static int getImporteHoraExtra() {
        return importeHoraExtra;
    }

    public static void setImporteHoraExtra(int importeHoraExtra) {
        Empleado.importeHoraExtra = importeHoraExtra;
    }

    public double generadoHorasExtra() {

        return importeHoraExtra * horasExtraMes;

    }

    public double sueldoBruto() {

        return (generadoHorasExtra() + sueldoBase);

    }

    public double retencionIRPF() {
        double tipo = irpf;
        if (casado) {
            tipo = tipo - 2;
        }
        tipo = tipo - numeroHijos;
        if (tipo < 0) {
            tipo = 0;
        }
        return sueldoBruto() * tipo / 100;

    }

    public double sueldoNeto() {

        return sueldoBruto() - retencionIRPF();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDNI: ");
        sb.append(nif);
        sb.append("\nSueldo base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras extras: ");
        sb.append(horasExtraMes);
        sb.append("\ntipo IRPF: ");
        sb.append(irpf);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNumero de hijos: ");
        sb.append(numeroHijos);
        return sb.toString();
    }

}
