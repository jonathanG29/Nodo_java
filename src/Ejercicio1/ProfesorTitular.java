package Ejercicio1;

import Ejercicio1.abstracto.Profesor;

public class ProfesorTitular extends Profesor {

    public ProfesorTitular() {
    }

    public ProfesorTitular(int id, String nombre, String apellidos, double sueldo, String departamento, int fechaIngreso, float porcBono) {
        super(id, nombre, apellidos, sueldo, departamento, fechaIngreso, porcBono);
    }
}
