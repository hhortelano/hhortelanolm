import java.util.Scanner;

public class Ejercicio21 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame una frase y te saco las 's' : ");
        String frase = sc.nextLine().toLowerCase().replace('á', 'a');



        int contador = 0;
        for(int i = 0; i < frase.length(); i++){
            if ( frase.charAt(i) == 'a') {
                contador++;

                System.out.println("'a' encontrada" + contador + "La posicion de la a es " + (i + 1));
            }
        }
        System.out.println("Hay " + contador + " 'a'.");
    }
}
