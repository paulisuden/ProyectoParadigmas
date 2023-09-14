package Entidades;

import Interfaces.IInfoBotellas;

/**
 * Clase Embotellamiento para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class Embotellamiento extends EtapasElaboracion implements IInfoBotellas {
    //Atributos
    private String tipoBotella;

    /**
     * @param tipoBotella indica el tipo de botella que se va a usar dependiendo del vino
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     * @param cantBotelllas guarda la cantidad de botellas que hay disponibles para el embotellado
     */
    //Constructor
    public Embotellamiento(String tipoBotella,int tiempo, int cantBotelllas){
        super(tiempo);
        this.tipoBotella = tipoBotella;
        this.cantBotellas = cantBotelllas;
    }
    public Embotellamiento() {
    }

    //Getters y Setters
    public String getTipoBotella(){
        return tipoBotella;}
    public void setTipoBotella(String tipoBotella){
        this.tipoBotella=tipoBotella;}
    public int getCantBotellas() {
        return cantBotellas;
    }
    public void setCantBotellas(int cantBotellas) {
        this.cantBotellas = cantBotellas;
    }

}
