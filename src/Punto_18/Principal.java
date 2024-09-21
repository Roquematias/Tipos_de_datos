package Punto_18;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        int dia = 19 ;
        int mes = 9 ;
        int anio = 2024  ;
        
        Date fecha = FuncionesProgramas.getFechaDate(dia, mes, anio);
        String fechaComoCadena = FuncionesProgramas.getFechaString(fecha);
        
        System.out.println("La fecha creada es: " + fechaComoCadena);
    }
}

