package Entidades.Uvas;

/**
 * Enumeración TiposUva en donde representa los 15 tipos de uva que puede seleccionar el usuario
 * @version 1.3, 07/09/2023
 * @author Lautaro
 */

public enum TiposUva {
    CabernetSauvignon(CabernetSauvignon.class),
    Merlot(Merlot.class),
    Tempranillo(Tempranillo.class),
    Granacha(Granacha.class),
    PinotNoir(PinotNoir.class),
    Bonarda(Bonarda.class),
    PinotGris(PinotGris.class),
    Chardonnay(Chardonnay.class),
    SauvignonBlanc(SauvignonBlanc.class),
    Verdejo(Verdejo.class),
    Albarinio(Albarinio.class),
    Godello(Godello.class),
    Malbec(Malbec.class) ,
    CabernetFranc(CabernetFranc.class),
    MoscatelAlejandria(MoscatelAlejandria.class);

    private Class<?> clase;


    /**
     * método que muestra todas las uvas en una lista ordenada
     */
    public static void imprimirTipoUva(){
        int cont = 1;
        for (TiposUva tipo : TiposUva.values()){
            System.out.println(cont+": "+tipo);
            cont++;
        }
        System.out.println("");
    }

    /**
     *
     * @param clase la clase que se asigna como característica al valor del enum
     */
    TiposUva(Class<?> clase){
        this.clase = clase;
    }

    /**
     * @return clase que quiero obtener
     */
    public Class<?> getClase() {
        return clase;
    }
}
