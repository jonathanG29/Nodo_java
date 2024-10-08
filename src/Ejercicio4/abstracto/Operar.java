package Ejercicio4.abstracto;



public abstract class Operar {

    protected double num1;
    protected double num2;

    public Operar(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double operacion();

}
