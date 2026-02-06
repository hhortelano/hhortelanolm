package TEMA4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vamos hacer una cuenta atras dame el numero por el cual empezar: ");
        int num = sc.nextInt();

        cuentaAtras(num);

    }

    public static void cuentaAtras(int num) {
        if (num <= 0) {
            return;
        }

        System.out.println(num);
        cuentaAtras(num - 1);
    }
}
