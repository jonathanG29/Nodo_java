package Ejercicio4.abstracto;

public class Potencia extends Operar {

    public Potencia(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public double operacion() {
        return Math.pow(getNum1(), getNum2());
    }
}
