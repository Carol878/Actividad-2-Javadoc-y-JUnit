package javabean;
import java.util.Scanner;

/**
 * Clase que proporciona operaciones matemáticas básicas de producto
 * @author Marta Cruz
 * @version 1.0
 */

public class Producto_MCJ {
  //Funciones

    /**
     * Producto de dos números reales y devuelve el resultado.
     * @param multiplo1 primer número real a multiplicar.
     * @param multiplo2 segundo número real a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public static double producto2reales (double multiplo1, double multiplo2){
        return multiplo1 * multiplo2;
    }

    /**
     * Producto de dos números enteros y devuelve el resultado.
     * @param multiplo3 primer número entero a multiplicar.
     * @param multiplo4 segundo número entero a multiplicar.
     * @return el producto de multiplo1 y multiplo2.
     */

    public static int producto2enteros ( int multiplo3, int multiplo4){
        return multiplo3 * multiplo4;
    }

    /**
     * Producto de tres números reales y devuelve el resultado.
     * @param multiplo5 primer número real a multiplicar.
     * @param multiplo6 segundo número real a multiplicar.
     * @param multiplo7 tercer número real a multiplicar.
     * @return el producto de multiplo5, multiplo6 y multiplo7.
     */

    public static double producto3reales (double multiplo5, double multiplo6, double multiplo7){
        return multiplo5 * multiplo6 * multiplo7;
    }

    /**
     * Potencia con dos parametros de entrada (base y exponente) y devuelve el resultado.
     * @param base numero entero como base de la potencia
     * @param expo numero entero como exponente de la potencia
     * @return la potencia con base y exponente
     */

    public static double potencia (int base,int expo){
        return Math.pow(base,expo);
    }

    /**
     * Menú para la clase producto que recibe el número que se introduce.
     * @param leer Número que entra mediante Scanner para elegir la opcion del switch
     * @param producto Clase que llama a los métodos de esta clase.
     */

    public static void menuTipoProducto(Scanner leer, Producto_MCJ producto){
        System.out.println("Elige el tipo de producto que quieres hacer de las siguientes opciones:");
        System.out.println("Introduce 1 para multiplicar dos números reales");
        System.out.println("Introduce 2 para multiplicar dos números enteros");
        System.out.println("Introduce 3 para multiplicar tres números reales");
        System.out.println("Introduce 4 para obtener la potencia de dos numeros, base y exponente");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce el primer multiplo real");
                double multiplo1 = leer.nextDouble();
                System.out.println("Introduce el segundo multiplo real");
                double multiplo2 = leer.nextDouble();
                double resultado = producto.producto2reales(multiplo1,multiplo2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                System.out.println("Introduce el primer multiplo entero");
                int multiplo3 = leer.nextInt();
                System.out.println("Introduce el segundo multiplo entero");
                int multiplo4 = leer.nextInt();
                int resultado1 = producto.producto2enteros(multiplo3,multiplo4);
                System.out.println("El resultado es: " + resultado1);
                break;
            case 3:
                System.out.println("Introduce el primer multiplo real");
                double multiplo5 = leer.nextDouble();
                System.out.println("Introduce el segundo multiplo real");
                double multiplo6= leer.nextDouble();
                System.out.println("Introduce el tercer multiplo real");
                double multiplo7= leer.nextDouble();
                double resultado3 = producto.producto3reales(multiplo5,multiplo6,multiplo7);
                System.out.println("El resultado es: " + resultado3);
                break;
            case 4:
                System.out.println("Introduce la base");
                int base = leer.nextInt();
                System.out.println("Introduce el exponente");
                int expo = leer.nextInt();
                if (expo >= 0) {
                    System.out.println("El resultado es: " + producto.potencia(base,expo));
                }else
                    System.out.println("No es posible realizar la operacion");
                break;
            default:
                System.out.println("Opcion incorrecta");
         }
    }
}
