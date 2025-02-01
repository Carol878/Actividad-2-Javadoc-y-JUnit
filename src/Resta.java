public class Resta
{
    // Variable para guardar acumulados
    double resAcumulado =0;

    // Creo constructor vacio, para poder llamar a la función.
    public Resta (){
    }

    // Creo función resta de 2 reales
    double restaReales (double realA, double realB)
    {
        double resultado = realA - realB;
        return resultado;
    }
    // Creo función resta de 2 enteros
    int restaEnteros (int enteroA, int enteroB)
    {
        int resultado = enteroA - enteroB;
        return resultado;
    }
    // Creo función resta de 3 reales
    double restaReales (double realA, double realB, double realC)
    {
        double resultado = realA - realB - realC;
        return resultado;
    }

    // Resta con valor acumulados
    double restaAcumulado (double acumulado)
    {
        resAcumulado = acumulado - resAcumulado;
        return resAcumulado;
    }
}
