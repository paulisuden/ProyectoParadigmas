package Entidades.Uvas;
/**
 * Clase Albariño que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Albarinio extends Uva{
    public Albarinio(){
        nombreUva = "Albariño";
        tipoUva = "Blanca";
        aparienciaVisual = "Amarillo Pálido";
        aroma = "Flores Blancas";
        intensidad = "Moderada";
        cuerpo = "Ligero a medio";
        sabor = "Cítricos y frutales";
        maridaje = "Frutas del mar y carnes blancas";
        enumUva = TiposUva.Albarinio;
    }

    /**
     * Implementación del método abstracto imprimirInformacion
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("La uva "+nombreUva+" tiene las siguientes características:");
        System.out.println("");
        super.imprimirInformacion();
    }
}
