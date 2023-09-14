import Entidades.Uvas.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

import Entidades.Vino;
import Menu.Menu;
import Entidades.Bodega;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¡Bienvenido a Vino Sabroso!" +
                "\t  \n");
        // ---------- Menú ----------
        Menu menu = new Menu();
        //ArrayList<Uva> listaUva = new ArrayList<Uva>();
        ArrayList<Vino> listaVino = new ArrayList<Vino>();
        Bodega vinoSabroso = new Bodega(listaVino);
        menu.mostrarMenu(vinoSabroso);
    }
}