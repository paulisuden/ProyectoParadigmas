package Entidades.Uvas;
/**
 * Clase Granacha que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Granacha extends Uva{
    public Granacha(){
        nombreUva = "Granacha";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo brillante";
        aroma = "Frutas Rojas";
        intensidad = "Media";
        cuerpo = "Medio";
        sabor = "Bayas y especias";
        maridaje = "Carnes a la parilla y embutidos";
        enumUva = TiposUva.Granacha;
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
