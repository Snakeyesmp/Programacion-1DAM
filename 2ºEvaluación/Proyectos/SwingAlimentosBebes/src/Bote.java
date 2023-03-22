/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bote {

    private int ccPorCacito = 30, gramosPorCacito = 5, pesoBoteGramos;
    private double precioBote;

    public double calcularPrecioGramo() {
        return this.precioBote / this.pesoBoteGramos;
    }

    public double calcularPrecioCacito() {
        return this.calcularPrecioGramo() * this.gramosPorCacito;

    }

    public Bote(int pesoBoteGramos, double precioBote) {
        this.pesoBoteGramos = pesoBoteGramos;
        this.precioBote = precioBote;
    }

    public int getCcPorCacito() {
        return ccPorCacito;
    }

    public void setCcPorCacito(int ccPorCacito) {
        this.ccPorCacito = ccPorCacito;
    }

    public int getGramosPorCacito() {
        return gramosPorCacito;
    }

    public void setGramosPorCacito(int gramosPorCacito) {
        this.gramosPorCacito = gramosPorCacito;
    }

    public int getPesoBoteGramos() {
        return pesoBoteGramos;
    }

    public void setPesoBoteGramos(int pesoBoteGramos) {
        this.pesoBoteGramos = pesoBoteGramos;
    }

    public double getPrecioBote() {
        return precioBote;
    }

    public void setPrecioBote(double precioBote) {
        this.precioBote = precioBote;
    }

}
