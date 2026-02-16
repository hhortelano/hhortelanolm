package TEMA5;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[10];

        // Generar números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100); // 0 a 99
        }

        // Mostrar el array en una sola línea
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Bucle indefinido
        while (true) {

            System.out.print("Introduce un numero: ");
            int n = sc.nextInt();


            // Para parar el programa si es negativo
            if (n < 0) {
                break;
            }

            //
            boolean encontrado = false;


            // Busca el numero en el array

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == n) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("El numero SI esta en el array");
            } else {
                System.out.println("El numero NO esta en el array");
            }
        }
    }
}

