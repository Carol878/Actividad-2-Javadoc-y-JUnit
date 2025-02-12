package javabean;
import java.util.Scanner;
/**
 * La clase {@code Potencia} proporciona un metodo para calcular la potencia de un número.
 * Se usa un bucle para calcular la potencia de manera iterativa, soportando exponentes negativos.
 *
 * @author Juan Moreno
 */
public class Potencia {
    /**
     * Calcula la potencia de un número dado.
     *
     * @param base      La base de la potencia (entero).
     * @param exponente El exponente de la potencia (entero, puede ser negativo).
     * @return El resultado de elevar la base al exponente.
     */
    public double calcularPotencia(int base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }
        return (exponente < 0) ? 1 / resultado : resultado;
    }
    /**
     * Metodo principal que permite al usuario ingresar una base y un exponente
     * para calcular su potencia utilizando el metodo {@code calcularPotencia}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Potencia potencia = new Potencia();

        System.out.print("Escribe la base): ");
        int base = scanner.nextInt();

        System.out.print("Escribe el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = potencia.calcularPotencia(base, exponente);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
