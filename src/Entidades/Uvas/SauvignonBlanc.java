package Entidades.Uvas;
/**
 * Clase SauvignongBlanc que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class SauvignonBlanc extends Uva{
    public SauvignonBlanc(){
        nombreUva="Sauvignon Blanc";
        tipoUva = "Blanca";
        aparienciaVisual = "Tono amarillo pálido";
        aroma = "Refrescante";
        intensidad = "Media-Alta";
        cuerpo = "Ligero a medio";
        sabor = "Notas herbales y vegetales";
        maridaje = "Mariscos y pescados";
        enumUva = TiposUva.SauvignonBlanc;
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
