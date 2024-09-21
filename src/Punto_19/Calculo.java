package Punto_19;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        OperacionMatematica operacion = new OperacionMatematica();
        
        System.out.print("Ingrese el primer numero: ");
        double valor1 = scanner.nextDouble();
        operacion.setValor1(valor1);
        
        System.out.print("Ingrese el segundo numero: ");
        double valor2 = scanner.nextDouble();
        operacion.setValor2(valor2);

        String[] operaciones = {"+", "-", "*", "/"};
        for (String op : operaciones) {
            try {
                double resultado = operacion.aplicarOperacion(op);
                System.out.println("Resultado de " + operacion.getValor1() + " " + op + " " + operacion.getValor2() + " = " + resultado);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
