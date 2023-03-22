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
public class Ejercicio4_Polideportivo {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        //Creo 3 arrays, uno bidimensional total, uno para almacenar dias y otro para almacenar horas
        int arrayNum[][] = new int[5][4];
        int sumaDia[] = new int[5];
        int sumaHora[] = new int[4];
        //Variables para alumnos totales por dia, los totales por cada hora, la suma total y para calcular la media luego
        int totalDia = 0, totalHora, totalSuma = 0, mediaAlumnos, numUsuario;
        String nombreDia = "", horaClase = "";

        //Se almacena el numero de alumnos en cada valor del array
        for (int fila = 0; fila <= 4; fila++) {
            for (int Columna = 0; Columna <= 3; Columna++) {
                arrayNum[fila][Columna] = (int) (Math.random() * (20 - 10) + 10); //Aleatorio en un rango: Math.random() * (max - min) + min
                sumaDia[fila] = sumaDia[fila] + arrayNum[fila][Columna];
                totalDia = sumaDia[0] + sumaDia[1] + sumaDia[2] + sumaDia[3] + sumaDia[4];
            }
        }
        //Se imprimen los valores de los alumnos por clase, y,en la ultima columna,la suma de cada dia
        for (int fila = 0; fila <= 4; fila++) {
            //Asigno un dia de la semana a cada numero de la fila
            switch (fila) {
                case 0 ->
                    nombreDia = "Lunes";

                case 1 ->
                    nombreDia = "Martes";

                case 2 ->
                    nombreDia = "Miercoles";

                case 3 ->
                    nombreDia = "Jueves";

                case 4 ->
                    nombreDia = "Viernes";
            }
            System.out.print(nombreDia + ": ");
            for (int columna = 0; columna <= 3; columna++) {
                System.out.print(arrayNum[fila][columna] + " ");
                sumaHora[columna] = sumaHora[columna] + arrayNum[fila][columna];
                totalSuma = (totalSuma + arrayNum[fila][columna]);
            }
            //Suma de los dias (filas)
            System.out.print("Suma= " + sumaDia[fila]);
            System.out.println(" ");
        }
        //Se imprime, en la última fila, la suma de cada hora
        System.out.print("+:");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + sumaHora[i]);
        }
        //Se calcula la suma total de las horas (columnas)
        totalHora = sumaHora[0] + sumaHora[1] + sumaHora[2] + sumaHora[3];
        //Se hace la suma total de alumnos, que es el total de la filas más el total de las columnas
        //Se imprime el total de alumnos semanales abajo a la derecha del todo el la tabla
        System.out.println(" Suma total semanal= " + totalSuma);
        //Se deja un espacio en blanco por claridad visual
        System.out.println("");
        //Se calcula y se imprime la media total
        mediaAlumnos = (totalSuma / 20);
        System.out.println("La media de alumnos semanales es: " + mediaAlumnos);
        //Se pide al usuario que introduzca numero de alumnos que se buscará en el array
        System.out.println("Introduzca el numero a buscar");
        numUsuario = enter.nextInt();

        //Se recorre todo el array buscando si el numero de alumnos introducido por el usuario coincide con algun valor del array, y lo imprime por pantalla
        for (int fila = 0; fila <= 4; fila++) {
            for (int columna = 0; columna <= 3; columna++) {

                //Asigno un dia de la semana segun el numero de la fila en el que esté
                switch (fila) {
                    case 0 ->
                        nombreDia = "Lunes";

                    case 1 ->
                        nombreDia = "Martes";

                    case 2 ->
                        nombreDia = "Miercoles";

                    case 3 ->
                        nombreDia = "Jueves";

                    case 4 ->
                        nombreDia = "Viernes";
                }
                //Asigno una hora segun el numero de la columna en el que esté 
                switch (columna) {
                    case 0 ->
                        horaClase = "16:00";

                    case 1 ->
                        horaClase = "17:00";

                    case 2 ->
                        horaClase = "18:00";

                    case 3 ->
                        horaClase = "19:00";
                }
                if (arrayNum[fila][columna] == numUsuario) {
                    //Imprime qué numero había pedido el usuario y en que posicion del array está
                    System.out.println("Habia " + numUsuario + " alumnos el " + nombreDia + " a las " + horaClase);
                }
            }
        }
    }
}
