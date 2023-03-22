/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.figuras;

/**
 *
 * @author admin
 */
public class Rectangulo implements iFigura2D {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
    
    @Override
    public double area() {
        return base * altura;
    }
    
    @Override
    public void escalar(double escala) {
        base *= escala;
        altura *= escala;
    }
    
   @Override
    public void imprimir() {
        System.out.println("Rectangulo: Base = " + base + ", Altura= " + altura + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
