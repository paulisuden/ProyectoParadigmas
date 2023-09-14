package Entidades.Uvas;
/**
 * Clase Verdejo que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Verdejo extends Uva{
    public Verdejo(){
        nombreUva="Verdejo";
        tipoUva = "Blanca";
        aparienciaVisual = "Amarillo Verdoso";
        aroma = "Frutal intenso";
        intensidad = "Media-Alta";
        cuerpo = "Ligero a medio";
        sabor = "Frutos secos y miel";
        maridaje = "Pollo ligero y Mariscos";
        enumUva = TiposUva.Verdejo;
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
