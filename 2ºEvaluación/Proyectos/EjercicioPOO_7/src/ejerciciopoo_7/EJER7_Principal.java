/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_7;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJER7_Principal {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Introduzca el numero de empleados, el numero maximo son 20");
        int numEmpleados = sc.nextInt();
        Empleado[] empleado = new Empleado[numEmpleados];

        for (int i = 0; i <= numEmpleados; i++) {
            empleado[i] = new Empleado();

            sc.nextLine();

            System.out.println("Introduce el nif del empleado");
            empleado[i].setNif(sc.nextLine());
            System.out.println("Introduce el sueldo base del empleado");
            empleado[i].setSueldoBase(sc.nextDouble());
            System.out.println("Introduce el IRPF");
            empleado[i].setIrpf(sc.nextDouble());
            System.out.println("Introduce si esta casado o no 'true' o 'false'");
            empleado[i].setCasado(sc.nextBoolean());
            System.out.println("Introduzca el numero de hijos del empleado");
            empleado[i].setNumeroHijos(sc.nextInt());
            System.out.println("Introduzca el numero de horas extras trabajadas este mes");
            empleado[i].setHorasExtraMes(sc.nextInt());

            System.out.println(empleado[i]);
        }
    }
}
