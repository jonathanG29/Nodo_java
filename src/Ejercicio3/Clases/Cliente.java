package Ejercicio3.Clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

    private List<String> destinos;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono ) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.destinos = new ArrayList<>();
    }


    public List<String> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<String> destinos) {
        this.destinos = destinos;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("cliente " + getNombre()+ "" + getApellido());
        System.out.println("Destinos " + getDestinos());
    }
}
