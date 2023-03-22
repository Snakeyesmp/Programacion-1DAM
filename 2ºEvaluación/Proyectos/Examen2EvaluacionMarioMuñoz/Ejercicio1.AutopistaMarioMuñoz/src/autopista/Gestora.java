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
     * el n�mero total de bicicletas que han pagado peaje
     */
    public int numBicicletas;
    /**
     * el n�mero total de coches y motos que han pagado peaje
     */
    public int numCochesMotos;
    /**
     * el n�mero total de camiones que han pagado peaje
     */
    public int numCamiones;
    /**
     * recaudaci�n total obtenida por el pago de peaje de biciletas
     */
    public float recaudacionBicicletas;
    /**
     * recaudaci�n total obtenida por el pago de peaje de coches y motos
     */
    public float recaudacionCochesMotos;
    /**
     * recaudaci�n total obtenida por el pago de peaje de camiones
     */
    public float recaudacionCamiones;

    /**
     * Actualiza la recaudaci�n obtenida por el paso de UN coche o moto o un
     * cami�n o una bicicleta(si el veh�culo es un camion se actualizara la
     * recaudaci�n de camiones pero si es un coche o una moto, se actualizar� la
     * recaudaci�n de coches y motos) Tambi�n se incrementar� el contador de
     * veh�culos que corresponda (numBicicletas, numCochesMotos o numCamiones)
     *
     * @param vehiculo el veh�culo que acaba de pasar por el peaje
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
     * devuelve un String con la siguiente informaci�n y en el siguiente
     * formato:
     *
     * TOTAL RECAUDADO:	17,50 �
     *
     * VEHICULO M�S FRECUENTE:BICICLETA - COCHES_MOTOS
     *
     * BICIS	MOTOS_COCHES	CAMIONES 3 3 1 1,80 14,30 1,40
     *
     * @return
     */
    @Override
    public String toString() {
        return "TOTAL RECAUDADO:\t" + String.format("%.2f", devolverTotalRecaudado()) + " �\n"
                + "VEHICULO MAS FRECUENTE: " + devuelveTipoVehiculoMasFrecuente() + "\n"
                + "BICIS\tMOTOS_COCHES\tCAMIONES\n"
                + numBicicletas + "\t" + numCochesMotos + "\t\t" + numCamiones + "\t"
                + String.format("%.2f", recaudacionBicicletas) + "\t" + String.format("%.2f", recaudacionCochesMotos) + "\t\t" + String.format("%.2f", recaudacionCamiones);
    }

    /**
     * devuelve el tipo de veh�culo m�s frecuente
     *
     * @return BICICLETA, CAMION o COCHE_MOTO (si la cantidad correspondiente al
     * menos frecuente coincide para varios tipos el String devuelto contendr�
     * todos los nombres de tipo coincidentes separados por un -)
     */
    public String devuelveTipoVehiculoMasFrecuente() {
        String vehiculoMasFrecuente = "";
        int frecuenciaVehiculoMasFrecuente = 0;

        // Compara la frecuencia de las bicicletas con la del veh�culo m�s frecuente actual
        if (numBicicletas > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "BICICLETA";
            frecuenciaVehiculoMasFrecuente = numBicicletas;
        } else if (numBicicletas == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "BICICLETA-";
        }

        // Compara la frecuencia de los coches y motos con la del veh�culo m�s frecuente actual
        if (numCochesMotos > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "COCHE_MOTO";
            frecuenciaVehiculoMasFrecuente = numCochesMotos;
        } else if (numCochesMotos == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "COCHE_MOTO-";
        }

        // Compara la frecuencia de los camiones con la del veh�culo m�s frecuente actual
        if (numCamiones > frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente = "CAMION";
            frecuenciaVehiculoMasFrecuente = numCamiones;
        } else if (numCamiones == frecuenciaVehiculoMasFrecuente)
        {
            vehiculoMasFrecuente += "CAMION-";
        }

        // Si hay m�s de un tipo de veh�culo con la misma frecuencia, los concatena con un -
        if (vehiculoMasFrecuente.contains("-"))
        {
            vehiculoMasFrecuente = vehiculoMasFrecuente.substring(0, vehiculoMasFrecuente.length() - 1);
        }

        return vehiculoMasFrecuente;
    }
}
