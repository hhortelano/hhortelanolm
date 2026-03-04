import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantos nombre vas a añadir: ");
        int cantidad = sc.nextInt();


        String[] nombres = new String[cantidad];
        for ( int i = 0; i < cantidad; i++) {
            System.out.print("Dime el nombre: ");
            nombres[i] = sc.nextLine();

        }

        Arrays.sort(nombres);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

}
