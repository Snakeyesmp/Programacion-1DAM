/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PiedraPapelTijeraMARIO {

    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        String eleccionUsuario;
        int numRandom;
        String eleccionMaquina;
        eleccionMaquina = "";
        System.out.println("Introduzca su jugada, porfavor (piedra,papel,tijera)");
        eleccionUsuario = enter.nextLine();
        numRandom = (int) (Math.random() * 3) + 1;
        
        switch (numRandom) {
            case 1 ->
                eleccionMaquina = "piedra";

            case 2 ->
                eleccionMaquina = "papel";

            case 3 ->
                eleccionMaquina = "tijera";
        }
        
        System.out.println("Tu eleccion era " + eleccionUsuario + " y la eleccion de la maquina era " + eleccionMaquina);
        if (eleccionUsuario.equals(eleccionMaquina)) {
            System.out.println("empate!");

        } else {

            if ("piedra".equals(eleccionUsuario)) {

                if ("tijera".equals(eleccionMaquina)) {

                    System.out.println("Has ganado!");

                } else {
                    System.out.println("Has perdido!");
                }
            }

            if ("papel".equals(eleccionUsuario)) {

                if ("piedra".equals(eleccionMaquina)) {

                    System.out.println("Has ganado!");

                } else {

                    System.out.println("Has perdido!");
                }
            }

            if ("tijera".equals(eleccionUsuario)) {

                if ("papel".equals(eleccionMaquina)) {

                    System.out.println("Has ganado!");

                } else {

                    System.out.println("Has perdido!");
                }
            }
        }
        
    }
}