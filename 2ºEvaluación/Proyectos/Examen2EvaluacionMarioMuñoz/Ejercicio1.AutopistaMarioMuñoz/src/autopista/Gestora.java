/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopista;

/**
 *
 * @author Mario
 */
public class Gestora {

    /**
     * el número total de bicicletas que han pagado peaje
     */
    public int numBicicletas;
    /**
     * el número total de coches y motos que han pagado peaje
     */
    public int numCochesMotos;
    /**
     * el número total de camiones que han pagado peaje
     */
    public int numCamiones;
    /**
     * recaudación total obtenida por el pago de peaje de biciletas
     */
    public float recaudacionBicicletas;
    /**
     * recaudación total obtenida por el pago de peaje de coches y motos
     */
    public float recaudacionCochesMotos;
    /**
     * recaudación total obtenida por el pago de peaje de camiones
     */
    public float recaudacionCamiones;

    /**
     * Actualiza la recaudación obtenida por el paso de UN coche o moto o un
     * camión o una bicicleta(si el vehículo es un camion se actualizara la
     * recaudación de camiones pero si es un coche o una moto, se actualizará la
     * recaudación de coches y motos) También se incrementará el contador de
     * vehículos que corresponda (numBicicletas, numCochesMotos o numCamiones)
     *
     * @param vehiculo el vehículo que acaba de pasar por el peaje
     */
    public void actualizarInformacion(Vehiculo vehiculo) {

    }

    /**
     * Calcula el total que hasta el momento se ha recaudado en el peaje por el
     * paso de bicicletas,coches, motos y camiones
     *
     * @return
     */
    public float devolverTotalRecaudado() {
        return recaudacionCamiones + recaudacionCochesMotos + recaudacionBicicletas;
    }

    /**
     * devuelve un String con la siguiente información y en el siguiente
     * formato:
     *
     * TOTAL RECAUDADO:	17,50 €
     *
     * VEHICULO MÁS FRECUENTE:BICICLETA - COCHES_MOTOS
     *
     * BICIS	MOTOS_COCHES	CAMIONES 3 3 1 1,80 14,30 1,40
     *
     * @return
     */
    @Override
    public String toString() {
        return "TOTAL RECAUDADO:\t" + String.format("%.2f", devolverTotalRecaudado()) + " €\n"
                + "VEHICULO MAS FRECUENTE: " + devuelveTipoVehiculoMasFrecuente() + "\n"
                + "BICIS\tMOTOS_COCHES\tCAMIONES\n"
                + numBicicletas + "\t" + numCochesMotos + "\t\t" + numCamiones + "\t"
                + String.format("%.2f", recaudacionBicicletas) + "\t" + String.format("%.2f", recaudacionCochesMotos) + "\t\t" + String.format("%.2f", recaudacionCamiones);
    }

    /**
     * devuelve el tipo de vehículo más frecuente
     *
     * @return BICICLETA, CAMION o COCHE_MOTO (si la cantidad correspondiente al
     * menos frecuente coincide para varios tipos el String devuelto contendrá
     * todos los nombres de tipo coincidentes separados por un -)
     */
    public String devuelveTipoVehiculoMasFrecuente() {
        String vehiculoMasFrecuente = "";
        int frecuenciaVehiculoMasFrecuente = 0;

        // Compara la frecuencia de las bicicletas con la del vehículo más frecuente actual
        if (numBicicletas > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "BICICLETA";
            frecuenciaVehiculoMasFrecuente = numBicicletas;
        } else if (numBicicletas == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "BICICLETA-";
        }

        // Compara la frecuencia de los coches y motos con la del vehículo más frecuente actual
        if (numCochesMotos > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "COCHE_MOTO";
            frecuenciaVehiculoMasFrecuente = numCochesMotos;
        } else if (numCochesMotos == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "COCHE_MOTO-";
        }

        // Compara la frecuencia de los camiones con la del vehículo más frecuente actual
        if (numCamiones > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "CAMION";
            frecuenciaVehiculoMasFrecuente = numCamiones;
        } else if (numCamiones == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "CAMION-";
        }

        // Si hay más de un tipo de vehículo con la misma frecuencia, los concatena con un -
        if (vehiculoMasFrecuente.contains("-"))
        {
            vehiculoMasFrecuente = vehiculoMasFrecuente.substring(0, vehiculoMasFrecuente.length() - 1);
        }

        return vehiculoMasFrecuente;
    }
}
