package Entidades;

/**
 * Clase EtapasElaboracion abstracta
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */


public abstract class EtapasElaboracion  {
    //Atributos
    protected int tiempo;
    protected String etapa;
    protected int cantCamiones;
    protected int cantBarriles;
    protected int cantBotellas;
    
    //Constructores

    public EtapasElaboracion(){
    }

    /**
     * @param tiempo guarda el tiempo que va a durar la respectiva etapa
     * @param etapa guarda la etapa en la que se va a encontrar el vino
     * @param cantCamiones guarda la cantidad de camiones disponibles
     * @param cantBarriles guarda la cantidad de barriles disponibles
     * @param cantBotellas guarda la cantidad de botellas disponibles
     */
    public EtapasElaboracion(int tiempo,String etapa, int cantCamiones, int cantBarriles, int cantBotellas){
        this.tiempo=tiempo;
        this.etapa=etapa;
        this.cantCamiones=cantCamiones;
        this.cantBarriles=cantBarriles;
        this.cantBotellas=cantBotellas;
    }

    public EtapasElaboracion(int tiempo, int cantCamiones) {
        this.tiempo=tiempo;
        this.cantCamiones=cantCamiones;
    }

    public EtapasElaboracion(int tiempo) {
        this.tiempo=tiempo;
    }


    //Getters y Setters
    public int getTiempo(){
        return tiempo;}
    public void setTiempo(int turno){
        this.tiempo=turno;}
    public String getEtapa(){
        return etapa;}
    public void setEtapa(String etapa){
        this.etapa=etapa;}

    public int getCantCamiones() {
        return cantCamiones;
    }

    public void setCantCamiones(int cantCamiones) {
        this.cantCamiones = cantCamiones;
    }

    public int getCantBotellas() {
        return cantBotellas;
    }

    public void setCantBotellas(int cantBotellas) {
        this.cantBotellas = cantBotellas;
    }

    public int getCantBarriles() {
        return cantBarriles;
    }

    public void setCantBarriles(int cantBarriles) {
        this.cantBarriles = cantBarriles;
    }


}
