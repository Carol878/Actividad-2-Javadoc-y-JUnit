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
     * El primer método tiene de entrada dos valores:
     * @param sumando1
     * @param sumando2
     * @return la suma de ambos numeros enteros.
     */

    public int sumar(int sumando1,int sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El segundo método tiene de entrada dos valores:
     * @param sumando1
     * @param sumando2
     * @return la suma de ambos numeros reales.
     */

    public double sumar(double sumando1, double sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El tercer método tiene de entrada tres valores:
     * @param sumando1
     * @param sumando2
     * @param sumando3
     * @return la suma de los numeros reales.
     */

    public double sumar(double sumando1,double sumando2,double sumando3) {

        return sumando1 + sumando2 + sumando3;
    }

    /**
     * El cuarto método tiene de entrada solo 1 valor. EL valor de acumulado comienza en cero
     * y se le irán añadiendo valores cada vez que entre un parámetro en la calculadora.
     * @param sumando1
     * @return la suma de ambos numeros entero.
     */

    public int sumar(int sumando1) {
        acumulado += sumando1;
        return acumulado;
    }

}
