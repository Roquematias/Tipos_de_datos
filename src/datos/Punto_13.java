package datos;
import java.util.Scanner;

public class Punto_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.contains(cadena2)) {
            System.out.println("La segunda cadena se encuentra dentro de la primera.");
        } else {
            System.out.println("La segunda cadena no se encuentra dentro de la primera.");
        }

        scanner.close();
    }
}
