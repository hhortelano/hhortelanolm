package TEMA5;

import java.util.Random;

public class Ejercicio11 {
    // Enunciado
    //Crea un programa que genere un array de 10 números aleatorios entre -10 y
    //10 de manera que no haya elementos repetidos. El programa mostrará los
    //números contenidos en el array.


    static void main(String[] args) {
        Random r = new Random();

        int[] numeros = new int[10];


        //Meter numeros aleatorios del -10 al 10 sin que se repitan numeros
        for (int i = 0; i < numeros.length; i++) {

            int nuevo;
            boolean repetido;

            do {
                nuevo = r.nextInt(-10, 10);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == nuevo) {
                        repetido = true;
                    }
                }
            } while (repetido);
            numeros[i] = nuevo;

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
