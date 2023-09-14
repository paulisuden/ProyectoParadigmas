package Entidades;
import Entidades.Uvas.Uva;

/**
 * Clase Vino guarda los detalles de cada vino
 * @version 1.0, 7/9/2023
 * @author Paulina Suden
 */
public class Vino {
    private final int id;

    public Uva uva;
    private int etapa;

    /**
     * @param id identifica el vino
     * @param uva guarda todas las características de dicho vino
     * @param etapa guarda la etapa actual de elaboración del vino
     */

    //Constructor
    public Vino(int id, Uva uva, int etapa) {
        this.id = id;
        this.uva = uva;
        this.etapa = etapa;
    }

    //Get y Set de etapa
    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public int getId() {
        return id;
    }

    //public void setId(int id) {this.id = id;}
}
