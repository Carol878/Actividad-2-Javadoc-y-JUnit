package testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import javabean.Suma;

import java.util.ArrayList;

/**
 * Clase de pruebas unitarias para la clase {@link }.
 * Esta clase contiene métodos de prueba para verificar el correcto funcionamiento
 * de los métodos de suma implementados en la clase {@link }.
 */
public class SumaTest {

    /**
     * Prueba unitaria para verificar la suma de dos números enteros.
     * Se espera que la suma de 4 y 5 sea igual a 9.
     */
    @Test
    public void testSumaEnteros() {
        int actual = Suma.sumar(4, 5);
        int esperado = 9;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la suma de dos números reales.
     * Se espera que la suma de 6.77 y 5.92 sea igual a 12.69.
     */
    @Test
    public void testSumaReales() {
        double actual = Suma.sumar(6.77, 5.92);
        double esperado = 12.69;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la suma de tres números reales.
     * Se espera que la suma de 6.77, -5.92 y 5.5 sea igual a 6.35.
     */
    @Test
    public void testSumaTresReales() {
        double actual = Suma.sumar(6.77, -5.92, 5.5);
        double esperado = 6.35;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la suma acumulada de una lista de números enteros.
     * Se espera que la suma acumulada de los números 1, 26, 60 y 13 sea igual a 100.
     */
    @Test
    public void testSumaAcumulados() {
        double actual = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(26);
        lista.add(60);
        lista.add(13);

        for (Integer integer : lista) {
           actual = Suma.sumar(integer);
        }

        double esperado = 100;
        Assertions.assertEquals(esperado, actual);
    }
}