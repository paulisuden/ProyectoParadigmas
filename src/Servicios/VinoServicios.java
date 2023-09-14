package Servicios;
import Entidades.Vino;
/**
 * Clase VinoServicios actualiza y muestra la etapa, y verifica si un vino ya se ha terminado de elaborar
 * @version 1.0, 7/9/2023
 * @author Paulina Suden
 */
public class VinoServicios {


    public void actualizarEtapa(Vino etapa, int newEtapa) {
        etapa.setEtapa(newEtapa);
    }
    public void mostrarEtapa(Vino etapa) {
        System.out.println("Etapa actual: " +etapa.getEtapa());
    }
}