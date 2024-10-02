package Actividades;

public class Punto_2 {
//Ordenamiento por Insercion
	public class OrdenamientoPorInsercion {
	    public static void ordenar(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int clave = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > clave) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = clave;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 5, 6};
	        ordenar(arr);
	        System.out.println("Ordenado por Insercion: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
//Algoritmo de la Burbuja
	public class AlgoritmoBurbuja {
	    public static void ordenar(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        ordenar(arr);
	        System.out.println("Ordenado por Burbuja: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
//Ordenamiento por Seleccion
	public class OrdenamientoPorSeleccion {
	    public static void ordenar(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIdx = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIdx]) {
	                    minIdx = j;
	                }
	            }
	            int temp = arr[minIdx];
	            arr[minIdx] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};
	        ordenar(arr);
	        System.out.println("Ordenado por Seleccion: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
// Búsqueda Secuencial
	public class BusquedaSecuencial {
	    public static int buscar(int[] arr, int objetivo) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == objetivo) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 10};
	        int objetivo = 6;
	        int resultado = buscar(arr, objetivo);

	        if (resultado != -1) {
	            System.out.println("Elemento encontrado en el indice: " + resultado);
	        } else {
	            System.out.println("Elemento no encontrado");
	        }
	    }
	}
}
