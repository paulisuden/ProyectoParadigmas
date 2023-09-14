package Menu;

import Entidades.Vino;
import Interfaces.IConsultarEtapaActual;

import java.util.ArrayList;

/**
 * Clase para mostrar los vinos ya terminados (en la última etapa de elaboración)
 * @version 1.0, 9/9/2023
 */
public class ConsultarTerminados implements IConsultarEtapaActual {
    /**
     * Implementación del método consultarEtapa para mostrar el atributo estado de un objeto vino
     * En este caso se consulta ese atributo para todos los vinos
     * @see Vino
     * @param listaVinos : lista de todos los objetos vinos ingresados por el usuario
     */
    @Override
    public void consultarEtapa(ArrayList<Vino> listaVinos){
        IConsultarEtapaActual.super.consultarEtapa(listaVinos);
        boolean terminados=false;
        for (Vino vino : listaVinos){
            if (vino.getEtapa() == 10){
                System.out.println(vino.uva.getNombreUva() +" de id "+vino.getId()+" está terminado.");
                terminados = true;
            }
        }
        if (!terminados){
            System.out.println("No hay vinos terminados");
        }

    }
}
