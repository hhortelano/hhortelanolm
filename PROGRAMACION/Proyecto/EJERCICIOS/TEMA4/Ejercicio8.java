package TEMA4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Dame el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("El mayor es " + mayor(num1,num2));
        System.out.println("El mayor es " + mayor2(num1,num2));
    }



    public static int mayor(int num1,int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    public static double mayor2(double num1,double num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
