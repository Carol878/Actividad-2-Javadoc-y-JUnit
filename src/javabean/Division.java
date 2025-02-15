package javabean;

import java.util.Scanner;

/**
 * La clase {@code Division} implementa métodos relacionados con la división
 * y operaciones básicas como el cálculo del inverso.
 * @author Antonio José García Molina
 * @version Version 1.0
 */

public class Division {
    /**
     *  Realiza la división de dos números reales.
     * @param numeradorReal el número real que se va a dividir.
     * @param denominadorReal el número real por el cual se va a dividir.
     * @return el resultado de la división.
     * @throws ArithmeticException si el denominador es cero.
     */
    public static double dividirReales (double numeradorReal, double denominadorReal) {
        if (denominadorReal == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numeradorReal / denominadorReal;
    }

    /**
     *  Realiza la división de dos números enteros.
     * @param numeradorEntero el número entero que se va a dividir.
     * @param denominadorEntero el número entero por el cual se va a dividir.
     * @return el resultado de la división.
     * @throws ArithmeticException si el denominador es cero.
     */
    public static double dividirEnteros (int numeradorEntero, int denominadorEntero) {
        if (denominadorEntero == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numeradorEntero / denominadorEntero;
    }

    /**
     * Calcula el inverso de un número real.
     * @param numero el número real del cual se desea calcular el inverso.
     * @return el inverso del número.
     * @throws ArithmeticException si el número es cero.
     */
    public static double inverso (double numero) {
        if (numero == 0) {
            throw new ArithmeticException("No se puede calcular el inverso de cero.");
        }
        return 1 / numero;
    }


    /**
     * Muestra un menu interactivo donde el usuario introduce el número que se pide (entero o real) y haciendo uso de los diferentes métodos dividir.
     * @param sc Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */

    public static void menuTipoDivision() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Que división quieres hacer: ");
            System.out.println("1. Dividir Reales");
            System.out.println("2. Dividir Enteros");
            System.out.println("3. Inverso");
            System.out.println("4. Exit");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dame el numerador: ");
                    double numeradorReal = sc.nextInt();
                    System.out.println("Dame el denominador: ");
                    double denominadorReal = sc.nextInt();
                    System.out.println(Division.dividirReales(numeradorReal,denominadorReal));
                    break;
                case 2:
                    System.out.println("Dame el numerador: ");
                    int numeradorEntero = sc.nextInt();
                    System.out.println("Dame el denominador: ");
                    int denominadorEntero = sc.nextInt();
                    System.out.println(Division.dividirEnteros(numeradorEntero,denominadorEntero));
                    break;
                case 3:
                    System.out.println("Dame el número: ");
                    double numero = sc.nextInt();
                    System.out.println(Division.inverso(numero));
                    break;
            }
        } while (opcion != 4);
    }

}

