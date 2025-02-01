/**
 * Clase que proporciona operaciones matemáticas básicas de producto
 * @author Marta Cruz
 * @version 1.0
 */

public class Producto_MCJ {
    //Atributos
    private double multiplo1, multiplo2, multiplo5, base;
    private int multiplo3, multiplo4, expo;

    //Métodos propios

    /**
     * Producto de dos números reales y devuelve el resultado.
     * @param multiplo1 primer número real a multiplicar.
     * @param multiplo2 segundo número real a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public double producto2reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    /**
     * Producto de dos números enteros y devuelve el resultado.
     * @param multiplo3 primer número entero a multiplicar.
     * @param multiplo4 segundo número entero a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public int producto2reales (double multiplo3, double multiplo4){
        return multiplo3 * multiplo4;
    }

    /**
     * Producto de tres números reales y devuelve el resultado.
     * @param multiplo1 primer número real a multiplicar.
     * @param multiplo2 segundo número real a multiplicar.
     * @param multiplo5 tercer número real a multiplicar.
     * @return el producto de multiplo1, multiplo2 y multiplo5.
     */

    public double producto2reales (double multiplo1, double multiplo2, double multiplo5){
        return multiplo1 * multiplo2 * multiplo5;
    }

    /**
     * Potencia con dos parametros de entrada (base y exponente) y devuelve el resultado.
     * @param base numero real como base de la potencia
     * @param expo numero entero como exponente de la potencia
     * @return la potencia con pase A y exponente B
     */

    public double potencia (double base, int expo){
        return Math.pow(base,expo);
    }
}
