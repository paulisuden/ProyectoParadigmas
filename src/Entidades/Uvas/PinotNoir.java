package Entidades.Uvas;
/**
 * Clase PinotNoir que hereda de la clase Uva
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public class PinotNoir extends Uva{
    public PinotNoir(){
        nombreUva="Pinot Noir";
        tipoUva = "Tinta";
        aparienciaVisual = "Rojo Claro";
        aroma = "Frutas Rojas";
        intensidad = "Baja-Media";
        cuerpo = "Ligero";
        sabor = "Delicado y Frutal";
        maridaje = "Aves y pescado";
        enumUva = TiposUva.PinotNoir;
    }

    /**
     * Implementacion del metodo abstracto imprimirInformacion
     */
    @Override
    public void imprimirInformacion() {
        System.out.println("La uva "+nombreUva+" tiene las siguientes características:");
        System.out.println("");
        super.imprimirInformacion();
    }
}
