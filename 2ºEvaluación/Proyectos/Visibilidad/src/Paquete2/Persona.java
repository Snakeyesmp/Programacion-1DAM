/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author Mario
 */
public class Persona {

    String nombre, apellido, localidadNacimiento;
    int edad;
    Boca boca1 = new Boca();

    public void usarBoca() {

        boca1.comer();
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        int contador1=0;
        int contador2=0;
        
    }

    public void saludar(String nombre, String apellido) {
        System.out.println("Hola," + nombre + " " + apellido + "\nA partir de ahora tienes " + this.edad + " anios");
    }

    public void setLocalidad(String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }

    public String getLocalidad() {
        System.out.println(localidadNacimiento);
        return localidadNacimiento;
    }

    public boolean esMayorDeEdad() {

        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
