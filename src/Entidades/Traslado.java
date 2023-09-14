package Entidades;
import Interfaces.IInfoCamiones;
/**
 * Clase Traslado para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class Traslado extends EtapasElaboracion implements IInfoCamiones {
    // Constructor
    public Traslado(){
    }

    /**
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     * @param cantCamiones guarda la cantidad de camiones disponibles
     */
    public Traslado(int tiempo,int cantCamiones) {
        super(tiempo, cantCamiones);
    }

    //Getters
    @Override
    public int getCantCamiones() {
        return cantCamiones;
    }
    public void setCantCamiones(int cantCamiones) {
        this.cantCamiones = cantCamiones;
    }


}
