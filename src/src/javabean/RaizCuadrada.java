package javabean;

public class RaizCuadrada {

    public static double calcularRaizCuadrada(double numero) {

        if (numero == 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(numero);
    }

}
