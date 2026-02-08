package TEMA4;

import java.util.Scanner;

public class EjercicioMayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Dame el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("El menor entre esos numeros es: " + menor(num1, num2));
    }

    public static int menor(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}
