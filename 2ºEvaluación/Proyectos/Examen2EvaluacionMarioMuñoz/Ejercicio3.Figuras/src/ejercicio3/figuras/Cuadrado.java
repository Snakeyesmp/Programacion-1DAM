/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.figuras;

/**
 *
 * @author admin
 */
public class Cuadrado implements iFigura2D {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void escalar(double escala) {
        lado *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado: Lado = " + lado + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
