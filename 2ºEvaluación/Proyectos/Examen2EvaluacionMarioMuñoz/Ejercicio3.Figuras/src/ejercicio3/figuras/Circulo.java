/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.figuras;

/**
 *
 * @author admin
 */
public class Circulo implements iFigura2D {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public void escalar(double escala) {
        radio *= escala;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Circulo: Radio = " + radio + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
