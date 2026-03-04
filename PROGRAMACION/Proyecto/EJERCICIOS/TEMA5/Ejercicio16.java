import java.util.Scanner;

public class Ejercicio16 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero y le doy la vuelta: ");
        int num = sc.nextInt();


    }

    public static int alReves(int num) {

        int signo = 1;

        if (num < 0) {
            signo = -1;
            num = -num;   // lo pasamos a positivo
        }

        int resultado = 0;

        while (num > 0) {
            int cifra = num % 10;
            resultado = resultado * 10 + cifra;
            num = num / 10;
        }

        return resultado * signo;
    }
}
