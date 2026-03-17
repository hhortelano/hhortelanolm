package TEMA5;

import java.util.Scanner;

public class Ejercicio22 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame una frase: ");
        String frase = sc.nextLine().trim();


        //Mostrar en Mayusculas
        System.out.println("Tu frase en mayusuculas es: " + frase.toUpperCase());

        //Mostrar en Minusculas
        System.out.println("Tu frase en minusculas es: " + frase.toLowerCase());

        //Mostrar primera letra en mayusculas
        String[] sacarMayus = frase.split(" ");

        //Creamos el StringBuilder antes del bucle
        StringBuilder fraseCapital = new StringBuilder();

        for (int i = 0; i < sacarMayus.length; i++) {
            String p = sacarMayus[i]; // Guardamos la palabra actual en 'p' para que sea más corto


            String palabraArreglada = p.substring(0, 1).toUpperCase() + p.substring(1).toLowerCase();

                //Usamos .append() para añadir la palabra
            fraseCapital.append(palabraArreglada);

            //Añadimos un espacio después de la palabra para que no se peguen
            fraseCapital.append(" ");

        }

    //Al final, lo mostramos (el .trim() quita el último espacio que sobra)
        System.out.println(fraseCapital.toString().trim());
    }
}
