package TEMA5;

import java.util.Random;

public class Ejercicio7 {
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

        // Cambiar los negativos por su valor positivo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = -numeros[i];
            }
        }

    // Mostrar el array de nuevo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
