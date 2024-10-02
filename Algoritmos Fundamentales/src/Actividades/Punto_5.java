package Actividades;

import java.util.Scanner;

public class MatrizPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas, columnas;

        do {
            System.out.print("Ingrese la cantidad de filas (mayor o igual a 2): ");
            filas = scanner.nextInt();
        } while (filas < 2);

        do {
            System.out.print("Ingrese la cantidad de columnas (mayor o igual a 2): ");
            columnas = scanner.nextInt();
        } while (columnas < 2);

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int suma = 0;
        int totalElementos = filas * columnas;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        int promedio = suma / totalElementos;
        System.out.println("El promedio entero de los elementos es: " + promedio);

        boolean encontrado = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == promedio) {
                    System.out.println("El promedio se encontro en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ninguna coincidencia.");
        }
    }
}
