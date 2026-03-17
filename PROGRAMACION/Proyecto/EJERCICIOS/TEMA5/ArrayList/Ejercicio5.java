package TEMA5.ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(100));
            System.out.print(numeros + " ");
        }

        // Bucle indefinido
        while (true) {
            System.out.print("Introduce un numero: ");
            int num = sc.nextInt();

            // Para parar el programa si es negativo
            if (num < 0) {
                break;
            }

            boolean encontrado = false;

            // Busca el numero en el array
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) == num) {
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
