package Punto_20;

import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador de la primera fraccion: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la primera fraccion: ");
        int denominador1 = scanner.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);

        System.out.print("Ingrese el numerador de la segunda fraccion: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fraccion: ");
        int denominador2 = scanner.nextInt();

        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion suma = fraccion1.sumarFracciones(fraccion2);
        Fraccion resta = fraccion1.restarFracciones(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion2);
        Fraccion division = fraccion1.dividirFracciones(fraccion2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
}
