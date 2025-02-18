package aplicacion;
import javabean.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * En esta aplicación la clase main es un menú principal que permite ver y seleccionar todas las diferentes operaciones que ofrece la
 * calculadora y según la selección redirige a un menú diferente para cada tipo de operación.
 *
 * @implNote Este menu implementa un objeto de tipo {@link Scanner} para leer el numero introducido por el usuario
 *
 * @author Cristina Sanz Alonso
 * @author Nahir Carolina Torres
 * @author Marta Cruz Jiménez
 * @author Antonio Jose García Molina
 * @author Juan Moreno Garoz
 * @author Pablo Granados Rúa
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        Scanner scLeerTeclado = new Scanner(System.in);
        int eleccion = 0;

        do {

            eleccion = pintarMenu(scLeerTeclado);

            switch (eleccion) {
                case 1: menuTipoSuma(scLeerTeclado);
                    break;
                case 2:
                    menuTipoResta(scLeerTeclado);
                    break;
                case 3:
                    menuTipoProducto(scLeerTeclado);
                    break;
                case 4:
                    menuTipoDivision(scLeerTeclado);
                    break;
                case 5:
                    menuTipoPotencia(scLeerTeclado);
                    break;
                case 6:
                    menuTipoRaizCuadrada(scLeerTeclado);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida\n");
                    break;
            }
        }
        while (eleccion!=7);

        scLeerTeclado.close();
        System.out.println("FIN DEL PROGRAMA");
    }

    /**
     *
     * Este metodo pinta el menú y recoge la opción que el usuario elige.
     *
     * @param scLeerTeclado
     * @return eleccion
     */
    private static int pintarMenu(Scanner scLeerTeclado) {
        int eleccion;


        System.out.println("CALCULADORA BÁSICA\n");
        System.out.println("1: SUMAR");
        System.out.println("2: RESTAR");
        System.out.println("3: MULTIPLICACIÓN");
        System.out.println("4: DIVISIÓN");
        System.out.println("5: POTENCIA");
        System.out.println("6: RAÍZ CUADRADA");
        System.out.println("7: SALIR DEL PROGRAMA");

        System.out.println("Introduzca el número correspondiente a la función que desea usar (1-7): ");
        eleccion = scLeerTeclado.nextInt();

        return eleccion;
    }

    /**
     * Muestra un menu interactivo donde el usuario introduce un número real y haciendo uso de @see calcularRaizCuadrada(double), calcula su raíz cuadrada y la muestra por pantalla.
     * @param scLeerTeclado Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */

    private static void menuTipoRaizCuadrada(Scanner scLeerTeclado) {

            double numero;

            System.out.println("Escribe el número del que deseas calcular la raíz cuadrada: ");
            numero=scLeerTeclado.nextDouble();

            System.out.println("La raíz cuadrada de : " + numero + ", es igual a : " + RaizCuadrada.calcularRaizCuadrada(numero) + "\n");


        }
    /**
     * Muestra un menu interactivo donde el usuario introduce el número que se pide (entero o real) y haciendo uso de los diferentes métodos sumar sobrecargados.
     * @param leer Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */

    public static void menuTipoSuma(Scanner leer){
        System.out.println("¿Qué tipo se suma quieres realizar?");
        System.out.println("¿1 Suma de dos enteros, 2 Suma de dos reales, " +
                "3 Suma de tres reales y 4 Suma de forma acumulativa");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce el primer número");
                int sumando1 = leer.nextInt();
                System.out.println("Introduce el segundo número");
                int sumando2 = leer.nextInt();
                int resultado = Suma.sumar(sumando1, sumando2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                System.out.println("Introduce el primer número");
                double sumando3 = leer.nextDouble();
                System.out.println("Introduce el primer número");
                double sumando4 = leer.nextDouble();
                double resultado2 = Suma.sumar(sumando3, sumando4);
                System.out.println("El resultado es: " + resultado2);
                break;
            case 3:
                System.out.println("Introduce el primer número");
                double sumando5 = leer.nextDouble();
                System.out.println("Introduce el segundo número");
                double sumando6 = leer.nextDouble();
                System.out.println("Introduce el tercer número");
                double sumando7 = leer.nextDouble();
                double resultado3 = Suma.sumar(sumando5, sumando6,sumando7);
                System.out.println("El resultado es: " + resultado3);
                break;
            case 4:
                System.out.println("Introduce el sumando");
                int sumando8 = leer.nextInt();
                while (sumando8 != -1){
                    resultado = Suma.sumar(sumando8);
                    System.out.println("El resultado es: " + resultado);
                    System.out.println("Introduce el sumando");
                    sumando8= leer.nextInt();
                }
                break;
            default: System.out.println("Opcion incorrecta");
        }
    }
    /**
     * Muestra un menu interactivo donde el usuario introduce el número que se pide (entero o real) y haciendo uso de los diferentes métodos restar.
     * @param sc Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */
    public static void menuTipoResta(Scanner sc){
        String opciones;
        System.out.println("¿Qué tipo de resta quieres realizar?");
        System.out.println("1 Resta de dos reales, 2 Resta de dos enteros, 3 Resta de tres reales, 4 Resta acumulados");
        opciones = sc.next();
        switch (opciones) {
            case "1":
                System.out.println("Introduce el primer número");
                double numero1 = sc.nextDouble();
                System.out.println("Introduce el segundo número");
                double numero2 = sc.nextDouble();
                System.out.println("el resultado es: " + Resta.restaReales(numero1, numero2));
                break;
            case "2":
                System.out.println("Introduce el primer número");
                int numero3 = sc.nextInt();
                System.out.println("Introduce el segundo número");
                int numero4 = sc.nextInt();
                System.out.println("el resultado es: " + Resta.restaEnteros(numero3, numero4));
                break;
            case "3":
                System.out.println("Introduce el primer número");
                double numero5 = sc.nextDouble();
                System.out.println("Introduce el segundo número");
                double numero6 = sc.nextDouble();
                System.out.println("Introduce el tercer número");
                double numero7 = sc.nextDouble();
                System.out.println("el resultado es: " + Resta.restaReales(numero5, numero6, numero7));
                break;
            case "4":
                System.out.println("Dime cúantos números quieres restar: ");
                int numero8 = sc.nextInt();
                int[] acumulados = new int[numero8];
                for (int i = 0; i < numero8; i++) {
                    System.out.println("Dime un número: ");
                    acumulados[i] = sc.nextInt();
                }
                System.out.println("el resultado es: " + Resta.restaAcumulado(acumulados));
                break;
            default:
                System.out.println("Opción no valida");
        }
    }

    /*
     * Muestra un menu interactivo donde el usuario introduce el número que se pide (entero o real) y haciendo uso de los diferentes métodos producto.
     * @param leer Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */
    public static void menuTipoProducto(Scanner leer) {
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
                double resultado = Producto_MCJ.producto2reales(multiplo1, multiplo2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                System.out.println("Introduce el primer multiplo entero");
                int multiplo3 = leer.nextInt();
                System.out.println("Introduce el segundo multiplo entero");
                int multiplo4 = leer.nextInt();
                int resultado1 = Producto_MCJ.producto2enteros(multiplo3, multiplo4);
                System.out.println("El resultado es: " + resultado1);
                break;
            case 3:
                System.out.println("Introduce el primer multiplo real");
                double multiplo5 = leer.nextDouble();
                System.out.println("Introduce el segundo multiplo real");
                double multiplo6 = leer.nextDouble();
                System.out.println("Introduce el tercer multiplo real");
                double multiplo7 = leer.nextDouble();
                double resultado3 = Producto_MCJ.producto3reales(multiplo5, multiplo6, multiplo7);
                System.out.println("El resultado es: " + resultado3);
                break;
            case 4:
                System.out.println("Introduce la base");
                int base = leer.nextInt();
                System.out.println("Introduce el exponente");
                int expo = leer.nextInt();
                if (expo >= 0) {
                    System.out.println("El resultado es: " + Producto_MCJ.potencia(base, expo));
                } else
                    System.out.println("No es posible realizar la operacion");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    /**
     * Muestra un menu interactivo donde el usuario introduce el número que se pide (entero o real) y haciendo uso de los diferentes métodos dividir.
     * @param leer Para no crear un objeto scanner en cada menú, se crea arriba y se utiliza en cada uno.
     */

    public static void menuTipoDivision(Scanner leer) {
        int opcion = 0;
        do {
            System.out.println("Que división quieres hacer: ");
            System.out.println("1. Dividir Reales");
            System.out.println("2. Dividir Enteros");
            System.out.println("3. Inverso");
            System.out.println("4. Exit");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dame el numerador: ");
                    double numeradorReal = leer.nextDouble();
                    System.out.println("Dame el denominador: ");
                    double denominadorReal = leer.nextDouble();
                    System.out.println("El resultado es: " + Division.dividirReales(numeradorReal,denominadorReal));
                    break;
                case 2:
                    System.out.println("Dame el numerador: ");
                    int numeradorEntero = leer.nextInt();
                    System.out.println("Dame el denominador: ");
                    int denominadorEntero = leer.nextInt();
                    System.out.println("El resultado es: " + Division.dividirEnteros(numeradorEntero,denominadorEntero));
                    break;
                case 3:
                    System.out.println("Dame el número: ");
                    double numero = leer.nextDouble();
                    System.out.println("El resultado es: " + Division.inverso(numero));
                    break;
            }
        } while (opcion != 4);
    }
    /**
     * Metodo principal que permite al usuario ingresar una base y un exponente
     * para calcular su potencia utilizando el metodo {@code calcularPotencia}.
     *
     */
    public static void menuTipoPotencia (Scanner leer) {

        System.out.print("Escribe la base: ");
        int base = leer.nextInt();

        System.out.print("Escribe el exponente: ");
        int exponente = leer.nextInt();

        double resultado = Potencia.calcularPotencia(base, exponente);
        System.out.println("Resultado: " + resultado);

    }
}


