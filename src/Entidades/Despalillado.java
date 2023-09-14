package Entidades;
/**
 * Clase Despalillado para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class Despalillado extends EtapasElaboracion{
    //Atributos
    private String tipo;

    /**
     * @param tipo indica el tipo de despalillado a realizar
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     */
    //Constructor
    public Despalillado(String tipo,int tiempo){
        super(tiempo);
        this.tipo=tipo;
    }

    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
