/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_10;

/**
 *
 * @author admin
 */
public class Caballos {

    private String nombre, color;
    private int edad, carrerasGanadas;
     
    public Caballos(String nombre, String color, int edad, int carrerasGanadas) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    public Caballos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int carrerasGanadas) {
        this.carrerasGanadas = carrerasGanadas;
    }

    public void cabalga() {
        System.out.println(" el caballo hace 'tocoto tocoto tocoto tocoto' (onomatopeya de caballo cabalgando) ");
    }

    public void relincha() {
        System.out.println(" el caballo dice 'hiiiii ' (onomatopeya de un caballo relinchando )");
    }

    public void rumia() {
        System.out.println("el caballo dice 'que rico!' ");
    }

    @Override
    public String toString() {
        return "\n nombre=" + nombre + "\n color=" + color + "\n edad=" + edad + "\n carrerasGanadas=" + carrerasGanadas;
    }

}