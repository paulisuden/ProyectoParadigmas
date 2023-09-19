package Menu;
import Entidades.EtapasEnum;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Entidades.Vino;
import Interfaces.IConsultarEtapaActual;


/**
 * Clase para cambiar la etapa de elaboracion de un vino
 * @version 1.0, 7/9/2023
 * @author Paula Martinez, Paulina Suden, Lautaro Larosa
 */
public class CambiarEtapa implements IConsultarEtapaActual {
    //Contructor
    public void cambiarEtapa(){}

    /**
     * Metodo para actualizar la etapa de elaboracion de la uva
     * @version 1.0, 8/9/2023
     * @author Paula Martinez, Paulina Suden, Lautaro Larosa
     * @see Vino
     * @see EtapasEnum
     * @param listaVinos lista de todos los vinos ingresados
     * */

    public void cambiarDeEtapa(ArrayList<Vino> listaVinos) {
        List<Integer> listaIds = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el id del vino que quiere cambiarle la etapa");
        int contador = 0;
        for (Vino vino: listaVinos ){
            if (vino.getEtapa()<10){
                contador++;
                System.out.println("Id del vino: "+vino.getId()+" - " +vino.uva.getNombreUva());
                listaIds.add(vino.getId());
            }
        }
        if (contador==0){
            System.out.println("No hay vinos disponibles para cambiar de etapa");
        }else{
            boolean vinoElegido = false;
            int eleccion=0;
            while (!vinoElegido) {
                try {
                    eleccion = entrada.nextInt();
                    for (int id : listaIds){
                        if (eleccion==id){
                            vinoElegido=true;
                        }
                    }
                    if(!vinoElegido){
                        System.out.println("Debe ingresar una de las id de los vinos disponibles");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    entrada.nextLine(); // "Limpiar" el búfer de entrada
                }
            }
            Vino vino = listaVinos.get(eleccion-1);
            System.out.println("Ha elegido el vino con uva: "+vino.uva.getNombreUva()+" de id: "+vino.getId());
            System.out.println(" ");
            System.out.println("¿Cuál es la nueva etapa actual? Elija la opción correspondiente:");
            int opcion = 1;
            for (EtapasEnum etapa : EtapasEnum.values()) {
                System.out.println(opcion + ") " + etapa);
                opcion += 1;
            }
            boolean elegida = false;

            while (!elegida) {
                int newEtapa;
                try {
                    newEtapa = entrada.nextInt();
                    if (newEtapa > vino.getEtapa() && newEtapa <= 10) {
                        elegida = true;
                        vino.setEtapa(newEtapa);
                        System.out.println("Excelente!");
                        consultarEtapa(listaVinos,vino);
                    } else {
                        System.out.println("Por favor, ingrese una etapa válida (opción mayor a " +vino.getEtapa() +" y hasta 10)");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    entrada.nextLine();
                }
            }
        }
    }

    /**
     * Implementacion del metodo consultarEtapa para mostrar el atributo estado de un objeto vino
     * @param listaVinos lista de todos los objetos vinos ingresados por el usuario
     * @param vino objeto vino al que se le va a consultar el estado
     */
    @Override
    public void consultarEtapa(ArrayList<Vino> listaVinos,Vino vino) {
        IConsultarEtapaActual.super.consultarEtapa(listaVinos,vino);
        EtapasEnum etapa = EtapasEnum.values()[vino.getEtapa()-1];
        System.out.println("Etapa actual de elaboración del vino " +vino.uva.getNombreUva() +" de id "+vino.getId()+" es: " +etapa);

    }


}
