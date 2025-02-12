package javabean;
import java.util.Scanner;

public class Potencia {
    /** La clase Potencia crea un metodo para calcular la potencia de un número.
     * @author Juan Moreno */
    public double calcularPotencia(int base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }
        return (exponente < 0) ? 1 / resultado : resultado;
    }
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
