package datos;

import java.util.Scanner;

public class Punto_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String entrada = scanner.nextLine();
        int contadorVocales = 0;
        
        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);
            if ("aeiouAEIOU".indexOf(caracter) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("Tamaño de la cadena ingresada: " + entrada.length());
        System.out.println("Número de vocales: " + contadorVocales);
        scanner.close();
    }
}

