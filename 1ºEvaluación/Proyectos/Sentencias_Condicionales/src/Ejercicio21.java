/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        Scanner intro = new Scanner(System.in);

        //variables
        float nota1, nota2, media;
        String recu;

        System.out.println("Introduce las notas de los dos primeros controles");

        nota1 = enter.nextFloat();
        nota2 = enter.nextFloat();
        media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota en programacion es " + media);
        } else {
            System.out.println("cual ha sido el resultado de la recuperacion? Apto / No apto");
        }
        recu = intro.nextLine();
        switch (recu) {
            case "Apto" -> {
                System.out.println("Eres apto y tu media pasa a ser 5");

            }
            case "No apto" -> {
                System.out.println("No eres apto y tu media es " + media);
            }
        }
    }
}
