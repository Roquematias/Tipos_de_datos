package Actividades;

public class Punto_3 {
	//Ordenamiento por insercion 
	public class OrdenamientoPorInsercion {
	    public static void ordenar(int[] arr, String orden) {
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

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 5, 6};
	        String orden = "ASC";
	        ordenar(arr, orden);
	        System.out.println("Ordenado por Insercion (" + orden + "): ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
//Algoritmo de la Burbuja
	public class AlgoritmoBurbuja {
	    public static void ordenar(int[] arr, String orden) {
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

	    public static void main(String[] args) {
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        String orden = "DESC"; 
	        ordenar(arr, orden);
	        System.out.println("Ordenado por Burbuja (" + orden + "): ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
//Ordenamiento por Seleccion
	public class OrdenamientoPorSeleccion {
	    public static void ordenar(int[] arr, String orden) {
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

	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};
	        String orden = "ASC"; 
	        ordenar(arr, orden);
	        System.out.println("Ordenado por Seleccion (" + orden + "): ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
}
