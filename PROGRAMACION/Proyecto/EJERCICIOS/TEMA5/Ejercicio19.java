import java.util.Scanner;

public class Ejercicio19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame varios numeros separados por comas (1,2,3,4,): ");
        String numeros = sc.nextLine();

        String[] separados = numeros.split(",");

        int resultado = 0;
        for (int i = 0; i < separados.length; i++) {

                                                // Esto quita espacios en caso de que los haya
            int num = Integer.parseInt(separados[i].trim());
            resultado =  resultado + num;
        }



    }
}
