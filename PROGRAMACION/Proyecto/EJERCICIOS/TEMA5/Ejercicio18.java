import java.util.Scanner;

public class Ejercicio18 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = sc.nextLine();

        System.out.println();
    }


    public static String[] array(String frase) {

        String[] palabras = frase.split(" ");

        return palabras;
    }
}
