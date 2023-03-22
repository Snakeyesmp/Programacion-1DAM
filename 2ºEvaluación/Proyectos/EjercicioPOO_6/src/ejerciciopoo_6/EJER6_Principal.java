/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJER6_Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0, m = 0, a = 0;
        boolean error;
        do {
            try {
                error = false;
                System.out.println("Introduce fecha: ");
                System.out.print("dia: ");
                d = sc.nextInt();
                System.out.print("mes: ");
                m = sc.nextInt();
                System.out.print("anio: ");
                a = sc.nextInt();
                
            } catch (Exception e) {
                error = true;
                sc.next();
            }
        } while (error);
        //Se pide por teclado el dia, mes y año 
        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Fecha fecha = new Fecha(d, m, a);
        if (fecha.fechaCorrecta()) { //si la fecha es correcta
            //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida: " + fecha);
            //Se muestran los 10 días siguientes utilizando el método diaSiguiente()                              
            System.out.println("Los 10 dias siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }
        } else { //Si la fecha no es correcta
            System.out.println("Fecha no valida");
        }
    }
}