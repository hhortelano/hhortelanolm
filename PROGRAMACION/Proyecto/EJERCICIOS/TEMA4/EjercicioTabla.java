package TEMA4;

import java.util.Scanner;

public class EjercicioTabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero y te doy su tabla de multiplicar: ");
        int num = sc.nextInt();

        tabla(num);
    }

    public static void tabla(int num) {
        for (int i = 1; i <= 5;i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i + "=" + resultado);
        }
    }
}
