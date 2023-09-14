package Entidades;

/**
 * Enumeracion EtapasNum donde cada valor representa las etapas de elaboración del vino
 * @version 1.0 , 07/09/2023
 * @author Lautaro Larosa
 */
public enum EtapasEnum {
    MaduracionUva,
    Cosecha,
    Traslado,
    Despalillado,
    TrasladoDeposito,
    PrimeraFermentacion,
    SegundaFermentacion,
    Limpieza,
    Crianza,
    Embotellamiento;

    /**
     * Método imprimir etapas que imprime por pantalla las etapas de la elaboración del vino
     */
    public static void imprimirEtapas(){
        int cont = 1;
        for (EtapasEnum etapa : EtapasEnum.values()){
            System.out.println(cont+": "+etapa);
            cont += 1;
        }
        System.out.println(" ");
    }
}
