package Ejercicio2;

public class Sumar extends Operacion{

    public Sumar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double operar() {
        return numero1 + numero2;
    }


}
