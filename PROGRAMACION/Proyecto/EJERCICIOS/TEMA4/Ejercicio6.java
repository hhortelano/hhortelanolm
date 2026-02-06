package TEMA4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Dame el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("El resultado de la media arimetica de " + num1 + " y " + num2 + " es: " + media(num1,num2));

    }

    public static double media(int num1, int num2) {
        double resultado = (num1 + num2) / 2.0;
        return resultado;
    }
}
