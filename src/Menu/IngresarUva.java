package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.EtapasEnum;
import Entidades.Uvas.*;
import Entidades.Bodega;
import Entidades.Vino;
import Entidades.Uvas.TiposUva;


/**
 * Clase IngresarUva en el cual el usuario ingresa y almacenamos un objeto uva en el objeto vino
 * @version 1.0, 8/9/2023
 * @see EtapasEnum
 * @see Uva
 * @see TiposUva
 * @see Bodega
 * @author Paula Martinez, Paulina Suden, Lautaro Larosa
 */

public class IngresarUva {
    public IngresarUva() {}
    public void ingresarUva(int cont, Bodega vinoSabroso) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A continuación elija la opción entre 1 y 15 de la uva que desea ingresar:");
        TiposUva.imprimirTipoUva();

        int opcion = 1;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                opcion = scan.nextInt();
                entradaValida = opcion >= 1 && opcion <= 15;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entre 1 y 15.");
                scan.nextLine(); // "Limpiar" el búfer de entrada
            }
        }
        Uva nuevaUva = elegirUva(opcion);
        System.out.println("");
        System.out.println("Ahora ingrese la etapa entre 1 y 10 en la cual quiere que este su uva: ");
        EtapasEnum.imprimirEtapas();

        entradaValida = false;
        while (!entradaValida) {
            try {
                opcion = scan.nextInt();
                entradaValida = opcion >= 1 && opcion <= 10;

            } catch (InputMismatchException e) {
                System.out.println("Error,ingrese un número entre 1 y 10.");
                scan.nextLine();
            }
        }

        Vino nuevoVino = new Vino(cont, nuevaUva, opcion);
        vinoSabroso.getListaVinos().add(nuevoVino);
        vinoSabroso.mostrarVino();

    }

    /**
     * Metodo elegirUva en donde creamos el objeto de la uva elegida por el usuario
     * @param opcion es la opcion que eligio previamente el usuario
     * @return retorna finalmente el objeto de la clase correspodiente a esa uva
     */
    public Uva elegirUva(int opcion){
        Uva nuevaUva = null;
        TiposUva valor = TiposUva.values()[opcion-1];
        Class<?> claseUva = valor.getClase(); // obtener la clase asociada.
        try {
            nuevaUva = (Uva) claseUva.getDeclaredConstructor().newInstance(); //Crea el objeto
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nuevaUva;
    }
}
