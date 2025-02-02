package testing;

import javabean.Producto_MCJ;

import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Producto_MCJ producto = new Producto_MCJ();
        int opcion = 0;
        System.out.println("Introduce 1 para multiplicar dos números reales");
        System.out.println("Introduce 2 para multiplicar dos números enteros");
        System.out.println("Introduce 3 para multiplicar tres números reales");
        System.out.println("Introduce 4 para obtener la potencia de dos numeros, base y exponente");
        opcion = leer.nextInt();
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
                    resultado = producto.potencia(base,expo);
                    System.out.println("El resultado es: " + resultado);
                }else
                    System.out.println("No es posible realizar la operacion");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }

}