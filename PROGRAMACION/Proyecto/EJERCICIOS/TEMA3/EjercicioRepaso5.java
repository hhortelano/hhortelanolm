package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Dame un numero y te hago la cuenta atras: ");
        int num = sc.nextInt();

        atras(num);

    }

    public static void atras(int num) {
         while (num >= 0) {
             System.out.println(num);
             num--;
         }
    }
}
