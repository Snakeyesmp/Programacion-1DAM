
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        double Altura;
        final double t;
        final double g;
        double Tiempo;

        Altura = 0;
        t = 2;
        g = 9.81;
        Tiempo = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        Altura = entrada.nextDouble();

        Tiempo = Math.sqrt((t * Altura)/g);

        System.out.println("El objeto tardará: " + Tiempo + (" segundos en caer"));

    }
}
