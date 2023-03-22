/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.vehiculos;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Garaje {

    private ArrayList<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("El vehiculo ha sido guardado en el garaje.");
    }

    public void sacarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
        System.out.println("El vehiculo ha sido sacado del garaje.");
    }

    public void mostrarTodosLosVehiculos() {
        if (vehiculos.size() == 0)
        {
            System.out.println("No hay vehiculos en el garaje.");
        } else
        {
            for (Vehiculo vehiculo : vehiculos)
            {
                vehiculo.imprimir();
            }
        }
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.contains(vehiculo))
        {
            vehiculo.imprimir();
        } else
        {
            System.out.println("El vehiculo no está en el garaje.");
        }
    }

    public void vaciarGaraje() {
        vehiculos.clear();
        System.out.println("El garaje ha sido vaciado.");
    }
}
