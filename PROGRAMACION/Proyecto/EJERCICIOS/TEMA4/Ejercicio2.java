package TEMA4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero:");
        int numero = sc.nextInt();
        System.out.println("Dame el segundo numero:");
        int numero2 = sc.nextInt();

        int resultado = menor(numero, numero2);

        System.out.println("el menor es: " + resultado);

    }


    public static int menor(int numero, int numero2){


        if (numero < numero2) {
            return numero;
        } else {
            return numero2;
        }



    }
}
