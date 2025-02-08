package testing;

import javabean.Suma;

import java.util.Scanner;


public class MainSuma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Suma suma = new Suma();
        suma.menuTipoSuma(leer, suma);

    }
}
