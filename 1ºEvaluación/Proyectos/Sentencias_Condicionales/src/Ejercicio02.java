
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int Hora;

        System.out.println("Introduzca una hora");
        Scanner entrada = new Scanner(System.in);
        Hora = entrada.nextInt();

        
        
        switch (Hora) {
            case 6,7,8,9,10,11,12:

                System.out.println("Buenos dias");

                break;

            case 13,14,15,16,17,18,19,20:

                System.out.println("Buenas tardes");

                break;

            case 21,22,23,24,1,2,3,4,5:

                System.out.println("Buenas noches");

                break;

            default:

                System.out.println("Porfavor introduzca una hora de 1 hasta 24");
                
        }
    }
}
