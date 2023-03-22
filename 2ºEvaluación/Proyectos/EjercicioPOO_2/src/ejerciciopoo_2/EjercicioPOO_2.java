/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EjercicioPOO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        Contador contador1 = new Contador();

        System.out.println("Introduce valor para inicializar el contador");
        n = sc.nextInt();

        contador1.setCont(n);
        contador1.decrementar();

        System.out.println(contador1.getCont());
        contador1.decrementar();

        System.out.println(contador1.getCont());

        Contador contador2 = new Contador(10);

        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        Contador contador3 = new Contador(contador2);

        System.out.println(contador3.getCont());

    }

}
