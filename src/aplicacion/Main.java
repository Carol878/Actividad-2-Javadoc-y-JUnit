package aplicacion;

import javabean.RaizCuadrada;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * En esta aplicación la clase main es un menú principal que permite ver y seleccionar todas las diferentes operaciones que ofrece la
 * calculadora y según la selección redirige a un menú diferente para cada tipo de operación.
 *
 * @implNote Este menu implementa un objeto de tipo {@link Scanner} para leer el numero introducido por el usuario
 *
 * @author Cristina Sanz Alonso
 * @author Nahir Carolina Torres
 * @author Marta Cruz Jiménez
 * @author Antonio Jose García Molina
 * @author Juan Moreno Garoz
 * @author Pablo Granados Rúa
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        Scanner scLeerTeclado = new Scanner(System.in);
        int eleccion = 0;

        do {

            eleccion = pintarMenu(scLeerTeclado);

            switch (eleccion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    menuTipoRaizCuadrada(scLeerTeclado);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida\n");
                    break;
            }
        }
        while (eleccion!=7);

        scLeerTeclado.close();
        System.out.println("FIN DEL PROGRAMA");
    }

    /**
     *
     * Este metodo pinta el menú y recoge la opción que el usuario elige.
     *
     * @param scLeerTeclado
     * @return eleccion
     */
    private static int pintarMenu(Scanner scLeerTeclado) {
        int eleccion;


        System.out.println("CALCULADORA BÁSICA\n");
        System.out.println("1: SUMAR");
        System.out.println("2: RESTAR");
        System.out.println("3: MULTIPLICACIÓN");
        System.out.println("4: DIVISIÓN");
        System.out.println("5: POTENCIA");
        System.out.println("6: RAÍZ CUADRADA");
        System.out.println("7: SALIR DEL PROGRAMA");

        System.out.println("Introduzca el número correspondiente a la función que desea usar (1-7): ");
        eleccion = scLeerTeclado.nextInt();

        return eleccion;
    }

    /**
     * Muestra un menu interactivo donde el usuario introduce un número real y haciendo uso de @see calcularRaizCuadrada(double), calcula su raíz cuadrada y la muestra por pantalla.
     *
     * Este metodo no recibe ningún parametro ni devuelve ningun valor, se limita a interactuar con el usuario a traves de la consola.
     *
     */

    private static void menuTipoRaizCuadrada(Scanner scLeerTeclado) {

            double numero;

            System.out.println("Escribe el número del que deseas calcular la raíz cuadrada: ");
            numero=scLeerTeclado.nextDouble();

            System.out.println("La raíz cuadrada de : " + numero + ", es igual a : " + RaizCuadrada.calcularRaizCuadrada(numero) + "\n");


        }

    }


