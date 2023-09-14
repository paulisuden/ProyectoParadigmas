package Entidades.Uvas;
/**
 * Clase Godello que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Godello extends Uva {
    public Godello(){
        nombreUva = "Godello";
        tipoUva = "Blanca";
        aparienciaVisual = "Color Amarillo Duradero";
        aroma = "Manzana";
        intensidad = "Media";
        cuerpo = "Medio-Alto";
        sabor = "Frutas blancas y amarillas";
        maridaje = "Pescados Blancos y quesos suaves";
        enumUva = TiposUva.Godello;
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
