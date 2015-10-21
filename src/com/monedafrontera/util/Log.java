
package com.monedafrontera.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Luis Fernando Orriz |@lfernandortiz
 */
public class Log {

    /**
     * Imprime el log de actividad en la consola del servidor web.
     *
     * @param fec
     * @param tipo
     * @param mensaje
     */
    public static void imprimirLog(Date fec, String tipo, String mensaje) {
        //formatea el mensaje de salida
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = sdf.format(fec);
        String mensajeSalida = String.format("%s\t[%s]:\t%s\n", fecha, tipo, mensaje);
        //imprime el log
        System.out.print(mensajeSalida);

    }//fin del metodo imprimirLog
}
