package Servicios;
import Entidades.Bodega;
import Entidades.Uvas.Uva;
import Entidades.Vino;

import java.util.ArrayList;

/**
 * Método actualizarMes() para actualizar el mes a medida que transcurran las etapas de elaboración
 * @version 1.0, 7/9/2023
 * @author Paulina Suden  */
public class BodegaServicios {
    public void actualizarMes(Bodega mesIngresado, int nuevoMes) {
        mesIngresado.setMesIngresado(nuevoMes);
    }

}


