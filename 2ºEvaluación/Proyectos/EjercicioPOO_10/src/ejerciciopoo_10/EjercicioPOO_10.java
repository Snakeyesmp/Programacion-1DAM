/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_10;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EjercicioPOO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Caballos caballo1 = new Caballos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del caballo");
        caballo1.setNombre(sc.nextLine());
        System.out.println("Introduce el color del caballo");
        caballo1.setColor(sc.nextLine());
        System.out.println("Introduce la edad del caballo");
        caballo1.setEdad(sc.nextInt());
        System.out.println("Introduce el numero de carreras ganadas");
        caballo1.setCarrerasGanadas(sc.nextInt());
        
        System.out.println("Introduzca si el caballo 'cabalga','relincha' o 'rumia' ");
        String accion;      
        sc.nextLine();
        accion = sc.nextLine();
        
        System.out.println(caballo1);
        
        switch (accion) {
            case "cabalga":
                caballo1.cabalga();
                break;
            case "relincha":
                caballo1.relincha();
                break;
            case "rumia":
                caballo1.rumia();
                break;
            default:
            System.out.println("El caballo no hace na");
        }
    }
}