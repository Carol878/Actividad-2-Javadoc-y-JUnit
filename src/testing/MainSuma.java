package testing;

import javabean.Suma;

import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Suma suma = new Suma();
        int opcion = 0;
        System.out.println("Introduce 1 para sumar de dos números enteros");
        System.out.println("Introduce 2 para sumar de dos números reales");
        System.out.println("Introduce 3 para sumar de tres números reales");
        System.out.println("Introduce 4 para sumar números enteros de forma acumulativa");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce el primer sumando");
                int sumando1= leer.nextInt();
                System.out.println("Introduce el segundo sumando");
                int sumando2= leer.nextInt();
                int resultado = suma.sumar(sumando1, sumando2);
                System.out.println("El resultado es: " + resultado);
            break;
            case 2:
                System.out.println("Introduce el primer sumando");
                double sumando3= leer.nextDouble();
                System.out.println("Introduce el segundo sumando");
                double sumando4= leer.nextDouble();
                double resultado2 = suma.sumar(sumando3, sumando4);
                System.out.println("El resultado es: " + resultado2);
            break;
            case 3:
                System.out.println("Introduce el primer sumando");
                double sumando5= leer.nextDouble();
                System.out.println("Introduce el segundo sumando");
                double sumando6= leer.nextDouble();
                System.out.println("Introduce el tercer sumando");
                double sumando7= leer.nextDouble();
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
