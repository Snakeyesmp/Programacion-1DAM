/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bebe {

    String nombre;
    int numeroBiberonesDiarios;
    private Biberon biberon;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroBiberonesDiarios() {
        return numeroBiberonesDiarios;
    }

    public void setNumeroBiberonesDiarios(int numeroBiberonesDiarios) {
        this.numeroBiberonesDiarios = numeroBiberonesDiarios;
    }

    public Biberon getBiberon() {
        return biberon;
    }

    public void setBiberon(Biberon biberon) {
        this.biberon = biberon;
    }

    public Bebe(int numeroBiberonesDiarios, String nombre, Biberon biberon) {
        this.nombre = nombre;
        this.numeroBiberonesDiarios = numeroBiberonesDiarios;
        this.biberon = biberon;
    }

    @Override
    public String toString() {
        return "bebe{" + "nombre=" + nombre + ", numeroBiberonesDiarios=" + numeroBiberonesDiarios + ", biberon=" + biberon + '}';
    }

    public double calcularCosteSemanal() {
        double cacitosDeUnBiberon = this.biberon.calcularNumeroCacitosDelBiberon();
        double cacitosDeUnaSemana = 7 * this.numeroBiberonesDiarios * cacitosDeUnBiberon;
        Bote boteLeche = this.biberon.getBote();
        double precio1Cacito = boteLeche.calcularPrecioCacito();
        return cacitosDeUnaSemana * precio1Cacito;
    }

}
