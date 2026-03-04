import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

    //Crear array con numeros random
    public static int[] crateRandom(int length, int min, int bound) {
        Random r = new Random();
        int[] numeros = new int[length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(min, bound);
        }
        return numeros;
    }

    //Mostrar array en una sola linea
    public static void showArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
        System.out.println();
    }

    //Buscar un numero en el array y decir la posicion
    public static int find(int[] numeros, int search) {
        for ( int i = 0; i < numeros.length; i++) {
            if (numeros[i] == search) {
                return i;
            }

        }
        return -1;
    }

    //Buscar un numero a partir de una posicion dada
    public static int findInd(int[] numeros, int indice, int search) {
        for ( int i = indice; i < numeros.length; i++) {
            if (numeros[i] == search) {
                return i;
            }
        }
        return -1;
    }


    public static int getMin(int[] numeros) {
        int min = numeros[0];
        for ( int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static int getMax(int[] numeros) {
        int max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }


    public static int getSum(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }


    public static double getAvg(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma+= numeros[i];
        }
        return (double) suma / numeros.length;
    }

    public static double[] getStats(int[] numeros) {

        int suma = 0;
        int min = numeros[0];
        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            suma+= numeros[i];
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        double media = (double) suma / numeros.length;

        double[] Avg = {suma, media, min, max};

        return Avg;



    }



    static void main() {

        Scanner sc = new Scanner(System.in);

        //Pedir los valores
        System.out.print("Dame la longitud que quieres del array: ");
        int length = sc.nextInt();
        System.out.print("Dame a partir de que numero se generen los numeros del array: ");
        int min = sc.nextInt();
        System.out.print("Dame el limite de numeros del array: ");
        int bound = sc.nextInt();

        int[] array = crateRandom(length, min, bound);

        crateRandom(length, min, bound);
        showArray(array);

        //Pedir valor para buscarlo en el array

        System.out.print("Dame un numero y te lo busco en el array para decirte en que posicion esta: ");
        int search = sc.nextInt();
        System.out.println(find(array, search));

        //Pedir indice y otro numero al partir del que buscar
        System.out.print("Ahora dime una posicion del array y te busco a partir de ahi el numero que me has dicho antes: ");
        int indice = sc.nextInt();
        System.out.println(findInd(array, indice, search));


        //Sacar minimo y maximos del array
        System.out.println();
        System.out.print("El minimo del array es: " + getMin(array));
        System.out.println();
        System.out.print("El maximo del array es: " + getMax(array));

    }
}
