package testing;

import javabean.Resta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



/**
 * Esta clase contiene métodos de prueba para verificar el correcto funcionamiento
 * de los métodos de suma implementados en la clase {@link javabean.Resta}.
 * @author Cristina Sanz Alonso
 */

public class RestaTest {

    /**
     * Prueba unitaria para verificar la resta de dos números reales.
     * Se espera que la resta de 4.2 y 2.2 tenga como resultado 2.0.
     */

    @Test
    public void restaReales(){
        double resultadoEsperado = 2.0;
        double resultadoActual = Resta.restaReales(4.2,2.2);
        Assertions.assertEquals(resultadoEsperado,resultadoActual, "El resultado debe ser 2.0");
    }

    /**
     * Prueba unitaria para verificar la resta de dos números enteros.
     * Se espera que la resta de 4 y 2 tenga como resultado 2.
     */

    @Test
    public void restaEnteros(){
        int resultadoEsperado = 2;
        int resultadoActual = Resta.restaEnteros(4,2);
        Assertions.assertEquals(resultadoEsperado,resultadoActual, "El resultado debe ser 2");
    }

    /**
     * Prueba unitaria para verificar la resta de dos números reales.
     * Se espera que la resta de 4.2, 2.2 y 1.1 tenga como resultado 0.9.
     * He aplicado el parámetro @param delta  para dejar un margen de error de 0.0001
     */

    @Test
    public void restaReales2(){
        double resultadoEsperado = 0.9;
        double resultadoActual = Resta.restaReales(4.2,2.2,1.1);
        Assertions.assertEquals(resultadoEsperado,resultadoActual,0.0001, "El resultado debe ser 0.9");
    }

    /**
     * Prueba unitaria para verificar la resta acumulada de una lista de números reales.
     * Se espera que la resta acumulada de los números 100,49.50,25.50,25 sea igual a 0.
     */
    @Test
    public void restaRealesAcumulada() {
        double resultadoEsperado = 0;
        double resultadoActual = 0;
        resultadoActual = Resta.restaAcumulado(100);
        System.out.println(resultadoActual);
        resultadoActual = Resta.restaAcumulado(49.50);
        System.out.println(resultadoActual);
        resultadoActual = Resta.restaAcumulado(25.50);
        System.out.println(resultadoActual);
        resultadoActual = Resta.restaAcumulado(25);
        System.out.println(resultadoActual);
        Assertions.assertEquals(resultadoEsperado, resultadoActual);

    }



}
