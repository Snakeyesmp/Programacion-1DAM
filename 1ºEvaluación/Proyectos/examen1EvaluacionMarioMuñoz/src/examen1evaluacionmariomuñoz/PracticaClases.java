/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class PracticaClases {

    public static void main(String[] args) {

        String respuesta;
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        if (edad >= 18) {
            respuesta = "Usted es mayor de edad";
        } else {
            respuesta = "Usted es menor de edad";
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
}