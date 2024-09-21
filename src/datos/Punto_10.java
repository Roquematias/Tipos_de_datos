package datos;
import java.util.Scanner;

public class Punto_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        System.out.print("¿Desea convertir la frase a mayusculas (M) o minusculas (m)? ");
        char opcion = scanner.next().charAt(0);
        
        if (opcion == 'M' || opcion == 'm') {
            System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        } else if (opcion == 'm' || opcion == 'M') {
            System.out.println("Frase en minusculas: " + frase.toLowerCase());
        }
        
        scanner.close();
    }
}

