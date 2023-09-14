package Menu;

import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Entidades.EtapasEnum;
import Entidades.Uvas.*;
import Entidades.Bodega;
import Entidades.Vino;
import Entidades.Uvas.TiposUva;
import Servicios.BodegaServicios;

/**
 * Clase IngresarUva en el cual el usuario ingresa y almacenamos un objeto uva en el objeto vino
 * @version 1.0, 8/9/2023
 */

public class IngresarUva {
    public IngresarUva() {
    }

    public static void ingresarUva(int cont, Bodega vinoSabroso) {
        Vino nuevoVino;
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

        nuevoVino = new Vino(cont, nuevaUva, opcion);
        vinoSabroso.getListaVinos().add(nuevoVino);
        vinoSabroso.mostrarVino();

    }



    /**
     * Método elegirUva en donde creamos el objeto de la uva elegida por el usuario
     * @param opcion es la opción que eligió previamente el usuario
     * @return retorna finalmente el objeto de la clase correspodiente a esa uva
     */
    public static Uva elegirUva(int opcion){
        Uva nuevaUva = null;
        TiposUva valor = TiposUva.values()[opcion-1];
        Class<?> claseUva = valor.getClase(); // obtener la clase asociada.
        try {
            nuevaUva = (Uva) claseUva.getDeclaredConstructor().newInstance(); //Crea el objeto
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nuevaUva;
        /*
        switch (opcion){
            case 1:
                Uva nuevaUvaC = new CabernetSauvignon();
                return nuevaUvaC;
            case 2:
                Uva nuevaUvaM = new Merlot();
                return nuevaUvaM;
            case 3:
                Uva nuevaUvaT = new Tempranillo();
                return nuevaUvaT;
            case 4:
                Uva nuevaUvaG = new Granacha();
                return nuevaUvaG;
            case 5:
                Uva nuevaUvaP = new PinotNoir();
                return nuevaUvaP;
            case 6:
                Uva nuevaUvaB = new Bonarda();
                return nuevaUvaB;
            case 7:
                Uva nuevaUvaPG = new PinotGris();
                return nuevaUvaPG;
            case 8:
                Uva nuevaUvaCC= new Chardonnay();
                return nuevaUvaCC;
            case 9:
                Uva nuevaUvaS = new SauvignonBlanc();
                return nuevaUvaS;
            case 10:
                Uva nuevaUvaV = new Verdejo();
                return nuevaUvaV;
            case 11:
                Uva nuevaUvaA = new Albariño();
                return nuevaUvaA;
            case 12:
                Uva nuevaUvaGo = new Godello();
                return nuevaUvaGo;
            case 13:
                Uva nuevaUvaMa = new Malbec();
                return nuevaUvaMa;
            case 14:
                Uva nuevaUvaCa = new CabernetFranc();
                return nuevaUvaCa;
            case 15:
                Uva nuevaUvaMo = new MoscatelAlejandria();
                return nuevaUvaMo;
            default:
                Uva nuevaUvaAA = new Albariño();
                return nuevaUvaAA;

        }

         */
    }

}
