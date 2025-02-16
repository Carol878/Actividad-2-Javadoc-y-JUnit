package testing;

import javabean.Division;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class DivisionTest {

    @Test
    void dividirReales() {
        assertEquals(3.25, Division.dividirReales(6.5,2.0), 0.0001);
    }
    @Test
    void dividirRealesNegativos() {
        assertEquals(-3.25, Division.dividirReales(-6.5,2.0), 0.0001);
    }
    @Test
    void dividirRealesCeroNumerador() {
        assertEquals(0.0, Division.dividirReales(0.0,2.0), 0.0001);
    }
    @Test
    void dividirRealesCeroDenominador() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Division.dividirReales(10, 0);
        });
        assertEquals("No se puede dividir por cero.", exception.getMessage());
    }
    @Test
    void dividirEnteros() {
        assertEquals(5, Division.dividirEnteros(10,2), 0.0001);
    }
    @Test
    void dividirEnterosNegativos() {
        assertEquals(-5, Division.dividirEnteros(-10,2), 0.0001);
    }
    @Test
    void dividirEnterosCero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Division.dividirEnteros(852, 0);
        });
        assertEquals("No se puede dividir por cero.", exception.getMessage());
    }
    @Test
    void inverso() {
        assertEquals(0.5, Division.inverso(2.0), 0.0001);
    }
    @Test
    void inversoUno(){
        assertEquals(1.0,Division.inverso(1.0), 0.0001);
    }
    @Test
    void inversoUnoCero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Division.inverso(0);
        });
        assertEquals("No se puede calcular el inverso de cero.", exception.getMessage());
    }
}