package Punto_18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesProgramas {
    
    public static String getFechaString(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }
    
    public static Date getFechaDate(int dia, int mes, int anio) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, dia);
        return calendar.getTime();
    }
}
