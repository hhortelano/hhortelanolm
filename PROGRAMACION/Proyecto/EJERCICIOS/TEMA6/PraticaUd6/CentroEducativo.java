package TEMA6.PraticaUd6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class CentroEducativo {
    //  ATRIBUTOS
    private ArrayList<Trabajador> listaTrabajadores;

    // GETTERS AND SETTERS

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    //  CONSTRUCTORES


    public CentroEducativo() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public CentroEducativo(ArrayList<Trabajador> lista) {
        this.listaTrabajadores = new ArrayList<>(lista);
    }

    //  METODOS

    public void añadirTrabajador(Trabajador e){
        this.listaTrabajadores.add(e);
    }

    public void mostrarTrabajadores() {
        for (Trabajador e : this.listaTrabajadores) {
            System.out.println(e);
        }
    }

    public double mediaSalario() {
        double salarioMedio = 0;
        for (Trabajador e : this.listaTrabajadores) {
            salarioMedio += e.getSalarioBase();
        }
        return salarioMedio / listaTrabajadores.size();
    }

    public Trabajador masAntiguo() {
        Trabajador antiguo = listaTrabajadores.get(0);
        for (Trabajador e : listaTrabajadores){
            if (e.antiguedad() > antiguo.antiguedad()){
                antiguo = e;
            }
        }
        return antiguo;
    }

    public void buscarTrabajador(String nombreTipo){
        boolean encontrado = false;
        for (Trabajador e : listaTrabajadores) {

            if (nombreTipo.equals(e.getNombre()) || e instanceof  Profesor){
                System.out.println(e + " es un profesor.");
                encontrado = true;
            } else if (nombreTipo.equals(e.getNombre()) || e instanceof PersonalAdministrativo) {
                System.out.println(e + " es personal administrativo.");
                encontrado = true;
            }



        }
        if (!encontrado) {
            System.out.println("No existe un trabajador con ese nombre o tipo.");
        }
    }

}
