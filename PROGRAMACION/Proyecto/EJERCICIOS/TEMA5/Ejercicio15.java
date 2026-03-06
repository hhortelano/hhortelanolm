package TEMA5;

public class Ejercicio15 {
    static void main(String[] args) {
        String texto = "Hola mundo";

        System.out.println(invertir(texto));
    }
    public static String invertir(String texto) {
        String alReves = "";

        for ( int i = texto.length() -1 ; i>=0; i--) {
            alReves = alReves + texto.charAt(i);
        }
        return alReves;

    }
}
