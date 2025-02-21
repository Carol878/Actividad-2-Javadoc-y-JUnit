package testing;

import javabean.Division;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

/**
 * Clase con métodos de pruebas unitarias para verificar el funcionamiento de los métodos
 * de división implementados en la case {@link Division}
 * @author Marta Cruz Jimenez
 * @version 1.0
 */
class DivisionTest {
    /**
     * Prueba unitaria para verificar la división de dos números reales.
     * Se espera que la división de 6.5 entre 2.0 tenga como resultado 3.25.
     */
    @Test
    void dividirReales() {
        Assertions.assertEquals(3.25, Division.dividirReales(6.5,2.0));
    }
    /**
     * Prueba unitaria para verificar la división de dos números reales negativo.
     * Se espera que la división de -6.5 entre 2.0 tenga como resultado -3.25.
     */
    @Test
    void dividirRealesNegativos() {
        Assertions.assertEquals(-3.25, Division.dividirReales(-6.5,2.0));
    }
    /**
     * Prueba unitaria para verificar la división de un número real entre cero.
     * Se espera que la división de 10.5 entre 0 tenga como resultado "No se puede dividir por cero".
     */
    @Test
    void dividirRealesCeroDenominador() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Division.dividirReales(10.5, 0);
        });
        Assertions.assertEquals("No se puede dividir por cero.", exception.getMessage());
    }
    /**
     * Prueba unitaria para verificar la división de dos números enteros.
     * Se espera que la división de 10 entre 5 tenga como resultado 2.
     */
    @Test
    void dividirEnteros() {
        Assertions.assertEquals(5, Division.dividirEnteros(10,2));
    }
    /**
     * Prueba unitaria para verificar la división de dos números enteros negativos.
     * Se espera que la división de -10 entre 2 tenga como resultado -5.
     */
    @Test
    void dividirEnterosNegativos() {
        Assertions.assertEquals(-5, Division.dividirEnteros(-10,2));
    }
    /**
     * Prueba unitaria para verificar la división de un número entero entre cero.
     * Se espera que la división de 852 entre 0 tenga como resultado "No se puede dividir por cero".
     */
    @Test
    void dividirEnterosCero() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Division.dividirEnteros(852, 0);
        });
        Assertions.assertEquals("No se puede dividir por cero.", exception.getMessage());
    }
    /**
     * Prueba unitaria para verificar el inverso de un numero real.
     * Se espera que el inverso de 2.0 tenga como resultado 0.5.
     */
    @Test
    void inverso() {
       Assertions.assertEquals(0.5, Division.inverso(2.0));
    }
    /**
     * Prueba unitaria para verificar el inverso de 1.
     * Se espera que el inverso de 1 tenga como resultado 1.
     */
    @Test
    void inversoUno(){
        Assertions.assertEquals(1.0,Division.inverso(1.0));
    }
    /**
     * Prueba unitaria para verificar el inverso de 0.
     * Se espera que el inverso de 0 tenga como resultado "No se puede calcular el inverso de cero".
     */
    @Test
    void inversoCero() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Division.inverso(0);
        });
        Assertions.assertEquals("No se puede calcular el inverso de cero.", exception.getMessage());
    }
}