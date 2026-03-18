package TEMA6.Practica6;

import java.util.ArrayList;

public class Empresa {
    //  ATRIBUTO
    private final ArrayList<Empleado> empleados;

    //  GETTER

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    //  CONSTRUCTORES

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public Empresa(ArrayList<Empleado> listaExterna){
        this.empleados = new ArrayList<>(listaExterna);
    }

    //  METODOS

    public void mostrarEmpleados() {
        System.out.println("--- LISTA EMPLEADOS ---");
        // Con esto sacamos cada empleado del array y sale el toString
        for(Empleado e : this.empleados) {
            System.out.println(e);
        }
    }

    public double mediaSalario(){
        double salarioEntero = 0;
        for (Empleado e : this.empleados) {
            salarioEntero += e.getSalario();
        }
        return salarioEntero / empleados.size();
    }

    public Empleado masAntiguedad(){
        Empleado masAntiguo = empleados.get(0);
        for (Empleado e : this.empleados){
            if (e.antiguedad() < masAntiguo.antiguedad()) {
                masAntiguo = e;
            }
        }
        return masAntiguo;
    }

    public void  buscarEmpleado(String eNombrePuesto){
        boolean encontrado = false;
        for (Empleado e : this.empleados){
            if (eNombrePuesto.equals(e.getNombre()) || eNombrePuesto.equals(e.getPuesto())) {
                System.out.println(e);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningun empleado con ese nombre puesto:");
        }
    }
}
