package Ejercicio1;

import Ejercicio1.abstracto.Asalariado;

public class PersonalAdmvo extends Asalariado {

    private double porcentajeBono;

    public PersonalAdmvo(int id, String nombre, String apellidos, double sueldo, String departamento, String fechaIngreso, float porcBono) {
        super(id, nombre, apellidos, sueldo, departamento, Integer.parseInt(fechaIngreso), porcBono);

    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    protected void calculateBono() {
        porcentajeBono = getSueldo() * getPorcBono() / 100;
    }


    public void mostrarBono() {
        calculateBono();
        System.out.println("El personal " + getNombre() + " " + getApellidos() + " tiene un bono de: " + getPorcentajeBono() + "$ por su sueldo de: " + getSueldo() + "$");
    }
}
