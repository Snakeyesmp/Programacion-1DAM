/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public class Submarino extends Acuatico {

    private int profundidadMaxima;

    public Submarino(String matricula, String modelo, double eslora, int profundidadMaxima) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void imprimir() {
        System.out.println("Submarino [matricula=" + getMatricula() + ", modelo=" + getModelo() + ", eslora=" + getEslora() + ", profundidadMaxima=" + profundidadMaxima + "]");
    }
}
