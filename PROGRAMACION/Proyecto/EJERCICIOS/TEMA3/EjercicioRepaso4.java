package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Dame un numero entero y te saco sus multiplos");
        int num = sc.nextInt();

        multiplos(num);
    }

    public static void multiplos(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * 1);
        }
    }
}
