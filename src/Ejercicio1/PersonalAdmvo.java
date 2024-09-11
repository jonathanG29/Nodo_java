package Ejercicio1;

import Ejercicio1.abstracto.Asalariado;

public class PersonalAdmvo extends Asalariado {

    private double porcentajeBono;

    public PersonalAdmvo(int id, String nombre, String apellidos, double sueldo, String departamento, int fechaIngreso, double porcBono, double porcentajeBono) {
        super(id, nombre, apellidos, sueldo, departamento, fechaIngreso, porcBono);
        this.porcentajeBono = porcentajeBono;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }


    @Override
    protected void calculateBono() {
        super.calculateBono();
        porcentajeBono = getSueldo() * getPorcentajeBono();
    }

    public void mostrarSueldo(){
        System.out.println("El sueldo del personal administrativo es: " + getSueldo());
        System.out.println("El bono del personal administrativo es: " + porcentajeBono);
    }
}
