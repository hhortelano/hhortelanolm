package TEMA6.Ejercicio3;

public class Rectangulo implements Poligono{
    // ATRIBUTOS
    private double base;
    private double altura;

    // CONSTRUCTORES

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // CUMPLIR LA INTERFAZ

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
