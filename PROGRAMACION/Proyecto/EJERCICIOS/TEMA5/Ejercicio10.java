package TEMA5;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numeros = new int[10];

        // Con esto metes numero aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(-10,10);
        }

        //con esto muestras el contenido del array
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] !=  numeros[j]) {
                    System.out.println(numeros[i]);
                }
            }
        }
    }
}
