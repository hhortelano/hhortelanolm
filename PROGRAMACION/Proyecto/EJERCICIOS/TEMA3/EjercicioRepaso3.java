package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una temperatura");
        int temp = sc.nextInt();


        System.out.println(temperatura(temp));
    }

    public static String temperatura(int temp) {
        if (temp <= 10) {
            return "Frio";
        } else if (temp > 10 && temp <= 20) {
            return "templado";
        } else {
            return "Calor";
        }
    }
}
