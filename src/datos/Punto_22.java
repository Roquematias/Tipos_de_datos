package datos;

import java.util.Scanner;

public class Punto_22 {

    public static int sumarDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        int resultado = sumarDigitos(numero);
        
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
        
        scanner.close();
    }
}
