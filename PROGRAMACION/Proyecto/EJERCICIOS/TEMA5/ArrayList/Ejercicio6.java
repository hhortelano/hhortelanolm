package TEMA5.ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        // Meter numeros aleatorios y mostrarlos
        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(-10,10));
            System.out.print(numeros + " ");
        }

         int contador = 0;
        //Comprobar negativos
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de numeros negativos es: " + contador);
    }


}
