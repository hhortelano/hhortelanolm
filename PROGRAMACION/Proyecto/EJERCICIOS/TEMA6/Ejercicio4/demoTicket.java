package TEMA6.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class demoTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> Lista = new ArrayList<>();


       do {
           System.out.print("Dime el nombre del articulo que has comprado: ");
           String nombre = sc.nextLine();
           System.out.print("Dime cuantas unidades has comprado: ");
           int unidades = sc.nextInt();
           System.out.print("Dime el precio del producto: ");
           double precio = sc.nextDouble();
           Ticket t1 = new Ticket(nombre, unidades, precio);

       } while ();








    }
}
