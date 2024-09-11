package Ejercicio1;

import Ejercicio1.abstracto.Voluntario;

final class VoluntarioMiembro extends Voluntario {


    public VoluntarioMiembro(int id, String nombre, String apellidos, double sueldo, String area) {
        super(id, nombre, apellidos, sueldo, area);
    }

    @Override
    public void mostrarArea(String area) {
        System.out.println("El area de trabajo es: " + area);
    }


}
