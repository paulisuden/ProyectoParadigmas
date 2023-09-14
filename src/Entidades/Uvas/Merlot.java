package Entidades.Uvas;
/**
 * Clase Merlot que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class Merlot extends Uva{
    public Merlot(){
        nombreUva = "Merlot";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Rubí";
        aroma = "Ciruelas";
        intensidad = "Media-alta";
        cuerpo = "Medio";
        sabor = "Suave y Frutal";
        maridaje = "Pollo,cerdo";
        enumUva = TiposUva.Merlot;
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
