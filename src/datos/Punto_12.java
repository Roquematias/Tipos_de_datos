package datos;
import java.util.Scanner;

public class Punto_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        if (cadena.length() >= 5) {
            String letrasExtraidas = cadena.substring(3, 5);
            System.out.println("La cuarta y quinta letra son: " + letrasExtraidas);
        } else {
            System.out.println("La cadena es demasiado corta.");
        }

        scanner.close();
    }
}
