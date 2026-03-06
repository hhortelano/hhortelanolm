package TEMA5;

import java.util.Scanner;

public class Ejercicio20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame una frase y te saco las 's' :" );
        String frase = sc.nextLine().toLowerCase();


        int contador = 0;


        for ( int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 's') {
                contador++;
                System.out.println(frase.charAt(i));

                System.out.println("La posicion de la 's' es: " + (i+1));
            }
        }

        System.out.println("En total hay: " + contador);
    }
}
