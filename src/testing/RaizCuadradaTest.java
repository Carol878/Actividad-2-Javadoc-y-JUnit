package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class RaizCuadradaTest {

        @Test
        void testRaizCuadradaPositiva() {
            double resultado = RaizCuadrada.calcularRaizCuadrada(16);
            assertEquals(4.0, resultado, 0.0001, "La raíz cuadrada de 16 debería ser 4.0");
        }

        @Test
        void testRaizCuadradaNegativa() {
            double resultado = RaizCuadrada.calcularRaizCuadrada(-9);
            assertTrue(Double.isNaN(resultado), "La raíz cuadrada de un número negativo debería ser NaN");
        }

        @Test
        void testRaizCuadradaCero() {
            assertThrows(ArithmeticException.class, () -> RaizCuadrada.calcularRaizCuadrada(0),
                    "Debería lanzar ArithmeticException cuando el número es 0");
        }

        @Test
        void testRaizCuadradaDecimal() {
            double resultado = RaizCuadrada.calcularRaizCuadrada(2.25);
            assertEquals(1.5, resultado, 0.0001, "La raíz cuadrada de 2.25 debería ser 1.5");
        }
    }
}
