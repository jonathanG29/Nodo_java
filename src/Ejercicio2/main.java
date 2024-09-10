package Ejercicio2;

public class main {

    public static void main(String[] args) {

        Sumar sumar = new Sumar(5, 6);
        Restar restar = new Restar(5, 6);
        Multiplicar multiplicar = new Multiplicar(5, 6);
        Dividir dividir = new Dividir(5, 6);

        //imprimimos los resultados
        System.out.println("La suma de 5 + 6 es: " + sumar.operar());
        System.out.println("La resta de 5 - 6 es: " + restar.operar());
        System.out.println("La multiplicacion de 5 * 6 es: " + multiplicar.operar());
        System.out.println("La division de 5 / 6 es: " + dividir.operar());

    }
}
