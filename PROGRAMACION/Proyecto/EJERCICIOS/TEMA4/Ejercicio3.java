package TEMA4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el numero: ");
        int numero = sc.nextInt();

        System.out.print("Dame el exponente: ");
        int exponente = sc.nextInt();

        int resultado = multiplicacion(numero,exponente);

        System.out.println("El resultado de potencia es: " + resultado);

    }

    public static int multiplicacion(int numero, int exponente) {
        int resultado = 1;
        for (int i = 0;i < exponente;i++) {
            resultado *= numero;
        }
        return resultado;
    }
}
