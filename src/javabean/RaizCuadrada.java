package javabean;

import java.util.Scanner;

/**
 * La clase {@code RaizCuadrada} proporciona un metodo estático para calcular raíces cuadradas de un número que recibe como parametro.
 *
 * @author Pablo Granados
 * @version 0.1
 */

public class RaizCuadrada {

    /**
     * Este metodo usa la función {@link Math#sqrt(double)} para realizar el cálculo y devuelve una {@link ArithmeticException} con el contenido "NaN" en caso de que el número
     * recibido sea 0.
     *
     * @param numero Número del que se desea calcular la raíz cuadrada.
     * @return La raíz cuadrada del número recibido.
     * @throws ArithmeticException en caso de recibir 0.
     */

    private static double calcularRaizCuadrada(double numero) {

        if (numero == 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(numero);
    }

    /**
     * Muestra un menu interactivo donde el usuario introduce un número real y haciendo uso de @see calcularRaizCuadrada(double), calcula su raíz cuadrada y la muestra por pantalla.
     *
     * Este metodo no recibe ningún parametro ni devuelve ningun valor, se limita a interactuar con el usuario a traves de la consola.
     *
     * @implNote Este metodo implementa un objetio de tipo {@link Scanner} para leer el numeor introducido por el usuario
     */

    public static void menuTipoRaizCuadrada(){

        Scanner scLeerTeclado = new Scanner(System.in);
        double numero;

        System.out.println("Escribe el número del que deseas calcular la raíz cuadrada: ");
        numero=scLeerTeclado.nextDouble();

        System.out.println("La raíz cuadrada de : " + numero +", es igual a : " + calcularRaizCuadrada(numero));

        scLeerTeclado.close();

    }

}
