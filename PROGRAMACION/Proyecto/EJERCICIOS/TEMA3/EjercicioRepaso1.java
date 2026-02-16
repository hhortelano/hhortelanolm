package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el numero
        System.out.print("Dame un numero y te dire si es par: ");
        int num = sc.nextInt();

        // Llamamos a la funcion
        par(num);
    }

    //Creamos la funcion
    public static void par(int num) {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    };

}
