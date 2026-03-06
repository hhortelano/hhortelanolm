package TEMA6.Ejercicio1;

import java.util.ArrayList;

public class Personas {

    // ATRIBUTOS

    private ArrayList<Persona> listaPersonas;

    // CONSTRUCTORES

    public Personas() {
        this.listaPersonas = new ArrayList<>();
    }

    public Personas(Persona[] arrayRecibido) {
        this.listaPersonas = new ArrayList<>();
        for (Persona p : arrayRecibido) {
            this.listaPersonas.add(p);
        }
    }

    // METODOS

    public void añadirPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public double calcularEdadMedia() {
        if (listaPersonas.isEmpty()) return 0;
        double suma = 0;
        for (Persona p : listaPersonas) {
            suma += p.calcularEdad();
        }
        return suma / listaPersonas.size();
    }

    public Persona obtenerPersonaMasMayor() {
        if (listaPersonas.isEmpty()) return null;
        Persona masMayor = listaPersonas.get(0);
        for (Persona p : listaPersonas) {
            if (p.calcularEdad() > masMayor.calcularEdad()) {
                masMayor = p;
            }
        }
        return masMayor;
    }

}
