package Entidades.Uvas;
/**
 * Clase CabernetFranc que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class CabernetFranc extends Uva{
    public CabernetFranc(){
        nombreUva = "Cabernet Franc";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Rubí(vinos jóvenes) y Morado Oscuro(vinos envejecidos)";
        aroma = "Vainilla";
        intensidad = "Media-Alta";
        cuerpo = "Medio-Alto";
        sabor = "Frutos rojos";
        maridaje = "Carnes Rojas y aves";
        enumUva = TiposUva.CabernetFranc;
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
