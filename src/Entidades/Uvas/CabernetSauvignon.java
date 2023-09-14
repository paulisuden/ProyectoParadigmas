package Entidades.Uvas;
/**
 * Clase CabernetSauvignon que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class CabernetSauvignon extends Uva {
    public CabernetSauvignon(){
        nombreUva = "Cabernet Sauvignon";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo y intenso";
        aroma = "Grosella";
        intensidad = "Media-alta";
        cuerpo = "Completo";
        sabor = "Frutas Oscuras";
        maridaje = "Carnes Rojas Asadas";
        enumUva = TiposUva.CabernetSauvignon;
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
