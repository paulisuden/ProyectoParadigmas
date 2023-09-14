package Entidades;
/**
 * Clase SegundaFermentacion para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */

public class SegundaFermentacion extends EtapasElaboracion{
    //Atributos
    private String tipo;

    /**
     * @param tipo indica el tipo de segunda fermentación que va a realizar el vino
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     */
    //Constructor
    public SegundaFermentacion(String tipo, int tiempo){
        super(tiempo);
        this.tipo=tipo;}


    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
