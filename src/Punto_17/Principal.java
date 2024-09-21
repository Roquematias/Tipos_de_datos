package Punto_17;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        String fechaComoCadena = FuncionesProgramas.getFechaString(fechaActual);
        System.out.println("La fecha actual es: " + fechaComoCadena);
    }
}
