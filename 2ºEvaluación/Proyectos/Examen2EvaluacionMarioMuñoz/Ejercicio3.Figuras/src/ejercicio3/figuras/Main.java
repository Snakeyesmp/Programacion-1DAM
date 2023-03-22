/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.figuras;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // HAGO UN ARRAYLIST CON LAS FIGURAS, PORQUE ME RESULTA MÁS FACIL QUE UN ARRAY NORMAL
        ArrayList<iFigura2D> figuras = new ArrayList<>();

        // Añade varias figuras de diferentes tipos
        figuras.add(new Cuadrado(5));
        figuras.add(new Rectangulo(3, 4));
        figuras.add(new Triangulo(3, 4));
        figuras.add(new Circulo(2));

        // Muestra información de todas las figuras
        System.out.println("Informacion de las figuras:");
        for (iFigura2D figura : figuras)
        {
            figura.imprimir();
        }

        // Escala todas las figuras con escala=2
        double escala = 2;
        for (iFigura2D figura : figuras)
        {
            figura.escalar(escala);
        }

        // Muestra información de todas las figuras escaladas
        System.out.println("//////////Informacion de las figuras escaladas con escala=" + escala + "//////////");
        for (iFigura2D figura : figuras)
        {
            figura.imprimir();
        }

        // Escala todas las figuras con escala=0.1
        escala = 0.1;
        for (iFigura2D figura : figuras)
        {
            figura.escalar(escala);
        }

        // Muestra información de todas las figuras escaladas
        System.out.println("//////////Informacion de las figuras escaladas con escala=" + escala + "//////////");
        for (iFigura2D figura : figuras)
        {
            figura.imprimir();
        }
    }
}