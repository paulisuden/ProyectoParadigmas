package Entidades;
import Interfaces.IInfoCamiones;
/**
 * Clase TrasladoDeposito para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class TrasladoDeposito extends EtapasElaboracion implements IInfoCamiones {

    // Constructor
    public TrasladoDeposito(){
    }

    /**
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     * @param cantCamiones guarda la cantidad de camiones disponibles
     */
    public TrasladoDeposito(int tiempo, int cantCamiones) {
        super(tiempo,cantCamiones);
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
