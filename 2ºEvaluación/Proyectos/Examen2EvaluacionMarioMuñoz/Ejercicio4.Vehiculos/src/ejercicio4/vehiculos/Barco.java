/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public class Barco extends Acuatico {

    private boolean tieneMotor;

    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    public boolean getTieneMotor() {
        return tieneMotor;
    }

    @Override
    public void imprimir() {
        System.out.println("Barco: [matricula=" + getMatricula() + ", modelo=" + getModelo() + ", eslora=" + getEslora() + ", tieneMotor=" + tieneMotor + "]");
    }
}
