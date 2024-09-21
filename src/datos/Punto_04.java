package datos;

import java.util.Scanner;

public class Punto_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero ");
        double cantidad = scanner.nextDouble();

        int[] billetes = {200, 100, 50, 5, 2, 1}; 
        double[] monedas = {0.50, 0.25, 0.10, 0,05}; 

        System.out.println("Se necesitan:");
        for (int billete : billetes) {
            int cantidadBilletes = (int) (cantidad / billete);
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billete(s) de " + billete);
            }
            cantidad -= cantidadBilletes * billete;
        }

        for (double moneda : monedas) {
            int cantidadMonedas = (int) (cantidad / moneda);
            if (cantidadMonedas > 0) {
                System.out.println(cantidadMonedas + " moneda(s) de " + moneda);
            }
            cantidad -= cantidadMonedas * moneda;
        }

        scanner.close();
    }
}