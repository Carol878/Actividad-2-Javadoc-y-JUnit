/**
 * Clase que realiza sumas dentro de una aplicación de calculadora.
 * @author Nahir Carolina Torres
 * @version Version 1.0
 */

public class Resta
{
    // Variable para guardar acumulados
    double resAcumulado =0;

    // Creo constructor vacio, para poder llamar a la función.
    public Resta (){
    }

    /**
     * Creo función resta de 2 reales.
     * @param realA primer parámetro con el que se realizará la resta.
     * @param realB segundo parámetro con el que se realizará la resta.
     * @return resultado de la resta.
     */
    double restaReales (double realA, double realB)
    {
        double resultado = realA - realB;
        return resultado;
    }

    /**
     * Creo función resta de 2 enteros.
     * @param enteroA primer parámetro con el que se realizará la resta.
     * @param enteroB segundo parámetro con el que se realizará la resta.
     * @return resultado de la resta.
     */
    int restaEnteros (int enteroA, int enteroB)
    {
        int resultado = enteroA - enteroB;
        return resultado;
    }

    /**
     * Creo función resta de 3 reales.
     * @param realA primer parámetro con el que se realizará la resta.
     * @param realB segundo parámetro con el que se realizará la resta.
     * @param realC tercer parámetro con el que se realizará la resta.
     * @return resultado de la resta.
     */
    double restaReales (double realA, double realB, double realC)
    {
        double resultado = realA - realB - realC;
        return resultado;
    }

    /**
     * Resta con valor acumulados, es decir, cada vez que se use se irá acumulando el valor en la variable resAcumulado.
     * @param acumulado valor acumulado.
     * @return resultado de la resta de los valores acumulados.
     */
    double restaAcumulado (double acumulado)
    {
        resAcumulado = acumulado - resAcumulado;
        return resAcumulado;
    }
}
