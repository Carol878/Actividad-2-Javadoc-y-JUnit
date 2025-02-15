package javabean;

import java.util.Scanner;

/**
 * La clase {@code Division} implementa métodos relacionados con la división
 * y operaciones básicas como el cálculo del inverso.
 * @author Antonio José García Molina
 * @version Version 1.0
 */

public class Division {
    /**
     *  Realiza la división de dos números reales.
     * @param numeradorReal el número real que se va a dividir.
     * @param denominadorReal el número real por el cual se va a dividir.
     * @return el resultado de la división.
     * @throws ArithmeticException si el denominador es cero.
     */
    public static double dividirReales (double numeradorReal, double denominadorReal) {
        if (denominadorReal == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numeradorReal / denominadorReal;
    }

    /**
     *  Realiza la división de dos números enteros.
     * @param numeradorEntero el número entero que se va a dividir.
     * @param denominadorEntero el número entero por el cual se va a dividir.
     * @return el resultado de la división.
     * @throws ArithmeticException si el denominador es cero.
     */
    public static double dividirEnteros (double numeradorEntero, double denominadorEntero) {
        if (denominadorEntero == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numeradorEntero / denominadorEntero;
    }

    /**
     * Calcula el inverso de un número real.
     * @param numero el número real del cual se desea calcular el inverso.
     * @return el inverso del número.
     * @throws ArithmeticException si el número es cero.
     */
    public static double inverso (double numero) {
        if (numero == 0) {
            throw new ArithmeticException("No se puede calcular el inverso de cero.");
        }
        return 1 / numero;
    }
}

