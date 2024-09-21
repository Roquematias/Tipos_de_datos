package datos;
import java.util.Scanner;

public class Punto_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double valorDecimal = scanner.nextDouble();

        short valorShort = (short) valorDecimal; 
        int valorInt = (int) valorDecimal;      
        long valorLong = (long) valorDecimal;   
        float valorFloat = (float) valorDecimal;
        String valorString = Double.toString(valorDecimal);

        System.out.println("Valor original: " + valorDecimal);
        System.out.println("Convertido a short: " + valorShort);
        System.out.println("Convertido a int: " + valorInt);
        System.out.println("Convertido a long: " + valorLong);
        System.out.println("Convertido a float: " + valorFloat);
        System.out.println("Convertido a String: " + valorString);

        scanner.close();
    }
}
