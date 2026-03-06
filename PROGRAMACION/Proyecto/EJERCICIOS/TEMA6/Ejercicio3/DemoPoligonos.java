package TEMA6.Ejercicio3;

import java.util.ArrayList;

public class DemoPoligonos {

    public static void main(String[] args) {
        ArrayList<Poligono> listaFiguras = new ArrayList<>();

        listaFiguras.add(new Cuadrado(5));
        listaFiguras.add(new Triangulo(10, 8));
        listaFiguras.add(new Circunferencia(3));
        listaFiguras.add(new Rectangulo(4 ,6));

        double areaTotal = 0;

        for (Poligono p : listaFiguras) {
            areaTotal += p.calcularArea();
            System.out.println("Area de la figura: " + p.calcularArea());
        }

        System.out.println("EL ARE TOTAL ES: " + areaTotal);
    }







}
