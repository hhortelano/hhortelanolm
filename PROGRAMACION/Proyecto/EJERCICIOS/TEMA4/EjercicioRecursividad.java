package TEMA4;

import java.util.Scanner;

public class EjercicioRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero y te hago la cuenta atras: ");
        int num  = sc.nextInt();

        contar(num);
    }

    public static void contar(int num) {

        if (num == 0) {
            return;
        }

        contar(num - 1);
        System.out.println(num);
    }
}
