package javabean;

import java.util.Scanner;

/**
 * Clase que realiza sumas dentro de una aplicación de calculadora.
 * @author Cristina Sanz Alonso
 * @version Version 1.0
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 *  Suma suma = new Suma ();
 *  resultado = suma.sumar(3,4);
 * }</pre>
 */

public class Suma {

    /**
     * Se ininicaliza la variable acumulado a 0 para el cuarto método sumarAcumulado().
     */

    private int acumulado = 0;

    /**
     * El primer método tiene de entrada dos valores enteros:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @return La suma de ambos numeros.
     */

    public int sumar(int sumando1,int sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El segundo método tiene de entrada dos valores reales:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @return La suma de ambos numeros.
     */

    public double sumar(double sumando1, double sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El tercer método tiene de entrada tres valores reales:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @param sumando3 Tercer número a sumar.
     * @return La suma de los 3 numeros.
     */

    public double sumar(double sumando1,double sumando2,double sumando3) {

        return sumando1 + sumando2 + sumando3;
    }

    /**
     * El cuarto método tiene de entrada solo 1 valor entero. El valor del acumulado comienza en cero
     * y se le irán añadiendo valores cada vez que entre un parámetro en la calculadora.
     * @param sumando1 Números que van sumandose al valor acumulado.
     * @return La suma de los diferentes numeros.
     */

    public int sumar(int sumando1) {
        acumulado += sumando1;
        return acumulado;
    }

}
