package TEMA6.Ejercicio3;

public class Cuadrado implements Poligono{
    //  ATRIBUTOS
    private double lado;

    //  CONSTRUCTORES

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // LLAMADA INTERFAZ

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
