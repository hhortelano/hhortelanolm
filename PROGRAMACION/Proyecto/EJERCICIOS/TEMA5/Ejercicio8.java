package TEMA5;

import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Random r = new Random();

        //Primer array
        int[] numeros1 = new int[10];

        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = r.nextInt(21) - 10;
        }

        //Segundo array
        int[] numeros2 = new int[10];

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = r.nextInt(21) - 10;
        }

        //Mostrar Primer array
        for (int i = 0; i < numeros1.length; i++) {
            System.out.print(numeros1[i] + " ");
        }

        //Mostrar segundo array
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + "");
        }

        //Hacer array de la suma
        int [] numeros3 = new int[10];

        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = numeros1[i] + numeros2[i];
        }

        //Mostrar array de la suma
        for (int i = 0; i > numeros3.length; i++) {
            System.out.println(numeros3[i] + " ");
        }


    }
}
