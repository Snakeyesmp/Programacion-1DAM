/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Biberon {

    private int volumen;
    private Bote bote;

    public Biberon(int volumen, Bote bote) {
        this.volumen = volumen;
        this.bote = bote;
    }

    @Override
    public String toString() {
        return "biberon{" + "volumen=" + volumen + ", bote=" + bote + '}';
    }

    public Bote getBote() {
        return bote;
    }

    public double calcularNumeroCacitosDelBiberon() {

        return this.volumen / bote.getCcPorCacito();
    }

}
