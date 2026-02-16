package TEMA3;

import java.util.Scanner;

public class EjercicioRepaso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos el parametro
        System.out.print("Dame el dia de la semana: ");
        int dia = sc.nextInt();

        //Llamamos a la funcion
        System.out.println(Semana(dia));

    }

    //Creamos la funcion
    public static String Semana(int dia){
       if (dia == 1) {
           return "Lunes";
       } else if (dia == 2) {
           return "Martes";
       } else if (dia == 3) {
           return "Miercoles";
       } else if (dia == 4) {
           return "Jueves";
       } else if (dia == 5) {
           return "Viernes";
       } else if (dia == 6) {
           return "Sabado";
       } else if (dia == 7) {
           return "Domingo";
       } else {
           return "No hay tantos dias de la semana";
       }
    }
}
