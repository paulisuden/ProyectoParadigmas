package Entidades.Uvas;
/**
 * Clase Tempranillo que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Tempranillo extends Uva{
    public Tempranillo(){
        nombreUva="Tempranillo";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Granate";
        aroma = "Frutas Rojas";
        intensidad = "Media-Alta";
        cuerpo = "Medio";
        sabor = "Frutas Maduras";
        maridaje = "Jamón y Cordero";
        enumUva = TiposUva.Tempranillo;
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
