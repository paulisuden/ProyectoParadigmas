package Entidades.Uvas;
/**
 * Clase Bonarda que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Bonarda extends Uva{
    public Bonarda(){
        nombreUva = "Bonarda";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Rubí";
        aroma = "Fruta Roja";
        intensidad = "Media";
        cuerpo = "Medio";
        sabor = "Suave";
        maridaje = "Quesos Duros";
        enumUva = TiposUva.Bonarda;
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
