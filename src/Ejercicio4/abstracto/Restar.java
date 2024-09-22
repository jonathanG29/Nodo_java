package Ejercicio4.abstracto;

public class Restar extends Operar {

    public Restar(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public double operacion() {
        return getNum1() - getNum2();
    }
}
