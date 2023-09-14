package Entidades;

/**
 * Clase Cosecha para definir una de las etapas de producción
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */


public class Cosecha extends EtapasElaboracion{
    //Atributos
    private String tipo;

    /**
     * @param tipo indica el tipo de Cosecha (manual o mecánica) que se va a realizar
     * @param tiempo indica el tiempo que tarda esta etapa dependiendo el tipo de vino
     */
    //Constructor
    public Cosecha(String tipo, int tiempo){
        super(tiempo);
        this.tipo=tipo;}
    public Cosecha(){
        }

    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
