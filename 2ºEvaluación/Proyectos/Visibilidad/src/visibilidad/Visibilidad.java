/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidad;

import Paquete2.Persona;

/**
 *
 * @author admin
 */
public class Visibilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre = "Juan", apellido = "Pepe";

        Persona p1 = new Persona(nombre, apellido);

        p1.setNombre("Juan");
        p1.setApellido("Perez");
        p1.setEdad(18);
        p1.saludar(p1.getNombre(), p1.getApellido());
                
        p1.usarBoca();
        
    }

}
