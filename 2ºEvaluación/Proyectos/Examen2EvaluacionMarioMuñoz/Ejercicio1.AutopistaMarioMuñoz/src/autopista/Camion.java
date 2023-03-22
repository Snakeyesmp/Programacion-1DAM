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
public class Camion extends Vehiculo {
    /**
     * Cantidad base que paga un camión (no incluye los gastos de gestión, 
     * ni el pago por los kms recorridos ni el pago por el tonelaje)
     */
    public static float PRECIO_BASE = 0.25f;
    /**
     * lo que se le cobra al camión por cada km recorrido
     */
    public static float PRECIO_POR_KM = 0.01f;
    /**
     * Lo que se le cobra al camión por cada tonelada que pesa
     */
    public static float PRECIO_POR_TONELADA_DE_PESO = 0.02f;
    /**
     * los kms recorridos por el camión
     */
    private final float kms;
    /**
     * El número de toneladas de peso del camión
     */
    private final float tonelaje;

    public Camion(float kms, float tonelaje, String referenciaTicket) {
        super(referenciaTicket);
        this.kms = kms;
        this.tonelaje = tonelaje;
    }
/**
     * Calcula lo que debe pagar el vehículo por el peaje (incluyendo los gastos
     * de gestión)
     * @return 
     */
    @Override
    float devolverImporte() {
        return PRECIO_BASE+(PRECIO_POR_KM*kms)+(PRECIO_POR_TONELADA_DE_PESO*tonelaje)+GASTOS_GESTION;
    }
}