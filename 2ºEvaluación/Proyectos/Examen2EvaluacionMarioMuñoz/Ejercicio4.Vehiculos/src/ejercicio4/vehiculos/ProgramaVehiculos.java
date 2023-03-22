/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.vehiculos;

/**
 *
 * @author admin
 */
public class ProgramaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREO UNA NUEVA INSTANCIA DE GARAJE
        Garaje miGaraje = new Garaje();
        // CREO UN PAR DE COCHES Y LOS AÑADO AL GARAJE
        Coche coche1 = new Coche("1234ABC", "Renault", 4, true);
        miGaraje.guardarVehiculo(coche1);
        Coche coche2 = new Coche("456EFG", "Seat Panda", 4, false);
        miGaraje.guardarVehiculo(coche2);
        // CREO UN PAR DE MOTOS Y LAS AÑADO AL GARAJE
        Moto moto1 = new Moto("4685JGM", "Yamaha R1", 2, "rojo");
        miGaraje.guardarVehiculo(moto1);
        Moto moto2 = new Moto("8765PMV", "MotitoBrum", 2, "rojo");
        miGaraje.guardarVehiculo(moto2);
        // CREO UN PAR DE BARCOS Y LOS AÑADO AL GARAJE
        Barco barco1 = new Barco("ABCDEFGHIJ", "Titanic", 300, true);
        miGaraje.guardarVehiculo(barco1);
        Barco barco2 = new Barco("KLMNOPQRST", "BarcoChanquete", 200, false);
        miGaraje.guardarVehiculo(barco1);
        // CREO UN PAR DE SUBMARINOS Y LOS AÑADO AL GARAJE
        Submarino submarino1 = new Submarino("KLMNOPQR", "Nautilus", 500, 9);
        miGaraje.guardarVehiculo(submarino1);
        Submarino submarino2 = new Submarino("STUVWXY", "SubmarinoPaco", 300, 16);
        miGaraje.guardarVehiculo(submarino2);
        // MUESTRO EL COCHE1
        miGaraje.mostrarVehiculo(coche1);
        // MUESTRO TODOS LOS VEHICULOS QUE HAY EN EL GARAJE
        miGaraje.mostrarTodosLosVehiculos();
        // SACO EL COCHE1 DEL GARAJE
        miGaraje.sacarVehiculo(coche1);
        // VACIO EL GARAJE POR COMPLETO
        miGaraje.vaciarGaraje();
        // MUESTRO TODOS LOS VEHÍCULOS QUE HAY EN EL GARAJE(ESTÁ VACÍO)
        miGaraje.mostrarTodosLosVehiculos();
    }

}
