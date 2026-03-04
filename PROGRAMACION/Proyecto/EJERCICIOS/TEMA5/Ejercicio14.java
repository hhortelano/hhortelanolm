import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        //Declaracion de Arrays;
        String[] Teruel = {"Alcañiz", "Cella", "Barbastro", "Villarquemado", "Calamocha"};
        String[] Zaragoza = {"Uncastillo", "Tauste", "Biel", "Alagon", "Tarazona"};
        String[] Huesca = {"Benasque", "Broto", "Jaca", "Torla", "Formigal"};

        System.out.print("Dime una provincia de Aragon: ");
        //El toLoweCase es para que transforme en minuscula
        String provincia = sc.nextLine().toLowerCase();

        switch (provincia) {
            case "teruel":

                System.out.print("Dime cuantos pueblos quieres añadir: ");
                int cantidad = sc.nextInt();
                sc.nextLine();   // limpiar buffer

                String[] nuevos = new String[cantidad];
                int validos = 0;

                for (int i = 0; i < cantidad; i++) {

                    System.out.print("Dime el nombre del pueblo que quieres añadir: ");
                    String pueblo = sc.nextLine();

                    boolean repetido = false;

                    // comprobar si ya existe en Teruel
                    for (int j = 0; j < Teruel.length; j++) {
                        if (Teruel[j].equalsIgnoreCase(pueblo)) {
                            repetido = true;
                        }
                    }

                    // comprobar si ya está en los nuevos
                    for (int j = 0; j < validos; j++) {
                        // Compara lo que hay en el array con lo escrito por el usuario sin tener en cuenta mayus y minus
                        if (nuevos[j].equalsIgnoreCase(pueblo)) {
                            repetido = true;
                        }
                    }

                    if (!repetido) {
                        nuevos[validos] = pueblo;
                        validos++;
                    } else {
                        System.out.println("Ese pueblo ya existe, introduce otro.");
                        i--;   // para volver a pedir este
                    }
                }

                // crear nuevo array
                String[] aux = new String[Teruel.length + validos];

                // copiar los antiguos
                for (int i = 0; i < Teruel.length; i++) {
                    aux[i] = Teruel[i];
                }

                // copiar los nuevos
                for (int i = 0; i < validos; i++) {
                    aux[Teruel.length + i] = nuevos[i];
                }

                // sustituir el array
                Teruel = aux;

                System.out.println("Pueblos añadidos correctamente.");

                break;
            case "zaragoza":

                System.out.print("Dime cuantos pueblos quieres añadir: ");
                int candidaZ = sc.nextInt();
                sc.nextLine();   // limpiar buffer

                String[] nuevosZ = new String[candidaZ];
                int validosZ = 0;

                for (int i = 0; i < candidaZ; i++) {

                    System.out.print("Dime el nombre del pueblo que quieres añadir: ");
                    String puebloZ = sc.nextLine();

                    boolean repetidoZ = false;

                    // comprobar si ya existe en Teruel
                    for (int j = 0; j < Zaragoza.length; j++) {
                        if (Zaragoza[j].equalsIgnoreCase(puebloZ)) {
                            repetidoZ = true;
                        }
                    }

                    // comprobar si ya está en los nuevos
                    for (int j = 0; j < validosZ; j++) {
                        // Compara lo que hay en el array con lo escrito por el usuario sin tener en cuenta mayus y minus
                        if (nuevosZ[j].equalsIgnoreCase(puebloZ)) {
                            repetidoZ = true;
                        }
                    }

                    if (!repetidoZ) {
                        nuevosZ[validosZ] = puebloZ;
                        validosZ++;
                    } else {
                        System.out.println("Ese pueblo ya existe, introduce otro.");
                        i--;   // para volver a pedir este
                    }
                }

                // crear nuevo array
                String[] auxZ = new String[Zaragoza.length + validosZ];

                // copiar los antiguos
                for (int i = 0; i < Zaragoza.length; i++) {
                    auxZ[i] = Zaragoza[i];
                }

                // copiar los nuevos
                for (int i = 0; i < validosZ; i++) {
                    auxZ[Zaragoza.length + i] = nuevosZ[i];
                }

                // sustituir el array
                Zaragoza = auxZ;

                System.out.println("Pueblos añadidos correctamente.");

                break;
            case "huesca":
                System.out.print("Dime cuantos pueblos quieres añadir: ");
                int cantidadH = sc.nextInt();
                sc.nextLine();   // limpiar buffer

                String[] nuevosH = new String[cantidadH];
                int validosH = 0;

                for (int i = 0; i < cantidadH; i++) {

                    System.out.print("Dime el nombre del pueblo que quieres añadir: ");
                    String puebloH = sc.nextLine();

                    boolean repetidoH = false;

                    // comprobar si ya existe en Teruel
                    for (int j = 0; j < Huesca.length; j++) {
                        if (Huesca[j].equalsIgnoreCase(puebloH)) {
                            repetidoH = true;
                        }
                    }

                    // comprobar si ya está en los nuevos
                    for (int j = 0; j < validosH; j++) {
                        // Compara lo que hay en el array con lo escrito por el usuario sin tener en cuenta mayus y minus
                        if (nuevosH[j].equalsIgnoreCase(puebloH)) {
                            repetidoH = true;
                        }
                    }

                    if (!repetidoH) {
                        nuevosH[validosH] = puebloH;
                        validosH++;
                    } else {
                        System.out.println("Ese pueblo ya existe, introduce otro.");
                        i--;   // para volver a pedir este
                    }
                }

                // crear nuevo array
                String[] auxH = new String[Huesca.length + validosH];

                // copiar los antiguos
                for (int i = 0; i < Huesca.length; i++) {
                    auxH[i] = Huesca[i];
                }

                // copiar los nuevos
                for (int i = 0; i < validosH; i++) {
                    auxH[Huesca.length + i] = nuevosH[i];
                }

                // sustituir el array
                Zaragoza = auxH;

                System.out.println("Pueblos añadidos correctamente.");

                break;
            default:
                System.out.println("No es una provincia de Aragon");
                break;


        }


        String [] todos =  new String[Teruel.length + Zaragoza.length + Huesca.length];
        int pos = 0;

        //Copiar Teruel
        for ( int i = 0; i < Teruel.length; i++) {
            todos[pos] = Teruel[i];
            pos++;
        }

        //Copiar Zaragoza
        for ( int i = 0; i < Zaragoza.length; i++) {
            todos[pos] = Zaragoza[i];
            pos++;
        }

        //Copiar Huesca
        for (int i = 0; i < Huesca.length; i++) {
            todos[pos] = Huesca[i];
            pos++;
        }

        //Ordenar
        Arrays.sort(todos);

        for ( int i = 0; i < todos.length; i++) {
            System.out.print(todos[i] + " ");
        }

        System.out.println();
        System.out.print("Dime el pueblo y te lo busco: ");
        String pueblo = sc.nextLine();

        boolean encontrado = false;

        /* Buscar en Teruel */
        for (int i = 0; i < Teruel.length; i++) {
            if (Teruel[i].equalsIgnoreCase(pueblo)) {
                System.out.println(pueblo + " está en la provincia de Teruel");
                encontrado = true;
                break;
            }
        }

        /* Buscar en Zaragoza */
        if (!encontrado) {
            for (int i = 0; i < Zaragoza.length; i++) {
                if (Zaragoza[i].equalsIgnoreCase(pueblo)) {
                    System.out.println(pueblo + " está en la provincia de Zaragoza");
                    encontrado = true;
                    break;
                }
            }
        }

        /* Buscar en Huesca */
        if (!encontrado) {
            for (int i = 0; i < Huesca.length; i++) {
                if (Huesca[i].equalsIgnoreCase(pueblo)) {
                    System.out.println(pueblo + " está en la provincia de Huesca");
                    encontrado = true;
                    break;
                }
            }
        }

        /* Si no se ha encontrado */
        if (!encontrado) {

            System.out.print("No existe. Dime la provincia (teruel, zaragoza, huesca): ");
            String prov = sc.nextLine().toLowerCase();

            switch (prov) {
                case "teruel":
                    String[] nuevoTeruel = new String[Teruel.length + 1];

                    for (int i = 0; i < Teruel.length; i++) {
                        nuevoTeruel[i] = Teruel[i];
                    }

                    nuevoTeruel[nuevoTeruel.length - 1] = pueblo;
                    Teruel = nuevoTeruel;
                    break;

                case "zaragoza":
                    String[] nuevoZaragoza = new String[Zaragoza.length + 1];

                    for (int i = 0; i < Zaragoza.length; i++) {
                        nuevoZaragoza[i] = Zaragoza[i];
                    }

                    nuevoZaragoza[nuevoZaragoza.length - 1] = pueblo;
                    Zaragoza = nuevoZaragoza;
                    break;

                case "huesca":
                    String[] nuevoHuesca = new String[Huesca.length + 1];

                    for (int i = 0; i < Huesca.length; i++) {
                        nuevoHuesca[i] = Huesca[i];
                    }

                    nuevoHuesca[nuevoHuesca.length - 1] = pueblo;
                    Huesca = nuevoHuesca;
                    break;

                default:
                    System.out.println("Provincia incorrecta");
            }
        }



    }
}
