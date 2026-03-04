package TEMA5;

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random r = new Random();

        // Array
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(21) - 10;
        }


        //Mostrar array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Mostrar elementos que se repiten

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++){
                if ( numeros[i] == numeros[j]) {
                    System.out.println(numeros[j]);
                }
            }
        }
    }
}
