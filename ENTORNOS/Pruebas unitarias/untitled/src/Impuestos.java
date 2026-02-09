import java.util.Scanner;

public class Impuestos {

    public static double CalcularPVP(double precio, double impuesto){
        if(precio < 0) {
            throw new IllegalArgumentException("El tipo de impuesto no puede ser negativo");
        }
        impuesto += 1;
        return  precio*impuesto;

    }

    public static double CalcularPrecio(double precio, double impuesto) {
        if(precio < 0) {
            throw new IllegalArgumentException("El tipo de impuesto no puede ser negativo");
        }

        impuesto += 1;
        return precio / impuesto;
    }
}
