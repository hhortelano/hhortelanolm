package TEMA5;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numeros = new int[10];

        //Numero aleatorio entre -10 y 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(-10,10);
        }

        // Mostrarlos en una sola linea
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Declaro el contador para los numero negativos
        int contador = 0;

        // Cuento los numero negativos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                contador++;
            }

        }
        System.out.println("El numero de negativos es " + contador);

    }
}
