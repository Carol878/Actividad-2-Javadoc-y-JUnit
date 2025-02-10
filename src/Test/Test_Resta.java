import org.junit.jupiter.api.Test;

public class Test_Resta {
    @Test
    public void test() {
        Resta resta1 = new Resta();
        double resultadoTest = resta1.restaAcumulado(5);
        assert (resultadoTest == 5); // Comprobamos q el valor acumulado se realiza correctamente
    }
}
