package javabean;
import java.util.Scanner;

/**
 * Clase que realiza sumas dentro de una aplicación de calculadora.
 * @author Cristina Sanz Alonso
 * @version Version 1.0
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 *  Suma suma = new Suma ();
 *  resultado = suma.sumar(3,4);
 * }</pre>
 */

public class Suma {

    /**
     * Se ininicaliza la variable acumulado a 0 para el cuarto método sumarAcumulado().
     */

    private int acumulado = 0;

    /**
     * El primer método tiene de entrada dos valores enteros:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @return La suma de ambos numeros.
     */

    public int sumar(int sumando1,int sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El segundo método tiene de entrada dos valores reales:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @return La suma de ambos numeros.
     */

    public double sumar(double sumando1, double sumando2) {

        return sumando1 + sumando2;
    }

    /**
     * El tercer método tiene de entrada tres valores reales:
     * @param sumando1 Primer número a sumar.
     * @param sumando2 Segundo número a sumar.
     * @param sumando3 Tercer número a sumar.
     * @return La suma de los 3 numeros.
     */

    public double sumar(double sumando1,double sumando2,double sumando3) {

        return sumando1 + sumando2 + sumando3;
    }

    /**
     * El cuarto método tiene de entrada solo 1 valor entero. El valor del acumulado comienza en cero
     * y se le irán añadiendo valores cada vez que entre un parámetro en la calculadora.
     * @param sumando1 Números que van sumandose al valor acumulado.
     * @return La suma de los diferentes numeros.
     */

    public int sumar(int sumando1) {
        acumulado += sumando1;
        return acumulado;
    }

    /**
     * Se crea un método para leer en calculadora el numero entero que se introduce.
     * @param leer Número que entra mediante Scanner
     * @return El número obtenido de la lectura del paramentro de entrada.
     */

    public int introducirEntero(Scanner leer) {
        int numero = 0;
        System.out.println("Introduce un número");
        numero= leer.nextInt();
        return numero;
    }

    /**
     * Se crea un método para leer en calculadora el numero real que se introduce.
     * @param leer Número que entra mediante Scanner
     * @return El número obtenido de la lectura del paramentro de entrada.
     */

    public double introducirReal(Scanner leer){
        double numero2 = 0;
        System.out.println("Introduce un número");
        numero2= leer.nextDouble();
        return numero2;
    }

    /**
     * Menú que recibe el número que se introduce.
     * @param leer Número que entra mediante Scanner para elegir la opcion del switch
     * @param suma Clase que llama a los métodos
     */

    public void menuTipoSuma(Scanner leer, Suma suma){
        System.out.println("¿Qué tipo se suma quieres realizar?");
        System.out.println("¿1 Suma de dos enteros, 2 Suma de dos reales, " +
                            "3 Suma de tres reales y 4 Suma de forma acumulativa");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                int sumando1 = introducirEntero(leer);
                int sumando2 = introducirEntero(leer);
                int resultado = suma.sumar(sumando1, sumando2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                double sumando3 = introducirReal(leer);
                double sumando4 = introducirReal(leer);
                double resultado2 = suma.sumar(sumando3, sumando4);
                System.out.println("El resultado es: " + resultado2);
                break;
            case 3:
                double sumando5 = introducirReal(leer);
                double sumando6 = introducirReal(leer);
                double sumando7 = introducirReal(leer);
                double resultado3 = suma.sumar(sumando5, sumando6,sumando7);
                System.out.println("El resultado es: " + resultado3);
                break;
            case 4:
                System.out.println("Introduce el sumando");
                int sumando8 = leer.nextInt();
                while (sumando8 != -1){
                    resultado = suma.sumar(sumando8);
                    System.out.println("El resultado es: " + resultado);
                    System.out.println("Introduce el sumando");
                    sumando8= leer.nextInt();
                }
                break;
            default: System.out.println("Opcion incorrecta");
        }
    }

}
