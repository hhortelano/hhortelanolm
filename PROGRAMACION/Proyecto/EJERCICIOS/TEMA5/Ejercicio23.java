public class Ejercicio23 {
    static void main() {
        String rutaCompleta = "/home/dam/Documents/UD05_Ejercicios.pdf";

        //Buscamos a partir de la ultima barra y el ultimo punto
        int ultimaBarra = rutaCompleta.lastIndexOf("/");
        int ultimoPunto = rutaCompleta.lastIndexOf(".");

        //Ahora extraemos las partes con subtring    Uso el + 1 porque me saca la posicion de la barra
        //                                           y yo quiero a partir de la siguiente posicion
        String path = rutaCompleta.substring(0, ultimaBarra + 1 );

        String nombre = rutaCompleta.substring(ultimaBarra + 1, ultimoPunto);

        String extension = rutaCompleta.substring(ultimoPunto + 1);


        // Ahora mostramos

        System.out.println("EL path es: " + path);

        System.out.println("El nombre del archivo es: " + nombre);

        System.out.println("La extension del archivo es: " + extension);




    }

}
