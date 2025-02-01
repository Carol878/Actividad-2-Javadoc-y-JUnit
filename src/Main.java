import java.util.Scanner;
public class Main {

    // Metodo elegir opción para swich principal
    public static String elegirOpcion(Scanner sc) {
        String opciones;
        System.out.println("¿Qué tipo de operación quieres realizar?");
        System.out.println("1 Suma, 2 Resta, 3 Multiplicar, 4 Dividir, 5 Potencia, 6 Raíz cuadrada, 7 Salir");
        opciones = sc.next();
        return opciones;
    }
    // Función que pide al usuario un numero, para enteros (este lo podéis reutilizar en vuestro switch)
    public static int obtenerNumerodeUsuarioEntero(Scanner sc) {
        int numero;
        System.out.println("Dame un número");
        numero = sc.nextInt();
        return numero;
    }
    // Función que pide al usuario un numero, para reales (este lo podéis reutilizar en vuestro switch)
    public static double obtenerNumerodeUsuarioReales(Scanner sc) {
        double numero;
        System.out.println("Dame un número");
        numero = sc.nextDouble();
        return numero;
    }
    // Metodo para elegir que tipo de resta realizar 2º swicht
    public static void menuTipoResta(Scanner sc, Resta resta){
        String opciones;
        System.out.println("¿Qué tipo de resta quieres realizar?");
        System.out.println("1 Resta de dos reales, 2 Resta de dos enteros, 3 Resta de tres reales, 4 Resta acumulados");
        opciones = sc.next();
        switch (opciones) {
            case "1":
                // Llamo a la función 2 veces para que el usuario me de 2 números y los guardo.
                double numero1 = obtenerNumerodeUsuarioReales(sc);
                double numero2 = obtenerNumerodeUsuarioReales(sc);
                System.out.println("el resultado es: " +resta.restaReales(numero1, numero2));
                break;
            case "2":
                // Llamo a la función 2 veces para que el usuario me de 2 números y los guardo.
                int numero3 = obtenerNumerodeUsuarioEntero(sc);
                int numero4 = obtenerNumerodeUsuarioEntero(sc);
                System.out.println("el resultado es: " +resta.restaEnteros(numero3, numero4));
                break;
            case "3":
                // Llamo a la función 3 veces para que el usuario me de 3 números y los guardo.
                double numero5 = obtenerNumerodeUsuarioReales(sc);
                double numero6 = obtenerNumerodeUsuarioReales(sc);
                double numero7 = obtenerNumerodeUsuarioReales(sc);
                System.out.println("el resultado es: " +resta.restaReales(numero5, numero6, numero7));
                break;
            case "4":
                // Llamo a la función 1 vez para que el usuario me de 1 número y lo guardo.
                double numero8 = obtenerNumerodeUsuarioReales(sc);
                System.out.println("el resultado es: " +resta.restaAcumulado(numero8));
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public static void main(String[] args) {
        // Inicialización de variables
        Scanner sc = new Scanner(System.in);
        String opciones;
        Resta resta = new Resta();
        do {
            /* Igualo y le doy un valor a opciones. La creo de tipo String para que el usuario sólo pueda interactuar
            con las opciones dadas y no de error cualquier otra cosa que escriba*/
            opciones = elegirOpcion(sc);
            switch (opciones) {
                case "1":
                    //TODO: Suma;
                    break;
                case "2":
                    // Llamo al tipo de resta que quiere utilizar el usuario
                    menuTipoResta(sc, resta);
                    break;
                case "3":
                    // TODO: Multiplicar;
                    break;
                case "4":
                    // TODO: Dividir;
                    break;
                case "5":
                    // TODO: Potencia;
                    break;
                case "6":
                    // TODO: Raiz cuadrada;
                    break;
                case "7":
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
        // Si el usuario elige cualquier cosa que no sea un número del 1 al 7 vuelve a preguntar que quiere hacer.
        while (!opciones.equals("7"));
    }
}