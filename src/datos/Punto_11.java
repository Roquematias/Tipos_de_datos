package datos;
import java.util.Scanner;

public class Punto_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera frase: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda frase: ");
        String palabra2 = scanner.nextLine();

        System.out.println("¿Son iguales? " + palabra1.equals(palabra2));
        System.out.println("Comparacion (compareTo): " + palabra1.compareTo(palabra2));
        System.out.println("Comparacion (compareToIgnoreCase): " + palabra1.compareToIgnoreCase(palabra2));

        scanner.close();
    }
}
