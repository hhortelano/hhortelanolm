package TEMA4;

import java.util.Scanner;

public class EjercicioTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la base del triangulo: ");
        int base = sc.nextInt();

        triangulo(base);

    }
    public static void triangulo(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
