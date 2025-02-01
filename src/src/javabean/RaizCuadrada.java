package javabean;

/**
 * La clase {@code RaizCuadrada} proporciona un metodo estático para calcular raíces cuadradas de un número que recibe como parametro.
 *
 * @author Pablo Granados
 * @version 0.1
 */

public class RaizCuadrada {

    /**
     * Este metodo usa la función {@link Math#sqrt(double)} para realizar el cálculo y devuelve una {@link ArithmeticException} con el contenido "NaN" en caso de que el número
     * recibido sea 0.
     *
     * @param numero Número del que se desea calcular la raíz cuadrada.
     * @return La raíz cuadrada del número recibido.
     * @throws ArithmeticException en caso de recibir 0.
     */

    public static double calcularRaizCuadrada(double numero) {

        if (numero == 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(numero);
    }

}
