package com.monedafrontera.jdbc;

import java.lang.reflect.Type;

import com.monedafrontera.dto.Dolartoday;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author Luis Fernando Ortiz | @lfernandortiz
 */
public class DolarTodayDeserializer implements JsonDeserializer<Dolartoday> {

	@Override
	public Dolartoday deserialize(JsonElement json, Type arg1,
			JsonDeserializationContext arg2) throws JsonParseException {

		// Recibe el JSon DolarToday "https://s3.amazonaws.com/dolartoday/data.json"
		// lo asigna a un objeto JsonObject este sera nuestro objeto
		// Json principal
		JsonObject jsonDToday = json.getAsJsonObject();

		// obtengo el miembro tipo objeto JSon  _timestamp que contiene el epoch
		// y lo asigno a una varibalbe JsonObject al igual que los demas
		// miembros tipo objetos del Json principal.
		// Los nombres de las comillas es como aparecen textualmente en el Json.
		JsonObject jsonEpoch = jsonDToday.getAsJsonObject("_timestamp");
		

		// del objeto Json "_timestamp" obtengo la variable epoch
		// se multiplica por mil para quedar en milisegundo 
		// y se asigna a una variable primitiva java
		JsonElement jEpoch = jsonEpoch.get("epoch");
		long epoch = jEpoch.getAsLong() * 1000;

		//obtengo los demas miembros del Json y los asigno a JsonElement 
		//luego a variables tipo primitivas o de referencia Java
		
		/*Aca para el objeto USD del Json*/
		JsonObject jsonUsd = jsonDToday.getAsJsonObject("USD");
		JsonElement jTransferencia = jsonUsd.get("transferencia");
		float transferencia = jTransferencia.getAsFloat();
		
		JsonElement jEfectivo = jsonUsd.get("efectivo");
		float efectivo = jEfectivo.getAsFloat();

		JsonElement jPromedio = jsonUsd.get("promedio");
		float promedio = jPromedio.getAsFloat();

		JsonElement jPromedioReal = jsonUsd.get("promedio_real");
		float promedioReal = jPromedioReal.getAsFloat();

		JsonElement jSicad2 = jsonUsd.get("sicad2");
		float sicad2 = jSicad2.getAsFloat();
                
        JsonElement jSicad1 = jsonUsd.get("sicad1");
		float sicad1 = jSicad1.getAsFloat();
		
		JsonElement jCencoex = jsonUsd.get("cencoex");
		float cencoex = jCencoex.getAsFloat();
               
		JsonElement jDolarToday = jsonUsd.get("dolartoday");
		float dolartoday = jDolarToday.getAsFloat();

		/*Aca para el objeto EUR del Json*/
		JsonObject jsonEur = jsonDToday.getAsJsonObject("EUR");
		JsonElement jEurTransferencia = jsonEur.get("transferencia");
		float transferenciaEur = jEurTransferencia.getAsFloat();
		
		JsonElement jEurEfectivo = jsonEur.get("efectivo");
		float efectivoEur = jEurEfectivo.getAsFloat();
		
		JsonElement jPromedioEur = jsonEur.get("promedio");
		float promedioEur = jPromedioEur.getAsFloat();
		
		JsonElement jPromedioRealEur = jsonEur.get("promedio_real");
		float promedioRealEur = jPromedioRealEur.getAsFloat();
		
		JsonElement jEurDolarToday = jsonEur.get("dolartoday");
		float dolartodayEur = jEurDolarToday.getAsFloat();
		
		/*Aca para el objeto COL del Json*/
		JsonObject jsonCol = jsonDToday.getAsJsonObject("COL");
		JsonElement jBsColCompra = jsonCol.get("compra");
		float bsColCompra = jBsColCompra.getAsFloat();
		
		JsonElement jBsColVenta = jsonCol.get("venta");
		float bsColVenta = jBsColVenta.getAsFloat();
		
		/*Aca para el objeto GOLD del Json*/
		JsonObject jGold = jsonDToday.getAsJsonObject("GOLD");
		JsonElement jGoldRate = jGold.get("rate");
		float goldRate = jGoldRate.getAsFloat();
		
		/*Aca para el objeto USDVEF del Json*/
		JsonObject jUsdVef = jsonDToday.getAsJsonObject("USDVEF");
		JsonElement jUsdVefRate = jUsdVef.get("rate");
		float usdVefRate = jUsdVefRate.getAsFloat();
		
		/*Aca para el objeto USDCOL del Json*/
		JsonObject jUsdCol = jsonDToday.getAsJsonObject("USDCOL");
		JsonElement jUsdColRate = jUsdCol.get("rate");
		float usdColRate = jUsdColRate.getAsFloat();
		
		JsonElement jUsdColRateTrm = jUsdCol.get("ratetrm");
		float usdColRateTrm = jUsdColRateTrm.getAsFloat();
		
		JsonElement jUsdTrmFactor = jUsdCol.get("trmfactor");
		float usdTrmFactor = jUsdTrmFactor.getAsFloat();
		
		/*Aca para el objeto EURUSD del Json*/
		JsonObject jEurUsd = jsonDToday.getAsJsonObject("EURUSD");
		JsonElement jEurUsdRate = jEurUsd.get("rate");
		float eurUsdRate = jEurUsdRate.getAsFloat();
		
		//objeto Java DTO dolartoday
		Dolartoday dolarT = new Dolartoday();
		dolarT.setEpoch(epoch);
		dolarT.setUsdtransferencia(transferencia);
		dolarT.setUsdefectivo(efectivo);
		dolarT.setUsdpromedio(promedio);
		dolarT.setUsdpromedioreal(promedioReal);
		dolarT.setUsdsicad2(sicad2);
		dolarT.setUsdsicad1(sicad1);
		dolarT.setUsdcencoex(cencoex);
		dolarT.setUsddolartoday(dolartoday);
		dolarT.setEurtransferencia(transferenciaEur);
		dolarT.setEurefectivo(efectivoEur);
		dolarT.setEurpromedio(promedioEur);
		dolarT.setEurpromedioreal(promedioRealEur);
		dolarT.setEurdolartoday(dolartodayEur);
		dolarT.setBscolcompra(bsColCompra);
		dolarT.setBscolventa(bsColVenta);
		dolarT.setGoldrate(goldRate);
		dolarT.setUsdvefrate(usdVefRate);
		dolarT.setUsdcolrate(usdColRate);
		dolarT.setUsdratetrm(usdColRateTrm);
		dolarT.setUsdtrmfactor(usdTrmFactor);
		dolarT.setEurusdrate(eurUsdRate);
		
		//System.out.println(dolarT.toString());

		return dolarT;		
	}

}
