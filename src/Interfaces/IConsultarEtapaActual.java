package Interfaces;
import Entidades.Vino;
import java.util.ArrayList;

/**
 * Clase Interface IConsultarEtapaActual que tiene un metodo para mostrar el atributo estado de un objeto vino
 * @version 1.3 13/9
 * @author Paulina Suden
 */
public interface IConsultarEtapaActual {
    /**
     * Muestra el estado de un objeto vino
     * @param listaVinos lista de todos los objetos vinos ingresados por el usuario
     * @param vino objeto vino al que se le va a consultar el estado
     */
    default void consultarEtapa(ArrayList<Vino> listaVinos,Vino vino){
    }
    default void consultarEtapa(ArrayList<Vino> listaVinos){
    }
}
