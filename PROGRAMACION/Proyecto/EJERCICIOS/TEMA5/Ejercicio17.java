public class Ejercicio17 {
    static void main() {

    }
    public static String sinEspacios(String texto) {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) != ' ') {
                resultado = resultado + texto.charAt(i);
            }


        }

        return resultado;
    }
}
