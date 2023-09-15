package Entidades.Uvas;

/**
 * Clase Abstracta Uva en donde definimos como atributo las caracteristicas de cada uva
 * @version 1.0,07/09/2023
 * @author Lautaro Larosa
 */

public abstract class Uva{
    protected TiposUva enumUva;
    protected String nombreUva;
    protected String tipoUva;
    protected String aparienciaVisual;
    protected String aroma;
    protected String intensidad;
    protected String cuerpo;
    protected String sabor;
    protected String maridaje;

    public String getNombreUva() {return nombreUva;}
    public String getTipoUva() {return tipoUva;}
    public String getAparienciaVisual() {
        return aparienciaVisual;
    }
    public String getAroma() {
        return aroma;
    }
    public String getIntensidad() {
        return intensidad;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public String getSabor() {
        return sabor;
    }
    public String getMaridaje() {
        return maridaje;
    }
    public TiposUva getEnumUva(){ return enumUva;}

    /**
     * Metodo polimorifco sin parametros ni return en donde imprimimos las caracteristicas de la uva
     */
    public void imprimirInformacion(){
        System.out.println("1-Tipo de Uva: "+getTipoUva());
        System.out.println("2-Apariencia Visual: " +getAparienciaVisual());
        System.out.println("3-Aroma: "+getAroma());
        System.out.println("4-Intensidad: "+getIntensidad());
        System.out.println("5-Cuerpo: "+getCuerpo());
        System.out.println("6-Sabor: "+getSabor());
        System.out.println("7-Maridaje: "+getMaridaje());
    }

}
