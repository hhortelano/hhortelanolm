package TEMA4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero y paso su tabla de multiplicar: ");
        int numero = sc.nextInt();

        EscribirTablaMultiplicar(numero);


    }

    public static void EscribirTablaMultiplicar(int numero) {

        for (int i = 1; i <= 10;i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }

    }
}
