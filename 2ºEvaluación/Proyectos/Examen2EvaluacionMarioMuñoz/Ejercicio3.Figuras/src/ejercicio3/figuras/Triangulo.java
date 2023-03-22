/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.figuras;

/**
 *
 * @author admin
 */
public class Triangulo implements iFigura2D {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double perimetro() {        
        return altura*2+base;
    }
    
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    
    @Override
    public void escalar(double escala) {
        base *= escala;
        altura *= escala;
    }
    
   @Override
    public void imprimir() {
        System.out.println("Triangulo: Base = " + base + ", Altura = " + altura + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
