package com.monedafrontera.service.tcrm.request;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.monedafrontera.services.tcrm.action.TCRMServicesInterfaceProxy;
import com.monedafrontera.services.tcrm.action.Tcrm;
import com.monedafrontera.services.tcrm.action.TcrmResponse;
import com.monedafrontera.util.Log;


/**
 * La clase <tt>TCRMRequest</tt> contiene metodos static que permiten
 * obtener un objetos TCRM desde el Web Sevices de la Superfinanciera.
 * Estos Objetos TCRM contienen informacion de la Tasa Representativa
 * del Mercado (TRM).
 * 
 * @author Luis Fernando Ortiz | @lfernandortiz
 *
 */
public class TCRMRequest {
	
	private final static String _DATE_RESPONSE_FORMAT = "EEE, d MMM yyyy HH:mm:ss Z";
	private final static String _DATE_QUERY_FORMAT = "yyyy-MM-dd";	
	private final static String _VALUE_QUERY_FORMAT = "#0.00";
	private final static String _DATE_TO_QUERY = "2015-01-09";
	private final static String _WEB_SERVICE_URL = "https://www.superfinanciera.gov.co/SuperfinancieraWebServiceTRM/TCRMServicesWebService/TCRMServicesWebService?WSDL";
	
	/**
	 * 
	 * Obtiene un objeto Tcrm con la informacion de la TRM (Tasa Representativa del Mercado)
	 * para la fecha actual. 
	 * @return Tcrm Object
	 * @throws RemoteException
	 * @throws ParseException
	 */
	public static Tcrm getTCRMCurrentDate() throws RemoteException, ParseException{
		Log.imprimirLog(new Date(), "INFO",
				"Consumiendo WEb Sevices Superfinanciera TCRM...");
		
		Tcrm trm = null;		
			
		// Simple date format declaration
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(_DATE_RESPONSE_FORMAT);
		
		// Decimal value format declaration
		DecimalFormat decimalFormat = new DecimalFormat(_VALUE_QUERY_FORMAT);
		
		TCRMServicesInterfaceProxy proxy = new TCRMServicesInterfaceProxy(_WEB_SERVICE_URL);
		
		try{
			
			// Gets the TCRM value for the current date
			TcrmResponse tcrmResponse = proxy.queryTCRM(null);
			
			trm = new Tcrm();
			
			trm.setDisplayToUser(tcrmResponse.getDisplayToUser());
			trm.setId(tcrmResponse.getId());
			trm.setUnit(tcrmResponse.getUnit());
			trm.setValidityFrom(tcrmResponse.getValidityFrom());
			trm.setValidityTo(tcrmResponse.getValidityTo());
			trm.setValue(tcrmResponse.getValue());
		}
		catch(Exception ex){
			Log.imprimirLog(new Date(), "ERROR",
					ex.getMessage());
		}
			
		
		return trm;		
	}
	
	
	/**
	 * Obtiene un objeto Tcrm con la informacion de la TRM (Tasa Representativa del Mercado)
	 * para una fecha especifica. Recibe como parametro la fecha de la consulta. 
	 * @param dateQuery
	 * @return Tcrm
	 * @throws RemoteException
	 * @throws ParseException
	 */
	public static Tcrm getTCRM( Date dateQuery) throws RemoteException, ParseException{
		Log.imprimirLog(new Date(), "INFO",
				"Consumiendo WEb Sevices Superfinanciera TCRM...");
		
		// Simple date format declaration
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(_DATE_RESPONSE_FORMAT);
		
		// Decimal value format declaration
		DecimalFormat decimalFormat = new DecimalFormat(_VALUE_QUERY_FORMAT);
		
		TCRMServicesInterfaceProxy proxy = new TCRMServicesInterfaceProxy(_WEB_SERVICE_URL);
		
		// Gets the TCRM value for the current date
		TcrmResponse tcrmResponse = proxy.queryTCRM(null);
	
		// Gets the TCRM value for the given date
//		DateFormat formatter = new SimpleDateFormat(_DATE_QUERY_FORMAT);
//		Date date = (Date)formatter.parse(dateQuery); 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateQuery);
		
		tcrmResponse = proxy.queryTCRM(calendar);
		
		Tcrm trm = new Tcrm();
		
		trm.setDisplayToUser(tcrmResponse.getDisplayToUser());
		trm.setId(tcrmResponse.getId());
		trm.setUnit(tcrmResponse.getUnit());
		trm.setValidityFrom(tcrmResponse.getValidityFrom());
		trm.setValidityTo(tcrmResponse.getValidityTo());
		trm.setValue(tcrmResponse.getValue());	
		
		return trm;		
	}
	

	

}
