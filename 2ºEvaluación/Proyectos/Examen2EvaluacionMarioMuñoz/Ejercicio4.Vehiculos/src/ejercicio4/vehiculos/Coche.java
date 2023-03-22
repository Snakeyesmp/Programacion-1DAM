/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public class Coche extends Terrestre {

    private boolean tieneAireAcondicionado;

    public Coche(String matricula, String modelo, int numRuedas, boolean tieneAireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void pitar() {
        System.out.println("pic pic");
    }

    @Override
    public void imprimir() {
        System.out.println("Coche: [matricula=" + getMatricula() + ", modelo=" + getModelo() + ", numRuedas=" + getNumRuedas() + ", tieneAireAcondicionado=" + tieneAireAcondicionado + "]");
    }
}
