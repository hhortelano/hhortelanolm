package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero positivo");
        int num = sc.nextInt();

        do {
            System.out.println("Dame un numero positivo");
            num = sc.nextInt();
        } while (num >= 0);


    }
}
