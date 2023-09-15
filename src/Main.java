import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Vino;
import Menu.Menu;
import Entidades.Bodega;


/**
 * Clase Main principal
 * @version 1.0
 * @author Paula Martinez, Paulina Suden, Lautaro Larosa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("¡Bienvenido a Vino Sabroso!" +
                "\t  \n");
        System.out.println("Presione cualquier tecla para ingresar");
        scan.nextLine();
        // ---------- Menú ----------
        Menu menu = new Menu();
        ArrayList<Vino> listaVino = new ArrayList<Vino>();
        Bodega vinoSabroso = new Bodega(listaVino);
        menu.mostrarMenu(vinoSabroso);
    }
}