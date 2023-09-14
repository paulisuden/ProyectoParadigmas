package Entidades;
/**
 * Clase PrimeraFermentacion para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class PrimeraFermentacion extends EtapasElaboracion{
    /**
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     */
    //Constructor
    public PrimeraFermentacion(int tiempo){
        super(tiempo);
    }
}
