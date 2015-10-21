package com.monedafrontera.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.monedafrontera.dto.Dolartoday;
import com.monedafrontera.exceptions.DolartodayDaoException;
import com.monedafrontera.factory.DolarTodayJson;
import com.monedafrontera.jdbc.DolartodayDaoImpl;
import com.monedafrontera.util.Log;

public class TestWebServices {
	
	public static void main( String args[]) {

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        long t1 = System.currentTimeMillis();
        System.out.println("ACTUALIZANDO LAS TASAS DESDE EL TESTER");
        Log.imprimirLog(new Date(), "CONX",
                "Conectando al Web Services DolarToday");
        //obtengo el objeto de entidad (DTO) Java DolarToday del Web Services 
        //desde la URL "https://s3.amazonaws.com/dolartoday/data.json"
        Dolartoday dolar = DolarTodayJson.getDolartoday2Object();


        //objeto DAO para las operaciones de base de datos
        DolartodayDaoImpl daoD = new DolartodayDaoImpl();

        try {

            //valida si el objeto DolarToday actual ya esta Registrado en la base
            Dolartoday temp = daoD.findByPrimaryKey(dolar.getEpoch());
            if (temp != null) {
                //obtiene el ultimo registro de la base
                temp = daoD.getMaxEpoch();
                //graba el valor si es mayor que el ultimo epoc
                if (dolar.getEpoch() > temp.getEpoch()) {
                    daoD.insert(dolar);
                    Log.imprimirLog(new Date(dolar.getEpoch()), "ACT",
                            "Tasas Actualizadas en la base. Test Module");
                }
            } else {//sino existe el valor del actual epoch lo persiste en la base
                daoD.insert(dolar);
                Log.imprimirLog(new Date(dolar.getEpoch()), "ACT",
                        "Tasas Actualizadas en la base. Test Module");
            }
        } catch (DolartodayDaoException e) {
            Log.imprimirLog(new Date(), "Exceptions",
                    e.getMessage());
            e.printStackTrace();
        }
        long t2 = (System.currentTimeMillis() - t1) / 1000;
        String sec = "";
        if (t2 > 1 || t2 == 0) {
            sec = " segundos";
        } else {
            sec = " segundo";
        }
        Log.imprimirLog(new Date(), "INFO", "Tiempo de Ejecucion Thread "
                + t2 + sec);

    }//fin del metodo actualizarTasas

}
