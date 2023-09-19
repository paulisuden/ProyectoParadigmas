package Entidades;
import Entidades.Uvas.Uva;

/**
 * Clase Vino guarda los detalles de cada vino
 * @version 1.0, 7/9/2023
 * @author Paulina Suden
 * @see Uva
 */
public class Vino {
    private final int id;
    public Uva uva;
    private int etapa;

    /**
     * @param id identifica el vino
     * @param uva guarda todas las caracteristicas de dicho vino
     * @param etapa guarda la etapa actual de elaboracion del vino
     */
    public Vino(int id, Uva uva, int etapa) {
        this.id = id;
        this.uva = uva;
        this.etapa = etapa;
    }

    /**
     * Getter de Etapa
     * @return etapa
     */
    public int getEtapa() {
        return etapa;
    }

    /**
     * Setter de etapa
     * @param etapa guarda la etapa actual de elaboracion del vino
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    /**
     * Getter de Id
     * @return id
     */
    public int getId() {
        return id;
    }

}
