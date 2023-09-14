package Menu;

import Entidades.Uvas.*;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Caracteristicas para indicar las caracteristicas del tipo de uva que elija el usuario
 * @version 1.0, 7/9/2023
 * @author Paula Martinez
 */
public class Caracteristicas {
    /**
     * Método sin retorno que muestra las características de determinado tipo de uva
     */
    public static void mostrarCaracteristicas(){
        Scanner scan = new Scanner(System.in);
        int tipo=0;boolean flagTipoUva = false;
        do{
            TiposUva uvas[] = TiposUva.values();
            for (int i=0;i<=14;i++){ //Bucle que muestra todas las uvas en forma de lista ordenada
                System.out.println((i+1)+": "+uvas[i]);
            }
            try {
                tipo = scan.nextInt();
                if (tipo >= 1 && tipo <= 15) {
                    flagTipoUva = true;
                } else {
                    flagTipoUva = false;
                    System.out.println("Debe ingresar un número entre 1 y 15.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scan.nextLine(); // "Limpiar" el búfer de entrada
            }
        }while(!flagTipoUva);
        int cont = 1;
        for (TiposUva uva : TiposUva.values()) {
            if (cont == tipo) {
                Class<?> claseUva = uva.getClase(); // obtener la clase asociada.
                try {
                    //Utilizamos reflexion, que permite crear objetos de cualquier clase en tiempo de ejecución,
                    //y al declarar la variable como Object, se puede referir a objetos de diferentes clases
                    //sin conocer el tipo exacto de antemano.
                    //getDeclaredConstructor() obtiene el constructor de la clase especificada
                    //newInstance(): se crea una nueva instancia de la clase
                    Object nuevaUva = claseUva.getDeclaredConstructor().newInstance(); //Crea el objeto
                    Method metodo = claseUva.getMethod("imprimirInformacion"); //Accede al método de la clase
                    metodo.invoke(nuevaUva); //Invoca el método
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            cont++;
        }
    }
}
