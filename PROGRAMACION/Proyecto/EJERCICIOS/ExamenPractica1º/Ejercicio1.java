package ExamenPractica1º;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    // Crea un programa que pida numeros indefinidiamente y pare cuando el numero que se ha intruducido sea menor a la suma de los dos anteriores
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menor = false;
        int ultimo = 0;
        int penultimo = 0;

        do {
            System.out.print("Dame un numero, parare cuando el numero sea menor a la suma de los anteriores: ");
            int numero = sc.nextInt();
            if (numero < (ultimo + penultimo)){
                menor = true;
            }

            penultimo = ultimo;
            ultimo = numero;
            
        } while (!menor);
    }
}
