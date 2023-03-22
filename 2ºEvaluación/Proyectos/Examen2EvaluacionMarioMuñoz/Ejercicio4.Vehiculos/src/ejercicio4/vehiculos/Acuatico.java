/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public abstract class Acuatico extends Vehiculo {
    // PONGO ESLORA COMO UN DOUBLE PORQUE NO SE LO QUE ES
    private double eslora;
    
    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }
}
