package TEMA4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la nota que has sacado: ");
        int nota = sc.nextInt();



        System.out.println(calificacion(nota));

    }

    public static String calificacion(int nota) {
        if (nota < 0 || nota > 10) {
            return "Nota no válida";
        }

        if (nota < 5) {
            return "Con esa nota tienes un Suspenso";
        } else if (nota <= 6) {
            return "Con esa nota tienes un Aprobado";
        } else if (nota <= 8) {
            return "Con esa nota tienes un Notable";
        } else {
            return "Con esa nota tienes un Sobresaliente";
        }
    }
}
