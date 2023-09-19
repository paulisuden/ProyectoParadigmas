package Menu;
import java.util.Scanner;
import java.util.InputMismatchException;
import Entidades.Bodega;


/**
 * Clase Menu para mostrarle al usuario
 * @version 1.1, 7/9/2023
 * @author Paula Martinez, Paulina Suden, Lautaro Larosa
 * @see CambiarEtapa
 * @see Caracteristicas
 * @see ConsultarTerminados
 * @see IngresarUva
 * @see ConsultarEtapaActual
 */

public class Menu {
    public Menu(){
    }

    /**
     * Muestra el menu principal al usuario
     */
    public void mostrarMenu(){
        ConsultarTerminados consultarTerminado = new ConsultarTerminados();
        ConsultarEtapaActual consultarE = new ConsultarEtapaActual();
        CambiarEtapa cambiarE = new CambiarEtapa();
        IngresarUva ingresarUva = new IngresarUva();
        boolean ingresoUva = false;
        Scanner scan = new Scanner(System.in);
        int contadorVino= 1;
        boolean exit = false; boolean flagMenu = false;int eleccion = 0;
        while (!exit) {
            flagMenu=false;
            do{
                System.out.println(" ");
                System.out.println("1 - Ingresar un tipo de uva");
                System.out.println("2 - Consultar estado de los vinos");
                System.out.println("3 - Cambiar de etapa");
                System.out.println("4 - Ver características de un vino");
                System.out.println("5 - Consultar uvas terminadas");
                System.out.println("6 - Salir");
                try {
                    eleccion = scan.nextInt();
                    if (eleccion >= 1 && eleccion <= 6) {
                        flagMenu = true;
                    } else {
                        System.out.println("Debe ingresar un número entre 1 y 6.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scan.nextLine(); // "Limpiar" el búfer de entrada
                }
            }while(!flagMenu);

            switch (eleccion) {
                case 1:
                    ingresarUva.ingresarUva(contadorVino);
                    ingresoUva = true; contadorVino++;
                    try {
                        Thread.sleep(2000); // Pausa durante 2 segundos
                    } catch (InterruptedException e) {
                        // Manejar cualquier excepción
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    if (!ingresoUva){
                        System.out.println("Por favor, primero ingrese una uva");
                    } else {
                        consultarE.consultarEtapa(Bodega.listaVinos);
                        try {
                            Thread.sleep(2000); // Pausa durante 2 segundos
                        } catch (InterruptedException e) {
                            // Manejar cualquier excepción
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    if (!ingresoUva){
                        System.out.println("Por favor, primero ingrese una uva");
                    } else {
                        cambiarE.cambiarDeEtapa(Bodega.listaVinos);
                        try {
                            Thread.sleep(2000); // Pausa durante 2 segundos
                        } catch (InterruptedException e) {
                            // Manejar cualquier excepción
                            e.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    Caracteristicas.mostrarCaracteristicas();
                    try {
                        Thread.sleep(5000); // Pausa durante 5 segundos para que se vea mas "ordenado" y el usuario pueda leer
                    } catch (InterruptedException e) {
                        // Manejar cualquier excepción
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    consultarTerminado.consultarEtapa(Bodega.listaVinos);
                    try {
                        Thread.sleep(2000); // Pausa durante 2 segundos
                    } catch (InterruptedException e) {
                        // Manejar cualquier excepción
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar Vino Sabroso. ¡¡Vuelva Pronto!!");
                    exit = true;
                    try {
                        Thread.sleep(2000); // Pausa durante 2 segundos
                    } catch (InterruptedException e) {
                        // Manejar cualquier excepción
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción válida, por favor");
            }

        }
    }

}
