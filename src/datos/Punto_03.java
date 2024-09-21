package datos;
import java.util.Scanner;

public class Punto_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número de 3 digitos: ");
        int numero = scanner.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("El numero debe estar entre 100 y 999.");
        } else {
            int suma = 0;
            suma += numero % 10;
            numero /= 10;
            suma += numero % 10;
            numero /= 10;
            suma += numero;

            System.out.println("La suma es: " + suma);
        }

        scanner.close();
    }
}