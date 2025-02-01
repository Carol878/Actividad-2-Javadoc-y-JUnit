import java.util.Scanner;
public class Main {

    public static String elegirOpcion(Scanner sc) {
        String opciones;
        System.out.println("¿Qué tipo de operación quieres realizar?");
        System.out.println("1 Suma, 2 Resta, 3 Multiplicar, 4 Dividir, 5 Potencia, 6 Raiz cuadrada, 7 Salir");
        opciones = sc.next();
        return opciones;
    }
    public static int ()
    public static void menuTipoResta(Scanner sc, Resta resta){
        String opciones;
        System.out.println("¿Qué tipo de resta quieres realizar?");
        System.out.println("1 Resta de dos reales, 2 Resta de dos enteros, 3 Resta de tres reales, 4 Resta acumulados");
        opciones = sc.next();
        switch (opciones) {
            case "1":
                System.out.println("Dame 2 números reales");
                double numero1 = sc.nextDouble();
                double numero2 = sc.nextDouble();
                System.out.println(resta.restaReales(numero1, numero2));
                break;
            case "2":
                System.out.println("Dame 2 números enteros");
                int numero3 = sc.nextInt();
                int numero4 = sc.nextInt();
                System.out.println(resta.restaEnteros(numero3, numero4));
                break;
            case "3":
                System.out.println("Dame 3 números reales");
                double numero5 = sc.nextDouble();
                double numero6 = sc.nextDouble();
                double numero7 = sc.nextDouble();
                System.out.println(resta.restaReales(numero5, numero6, numero7));
                break;
            case "4":
                System.out.println("Dame 1 número real");
                double numero8 = sc.nextDouble();
                System.out.println(resta.restaAcumulado(numero8));
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opciones;
        Resta resta = new Resta();
        do {
            //igualo para dar un valor a opciones
            opciones = elegirOpcion(sc);
            switch (opciones) {
                case "1":
                    //TODO: Suma;
                    break;
                case "2":
                    // Llamo a el tipo de resta que quiere utilizar el usuario
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
                    System.out.println("Opcion no valida");
            }
        }
        while (!opciones.equals("7"));
    }
}