package datos;

import java.util.Scanner;

public class Punto_23 {

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String entrada = scanner.nextLine();
        
        String resultado = invertirCadena(entrada);
        
        System.out.println("Cadena invertida: " + resultado);
        
        scanner.close();
    }
}
