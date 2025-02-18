package javabean;
import java.util.Scanner;

/**
 * Clase que proporciona operaciones matemáticas básicas de producto
 * @author Marta Cruz
 * @version 1.0
 */

public class Producto_MCJ {
  //Funciones

    /**
     * Producto de dos números reales y devuelve el resultado.
     * @param multiplo1 primer número real a multiplicar.
     * @param multiplo2 segundo número real a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public static double producto2reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    /**
     * Producto de dos números enteros y devuelve el resultado.
     * @param multiplo3 primer número entero a multiplicar.
     * @param multiplo4 segundo número entero a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public static int producto2enteros ( int multiplo3, int multiplo4){
        return multiplo3 * multiplo4;
    }

    /**
     * Producto de tres números reales y devuelve el resultado.
     * @param multiplo5 primer número real a multiplicar.
     * @param multiplo6 segundo número real a multiplicar.
     * @param multiplo7 tercer número real a multiplicar.
     * @return el producto de multiplo5, multiplo6 y multiplo7.
     */

    public static double producto3reales (double multiplo5, double multiplo6, double multiplo7){
        return multiplo5 * multiplo6 * multiplo7;
    }

    /**
     * Potencia con dos parametros de entrada (base y exponente) y devuelve el resultado.
     * @param base numero real como base de la potencia
     * @param expo numero real como exponente de la potencia
     * @return la potencia con base y exponente
     */

    public static double potencia (double base,double expo){
        return Math.pow(base,expo);
    }

}
