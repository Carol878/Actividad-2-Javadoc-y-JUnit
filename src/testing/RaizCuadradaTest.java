package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para el método de cálculo de raíz cuadrada.
 */
class RaizCuadradaTest {

    /**
     * Prueba unitaria para verificar la raíz cuadrada de un número positivo.
     * Se espera que la raíz cuadrada de 16 sea 4.0.
     */
    @Test
    void testRaizCuadradaPositiva() {
        double resultado = RaizCuadrada.calcularRaizCuadrada(16);
        // Compara el resultado esperado con el obtenido, usando una tolerancia de 0.0001
        assertEquals(4.0, resultado, 0.0001, "La raíz cuadrada de 16 debe ser 4.0");
    }

    /**
     * Prueba unitaria para verificar la raíz cuadrada de un número negativo.
     * En Java, la raíz cuadrada de un número negativo devuelve NaN (Not a Number).
     */
    @Test
    void testRaizCuadradaNegativa() {
        double resultado = RaizCuadrada.calcularRaizCuadrada(-9);
        // Verifica que el resultado sea NaN
        assertTrue(Double.isNaN(resultado), "La raíz cuadrada de un número negativo debe ser NaN");
    }

    /**
     * Prueba unitaria para verificar la raíz cuadrada de 0.
     * Se espera que la raíz cuadrada de 0 sea 0.0.
     */
    @Test
    void testRaizCuadradaCero() {
        double resultado = RaizCuadrada.calcularRaizCuadrada(0);
        // En Java, Math.sqrt(0) devuelve 0.0
        assertEquals(0.0, resultado, 0.0001, "La raíz cuadrada de 0 debe ser 0.0");
    }

    /**
     * Prueba unitaria para verificar la raíz cuadrada de un número decimal.
     * Se espera que la raíz cuadrada de 2.25 sea 1.5.
     */
    @Test
    void testRaizCuadradaDecimal() {
        double resultado = RaizCuadrada.calcularRaizCuadrada(2.25);
        // Compara el resultado con 1.5 usando una tolerancia de 0.0001
        assertEquals(1.5, resultado, 0.0001, "La raíz cuadrada de 2.25 debe ser 1.5");
    }
}
