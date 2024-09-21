package Punto_17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesProgramas {
    public static String getFechaString(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }
}