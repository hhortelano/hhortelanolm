import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestImpuestos {
DSDFS<

    @ParameterizedTest
    @CsvSource({
            "100, 0.21, 121",
            "50, 0.10, 55",
            "0, 0.21, 0",
            "100, 0, 100"
    })
    void testCalcularPVP_DatosValidos(double precio, double impuesto, double esperado) {

        double resultado = Impuestos.CalcularPVP(precio, impuesto);

        assertEquals(esperado, resultado, 0.0001);
    }


    @ParameterizedTest
    @CsvSource({
            "121, 0.21, 100",
            "55, 0.10, 50",
            "0, 0.21, 0",
            "100, 0, 100"
    })
    void testCalcularPrecio_DatosValidos(double precio, double impuesto, double esperado) {

        double resultado = Impuestos.CalcularPrecio(precio, impuesto);

        assertEquals(esperado, resultado, 0.0001);
    }


    @Test
    void testCalcularPVP_PrecioNegativo() {

        assertThrows(IllegalArgumentException.class, () -> {
            Impuestos.CalcularPVP(-10, 0.21);
        });
    }

    @Test
    void testCalcularPrecio_PrecioNegativo() {

        assertThrows(IllegalArgumentException.class, () -> {
            Impuestos.CalcularPrecio(-10, 0.21);
        });
    }



    @Test
    void testCalcularPVP_ImpuestoNegativo_NoLanzaExcepcion() {

        double resultado = Impuestos.CalcularPVP(100, -0.10);

        assertEquals(90, resultado, 0.0001);
    }

    @Test
    void testCalcularPrecio_ImpuestoNegativo_NoLanzaExcepcion() {

        double resultado = Impuestos.CalcularPrecio(100, -0.20);

        assertEquals(125, resultado, 0.0001);
    }
}
