package Entidades.Uvas;
/**
 * Clase MoscatelAlejandria que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class MoscatelAlejandria extends Uva{
    public MoscatelAlejandria(){
        enumUva = TiposUva.MoscatelAlejandria;
        nombreUva = "Moscatel Alejandría";
        tipoUva = "Blanca";
        aparienciaVisual = "Color Dorado";
        aroma = "Flor de azahar";
        intensidad = "Alta";
        cuerpo = "Ligero-Medio";
        sabor = "Canela o vainilla";
        maridaje = "Frutas Frescas y secas";
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
