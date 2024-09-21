package datos;

import java.util.Scanner;

public class Punto_21 {

    public static int sumarNaturales(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumarNaturales(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero mayor a cero: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            int resultado = sumarNaturales(numero);
            System.out.println("La suma de los números naturales desde " + numero + " hasta 1 es: " + resultado);
        } else {
            System.out.println("El número ingresado debe ser mayor a cero.");
        }
        
        scanner.close();
    }
}
