/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_1;

/**
 *
 * @author admin
 */
public class Cuenta {

    private String nombre, numeroCuenta;
    private double tipoInteres, saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) { //Consctructor con todos los parametros 
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta() { //Constructor por defecto, se hace sin introducir ningun parametro, solo el nombre de la clase
    }

    public Cuenta(final Cuenta a) { //Constructor copia, se hace poniendo un constructor vacío con el tipo de datos del objeto
        this.nombre = a.nombre;
        this.numeroCuenta = a.numeroCuenta;
        this.tipoInteres = a.tipoInteres;
        this.saldo = a.saldo;
    }

    public boolean ingreso(double n) {
        if (n < 0) {
            return false;
        } else {
            saldo = saldo + n;
            return true;
        }
    }

    public boolean reintegro(double n) {
        if (n < 0) {
            return false;
        } else if (saldo >= n) {
            saldo = saldo - n;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferencia(Cuenta c, double n) {
        if (n < 0) {
            return false;
        } else if (saldo >= n) {
            this.reintegro(n);
            c.ingreso(n);
            return true;
        }else{
            return false;
        }
    }
}
