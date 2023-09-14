package Entidades;

import Interfaces.IInfoBarriles;
/**
 * Clase Crianza para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class Crianza extends EtapasElaboracion implements IInfoBarriles {
    // Constructor
    public Crianza(){
    }

    /**
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     * @param cantBarriles indica la cantidad de barriles que hay disponibles
     */
    public Crianza(int tiempo,int cantBarriles){
        super(tiempo,cantBarriles);
    }

    public int getCantBarriles() {
        return cantBarriles;
    }
    public void setCantBarriles(int cantBarriles) {
        this.cantBarriles = cantBarriles;
    }

}
