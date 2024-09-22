package Ejercicio4.abstracto;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {
            System.out.println("Ingrese el primer número: ");
            double num1 = scan.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            double num2 = scan.nextDouble();

            System.out.println("Selecciona la operación: 1-Suma, 2-Restar, 3-Multiplicar, 4-Dividir, 5-potencia, 0-Salir");
            int opcion = scan.nextInt();

            Operar operacion = null;

            switch (opcion){
                case 1:
                    operacion = new Suma(num1, num2);
                    break;
                case 2:
                    operacion = new Restar(num1, num2);
                    break;
                case 3:
                    operacion = new Multiplicacion(num1, num2);
                    break;
                case 4:
                    operacion = new Division(num1, num2);
                    break;
                case 5:
                    operacion = new Potencia(num1, num2);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new InputMismatchException("Opción no válida");
            }

            System.out.println("El resultado es: " + operacion.operacion());
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
