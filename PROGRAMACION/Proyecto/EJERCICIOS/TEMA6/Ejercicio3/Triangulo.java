package TEMA6.Ejercicio3;

public class Triangulo implements Poligono{
    //  ATRIBUTOS

    private double base;
    private double altura;

    //  CONSTRUCTORES

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // LLAMADA INTERFAZ

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
