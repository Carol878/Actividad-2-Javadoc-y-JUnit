package testing;

import javabean.Potencia;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Esta clase contiene métodos de prueba para verificar el correcto funcionamiento
 * del métodos de potencia implementado en la clase {@link Potencia}.
 */

public class PotenciaTest {

    /**
     * Prueba unitaria para verificar la potencia de dos números enteros positivos.
     * Se espera que la potencia de 3 sobre 2 sea igual a 8.
     */

    @Test
    public void testCalcularPotenciaEnteros (){
        double actual= Potencia.calcularPotencia(2,3);
        double esperado= 8;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con negativa y exponente impar.
     * Se espera que la potencia de 3 sobre -2 sea igual a -8.
     */

    @Test
    public void testCalcularPotenciaNegativaImpar (){
        double actual= Potencia.calcularPotencia(-2,3);
        double esperado= -8;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con base negativa y exponente par.
     * Se espera que la potencia de 2 sobre -3 sea igual a 9.
     */

    @Test
    public void testCalcularPotenciaNegativaPar (){
        double actual= Potencia.calcularPotencia(-3,2);
        double esperado= 9;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con base 1.
     * Se espera que la potencia de 120 sobre 1 sea igual a 1.
     */

    @Test
    public void testCalcularPotenciaBaseUno (){
        double actual= Potencia.calcularPotencia(1,120);
        double esperado= 1;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con base cero.
     * Se espera que la potencia de 120 sobre 0 sea igual a 0.
     */

    @Test
    public void testCalcularPotenciaBaseCero (){
        double actual= Potencia.calcularPotencia(0,120);
        double esperado= 0;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con exponente 0.
     * Se espera que la potencia de 0 sobre 9 sea igual a 1.
     */

    @Test
    public void testCalcularPotenciaExponenteCero (){
        double actual= Potencia.calcularPotencia(9,0);
        double esperado= 1;
        Assertions.assertEquals(esperado, actual);
    }

    /**
     * Prueba unitaria para verificar la potencia con exponente negativo.
     * Se espera que la potencia de 0 sobre 9 sea igual a 1.
     */

    @Test
    public void testCalcularPotenciaExponenteNegativo (){
        double actual= Potencia.calcularPotencia(2,-2);
        double esperado= 0.25;
        Assertions.assertEquals(esperado, actual);
    }

}