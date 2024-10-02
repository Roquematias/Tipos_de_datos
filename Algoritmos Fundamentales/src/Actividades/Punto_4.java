package Actividades;

import java.util.Scanner;

public class Punto_4 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] arr = new int[20];

			System.out.println("Ingrese 20 elementos enteros:");
			for (int i = 0; i < arr.length; i++) {
			    System.out.print("Elemento " + (i + 1) + ": ");
			    arr[i] = scanner.nextInt();
			}

			System.out.print("Desea ordenar ASCENDENTE o DESCENDENTE? (Ingrese 'ASC' o 'DESC'): ");
			String orden = scanner.next().toUpperCase();

			System.out.print("Seleccione el método de ordenamiento (inserción, burbuja, selección): ");
			String metodo = scanner.next().toLowerCase();

			System.out.print("Array original: ");
			mostrarArray(arr);

			switch (metodo) {
			    case "insercion":
			        ordenarPorInsercion(arr, orden);
			        break;
			    case "burbuja":
			        ordenarPorBurbuja(arr, orden);
			        break;
			    case "seleccion":
			        ordenarPorSeleccion(arr, orden);
			        break;
			    default:
			        System.out.println("Metodo no reconocido. Saliendo.");
			        return;
			}

			System.out.print("Array ordenado (" + orden + "): ");
			mostrarArray(arr);
		}
    }

    private static void mostrarArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void ordenarPorInsercion(int[] arr, String orden) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && (orden.equals("ASC") ? arr[j] > clave : arr[j] < clave)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = clave;
        }
    }

    private static void ordenarPorBurbuja(int[] arr, String orden) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((orden.equals("ASC") && arr[j] > arr[j + 1]) ||
                    (orden.equals("DESC") && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void ordenarPorSeleccion(int[] arr, String orden) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceCambio = i;
            for (int j = i + 1; j < n; j++) {
                if ((orden.equals("ASC") && arr[j] < arr[indiceCambio]) ||
                    (orden.equals("DESC") && arr[j] > arr[indiceCambio])) {
                    indiceCambio = j;
                }
            }
            int temp = arr[indiceCambio];
            arr[indiceCambio] = arr[i];
            arr[i] = temp;
        }
    }
}
