package com.monedafrontera.service.tcrm.request;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.monedafrontera.services.tcrm.action.Tcrm;



public class TCRMTester 
{
	
	private final static String _DATE_RESPONSE_FORMAT = "EEE, d MMM yyyy HH:mm:ss Z";
	private final static String _DATE_QUERY_FORMAT = "yyyy-MM-dd";
	private final static String _VALUE_QUERY_FORMAT = "#0.00";	
	private final static String _DATE_TO_QUERY = "2015-01-14";

	public static void main(String[] args) {
		try {
			Tcrm trm = TCRMRequest.getTCRMCurrentDate();
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(_DATE_RESPONSE_FORMAT);
			SimpleDateFormat sdf = new SimpleDateFormat(_DATE_QUERY_FORMAT);
			
			DecimalFormat decimalFormat = new DecimalFormat(_VALUE_QUERY_FORMAT);
			System.out.println("Fecha: " + sdf.format(trm.getValidityFrom().getTime()));
			System.out.println("TRM: " + trm.getValue());
			
			System.out.println("TCRM Valida desde: " + simpleDateFormat.format(trm.getValidityFrom().getTime()));
			System.out.println("TCRM Valida hasta: " + simpleDateFormat.format(trm.getValidityTo().getTime()));
			System.out.println("Valor: " + decimalFormat.format(trm.getValue()));
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}
