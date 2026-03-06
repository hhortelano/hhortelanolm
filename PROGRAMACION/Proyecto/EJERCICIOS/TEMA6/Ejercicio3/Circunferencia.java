package TEMA6.Ejercicio3;

public class Circunferencia implements Poligono{
    //  ATRIBUTOS
    private double radio;

    // CONSTRUCTORES

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //  LLAMADA INTERFAZ

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
}
