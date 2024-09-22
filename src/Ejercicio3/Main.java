package Ejercicio3;

import Ejercicio3.Clases.Adminstrador;
import Ejercicio3.Clases.Cliente;
import Ejercicio3.Clases.GestorViajes;
import Ejercicio3.Dominio.Proveedor;
import Ejercicio3.Dominio.Viaje;

public class Main {

    public static void main(String[] args) {
        //Inicializar clases

        Cliente cliente1 = new Cliente(1, "Juan", "Perez", "12/12/1990", "Calle 123", 123456);
        Cliente cliente2 = new Cliente(2, "Maria", "Gomez", "12/12/1990", "Calle 123", 123456);
        Adminstrador admin1 = new Adminstrador(1, "Pedro", "Gomez", "12/12/1990", "Calle 123", 123456, "Admin1");
        GestorViajes gestor1 = new GestorViajes(1, "Maria", "Lopez", "12/12/1990", "Calle 123", 123456, "oficina1");

        //inicializar viajes
        Viaje viaje1 = new Viaje("1", "Medellin");
        Viaje viaje2 = new Viaje("2", "Bogota");

        //Inicializar proveedores
        Proveedor proveedor1 = new Proveedor(1, "Airbnb");
        Proveedor proveedor2 = new Proveedor(2, "Booking");

        //Agregar destinos al cliente
        cliente1.getDestinos().add("Medellin");
        cliente2.getDestinos().add("Bogota");

        //Mostrar datos
        admin1.mostrarDatos();
        gestor1.mostrarDatos();


        System.out.println("***");
        cliente1.mostrarDatos();

        System.out.println("Viaje 1: "  + viaje1.getNombreCiudad());
        System.out.println("Proveedor 1: " + proveedor1.getNombrePlataforma());

        System.out.println("****");
        cliente2.mostrarDatos();

        System.out.println("Viaje 2: "  + viaje2.getNombreCiudad());
        System.out.println("Proveedor 2: " + proveedor2.getNombrePlataforma());


    }
}
