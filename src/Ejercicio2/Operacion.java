package Ejercicio2;

public abstract class Operacion {

    double numero1;
    double numero2;

    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public abstract double operar();
}
