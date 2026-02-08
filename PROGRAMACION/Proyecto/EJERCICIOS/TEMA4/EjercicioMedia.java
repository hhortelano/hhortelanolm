package TEMA4;

import java.util.Scanner;

public class EjercicioMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero para calcular tu media");
        int num1 = sc.nextInt();

        System.out.println("Dame el primer segundo para calcular tu media");
        int num2 = sc.nextInt();

        System.out.println("Dame el primer tercer para calcular tu media");
        int num3 = sc.nextInt();

        System.out.println("El resultado de la media es " + media(num1, num2, num3));

    }


    public static double media(int num1, int num2, int num3) {
        double resultado = (num1 + num2 + num3) / 3;
        return resultado;
    }
}
