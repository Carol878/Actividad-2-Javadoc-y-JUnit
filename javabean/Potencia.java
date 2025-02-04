package javabean;

public class Potencia {
    /** La clase Potencia crea un metodo para calcular la potencia de un número.
     * @author Juan Moreno */
    public double calcularPotencia() {
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }
        return (exponente < 0) ? 1 / resultado : resultado;
    }

}
