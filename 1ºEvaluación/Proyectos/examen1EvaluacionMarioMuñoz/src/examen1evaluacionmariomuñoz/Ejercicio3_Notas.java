/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import java.util.Scanner;

/**
 *
 * @author Mario Muñoz Pequeño
 */
public class Ejercicio3_Notas {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        //Se crean e inicializan variables a utilizar
        double nota;
        double suma = 0;
        double media = 0;
        int numAprobados = 0;   //Contador de aprobados
        int numSuspensos = 0;   //Contador de suspensos
        int numTotales = 0;     //Contador de notas totales
        //Se pide al usuario que introduzca la primera nota y se guarda en un escaner
        System.out.println("Introduzca las notas.");
        nota = enter.nextDouble();
        //Se hace un Do...While de leer las notas introducidas hasta que el numero sea negativo
        do {
            //Si la nota es mayor de 10 saltará un error
            if (nota > 10) {
                System.out.println("ERROR Introduzca un numero maximo de 10"); //Si la nota es superior a 10 salta un error
                break;
            } else {
                if (nota < 0) {
                    System.out.println("Notas recibidas, los resultados son: ");
                    break;              //Sale del bucle si se introduce un numero negativo
                } else {
                    suma = suma + nota;
                    if (nota > 4) {
                        ++numAprobados; //Contador de notas aprobadas
                        ++numTotales;   //Contador de notas, este aprobado o suspenso
                    } else {
                        ++numSuspensos; //Contador de notas suspensas
                        ++numTotales;   //Contador de notas, este aprobado o suspenso
                    }
                    nota = enter.nextDouble();
                }
            }
        } while (nota > -1);
        //se calcula la media de todas las notas
        media = (suma / numTotales);
        //Se imprime la media, cuanto aprobados hay y cuantos suspensos hay
        System.out.println("La media es " + media + " el numero de aprobados es " + numAprobados + ", el numero de suspensos es " + numSuspensos);
    }
}
