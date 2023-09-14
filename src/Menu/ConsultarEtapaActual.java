package Menu;
import Entidades.EtapasEnum;
import Entidades.Vino;
import Interfaces.IConsultarEtapaActual;

import java.util.ArrayList;

/**
 * Clase para consultar la etapa de elaboración en la que se encuentra un vino
 * @version 1.1, 9/9/2023
 */
public class ConsultarEtapaActual implements IConsultarEtapaActual {
    //Constructor
    public static void consultarEtapaActual(){}

    /**
     * Método consultarEtapa() para informarle al usuario la etapa actual de elaboración de una uva en específico
     * En este caso se consulta ese atributo para todos los vinos
     * @param listaVinos : lista de todos los objetos vinos ingresados por el usuario
     * @see Vino
     */

    @Override
    public void consultarEtapa(ArrayList<Vino> listaVinos){
        IConsultarEtapaActual.super.consultarEtapa(listaVinos);
        for (Vino vino : listaVinos){
            EtapasEnum etapa = EtapasEnum.values()[vino.getEtapa()-1];
            System.out.println("Etapa actual de elaboración del vino " +vino.uva.getNombreUva() +" de id "+vino.getId() +" es: " +etapa);
        }
    }


}
