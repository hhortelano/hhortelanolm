package TEMA3;

import java.util.Scanner;

public class Ejercicio28_Tema3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Introduce la ultura del triangulo: ");
        int altura = sc.nextInt();

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
