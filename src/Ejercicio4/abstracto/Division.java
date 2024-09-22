package Ejercicio4.abstracto;

public class Division extends Operar {

    public Division(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public double operacion() {

        if(getNum2() == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return getNum1() / getNum2();
    }
}
