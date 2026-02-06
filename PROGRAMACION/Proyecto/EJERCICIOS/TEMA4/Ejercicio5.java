package TEMA4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Te voy hacer un triangulo con la letra y la anchura que me digas");
        System.out.print("Dame una letra: ");
        String letra = sc.next();

        System.out.print("Dame un anchura: ");
        int anchura = sc.nextInt();
        triangulo(letra, anchura);
    }

    public static void triangulo(String letra, int anchura) {
        for (int i = anchura; i > 0; i--) {
            for (int j = i; j > 0; j--){
                System.out.print(letra);
            }
            System.out.println();
        }
    }
}
