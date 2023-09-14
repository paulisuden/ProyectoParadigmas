package Entidades.Uvas;
/**
 * Clase PinotGris que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class PinotGris extends Uva {
    public PinotGris(){
        nombreUva = "Pinot Gris";
        tipoUva = "Tinta";
        aparienciaVisual = "Amarillo Oscuro";
        aroma = "Cítricos";
        intensidad = "Moderada";
        cuerpo = "Medio a pleno";
        sabor = "Mezcla de frutas tropicales";
        maridaje = "Carnes blancas y comida asiática";
        enumUva = TiposUva.PinotGris;
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
