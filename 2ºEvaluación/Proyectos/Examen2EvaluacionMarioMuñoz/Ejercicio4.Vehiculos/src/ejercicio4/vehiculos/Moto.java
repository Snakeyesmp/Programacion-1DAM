/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public class Moto extends Terrestre {

    private String color;

    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void pitar() {
        System.out.println("mic mic");
    }

    @Override
    public void imprimir() {
        System.out.println("Moto: [matricula=" + getMatricula() + ", modelo=" + getModelo() + ", numRuedas=" + getNumRuedas() + ", color=" + color + "]");
    }
}
