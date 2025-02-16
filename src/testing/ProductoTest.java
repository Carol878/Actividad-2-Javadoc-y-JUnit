package testing;
import org.junit.jupiter.api.Test;
import javabean.Producto_MCJ;

public class ProductoTest {

    @Test
    public void testProducto2reales() {
        double resultado = Producto_MCJ.producto2reales(2, 3);
        assert (resultado == 6.0);
        resultado = Producto_MCJ.producto2reales(2, -3);
        assert (resultado == -6.0);
        resultado = Producto_MCJ.producto2reales(-2, -3);
        assert (resultado == 6.0);
        resultado = Producto_MCJ.producto2reales(-2, 0);
        assert (resultado == 0.0);
        resultado = Producto_MCJ.producto2reales(-2, 1);
        assert (resultado == -2.0);
        resultado = Producto_MCJ.producto2reales(-2, -1);
        assert (resultado == 2.0);
    }
    @Test
    public void testProducto2enteros(){
        int resultado = Producto_MCJ.producto2enteros(2, 3);
        assert (resultado == 6);
        resultado = Producto_MCJ.producto2enteros(2, -3);
        assert (resultado == -6);
        resultado = Producto_MCJ.producto2enteros(-2, -3);
        assert (resultado == 6);
        resultado = Producto_MCJ.producto2enteros(-2, 0);
        assert (resultado == 0);
        resultado = Producto_MCJ.producto2enteros(-2, 1);
        assert (resultado == -2);
        resultado = Producto_MCJ.producto2enteros(-2, -1);
        assert (resultado == 2);
    }
    @Test
    public void testProducto3reales(){
        double resultado = Producto_MCJ.producto3reales(2, 3, 1);
        assert (resultado == 6.0);
        resultado = Producto_MCJ.producto3reales(2.0, -3, 1);
        assert (resultado == -6.0);
        resultado = Producto_MCJ.producto3reales(-2, -3, 1);
        assert (resultado == 6.0);
        resultado = Producto_MCJ.producto3reales(-2, 0, 1);
        assert (resultado == 0.0);
        resultado = Producto_MCJ.producto3reales(-3, 1, -1);
        assert (resultado == 3.0);
        resultado = Producto_MCJ.producto3reales(-2, -1, 1);
        assert (resultado == 2.0);
    }

    @Test
    public void testPotencia(){
        double resultado = Producto_MCJ.potencia(2, 3);
        assert (resultado == 8.0);
        resultado = Producto_MCJ.potencia(-2, 3);
        assert (resultado == -8.0);
        resultado = Producto_MCJ.potencia(2, 0.5);
        assert (resultado == 1.4142135623730951);
        resultado = Producto_MCJ.potencia(6, 0);
        assert (resultado == 1);
    }


}
