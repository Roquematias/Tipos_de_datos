package datos;

import java.util.Scanner;

public class Punto_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        String numeroComoString = String.valueOf(numero);

        System.out.println("El numero como String es: " + numeroComoString);

        scanner.close();
    }
}
