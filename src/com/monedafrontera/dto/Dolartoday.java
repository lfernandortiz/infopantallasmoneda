/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.monedafrontera.dto;

import com.monedafrontera.dao.*;
import com.monedafrontera.factory.*;
import com.monedafrontera.exceptions.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class Dolartoday implements Serializable
{
	/** 
	 * This attribute maps to the column epoch in the dolartoday table.
	 */
	protected long epoch;

	/** 
	 * This attribute maps to the column usdtransferencia in the dolartoday table.
	 */
	protected float usdtransferencia;

	/** 
	 * This attribute represents whether the primitive attribute usdtransferencia is null.
	 */
	protected boolean usdtransferenciaNull = true;

	/** 
	 * This attribute maps to the column usdefectivo in the dolartoday table.
	 */
	protected float usdefectivo;

	/** 
	 * This attribute represents whether the primitive attribute usdefectivo is null.
	 */
	protected boolean usdefectivoNull = true;

	/** 
	 * This attribute maps to the column usdpromedio in the dolartoday table.
	 */
	protected float usdpromedio;

	/** 
	 * This attribute represents whether the primitive attribute usdpromedio is null.
	 */
	protected boolean usdpromedioNull = true;

	/** 
	 * This attribute maps to the column usdpromedioreal in the dolartoday table.
	 */
	protected float usdpromedioreal;

	/** 
	 * This attribute represents whether the primitive attribute usdpromedioreal is null.
	 */
	protected boolean usdpromediorealNull = true;

	/** 
	 * This attribute maps to the column usdsicad2 in the dolartoday table.
	 */
	protected float usdsicad2;

	/** 
	 * This attribute represents whether the primitive attribute usdsicad2 is null.
	 */
	protected boolean usdsicad2Null = true;

	/** 
	 * This attribute maps to the column usddolartoday in the dolartoday table.
	 */
	protected float usddolartoday;

	/** 
	 * This attribute represents whether the primitive attribute usddolartoday is null.
	 */
	protected boolean usddolartodayNull = true;

	/** 
	 * This attribute maps to the column eurtransferencia in the dolartoday table.
	 */
	protected float eurtransferencia;

	/** 
	 * This attribute represents whether the primitive attribute eurtransferencia is null.
	 */
	protected boolean eurtransferenciaNull = true;

	/** 
	 * This attribute maps to the column eurefectivo in the dolartoday table.
	 */
	protected float eurefectivo;

	/** 
	 * This attribute represents whether the primitive attribute eurefectivo is null.
	 */
	protected boolean eurefectivoNull = true;

	/** 
	 * This attribute maps to the column eurpromedio in the dolartoday table.
	 */
	protected float eurpromedio;

	/** 
	 * This attribute represents whether the primitive attribute eurpromedio is null.
	 */
	protected boolean eurpromedioNull = true;

	/** 
	 * This attribute maps to the column eurpromedioreal in the dolartoday table.
	 */
	protected float eurpromedioreal;

	/** 
	 * This attribute represents whether the primitive attribute eurpromedioreal is null.
	 */
	protected boolean eurpromediorealNull = true;

	/** 
	 * This attribute maps to the column eurdolartoday in the dolartoday table.
	 */
	protected float eurdolartoday;

	/** 
	 * This attribute represents whether the primitive attribute eurdolartoday is null.
	 */
	protected boolean eurdolartodayNull = true;

	/** 
	 * This attribute maps to the column bscolcompra in the dolartoday table.
	 */
	protected float bscolcompra;

	/** 
	 * This attribute represents whether the primitive attribute bscolcompra is null.
	 */
	protected boolean bscolcompraNull = true;

	/** 
	 * This attribute maps to the column bscolventa in the dolartoday table.
	 */
	protected float bscolventa;

	/** 
	 * This attribute represents whether the primitive attribute bscolventa is null.
	 */
	protected boolean bscolventaNull = true;

	/** 
	 * This attribute maps to the column goldrate in the dolartoday table.
	 */
	protected float goldrate;

	/** 
	 * This attribute represents whether the primitive attribute goldrate is null.
	 */
	protected boolean goldrateNull = true;

	/** 
	 * This attribute maps to the column usdvefrate in the dolartoday table.
	 */
	protected float usdvefrate;

	/** 
	 * This attribute represents whether the primitive attribute usdvefrate is null.
	 */
	protected boolean usdvefrateNull = true;

	/** 
	 * This attribute maps to the column usdcolrate in the dolartoday table.
	 */
	protected float usdcolrate;

	/** 
	 * This attribute represents whether the primitive attribute usdcolrate is null.
	 */
	protected boolean usdcolrateNull = true;

	/** 
	 * This attribute maps to the column usdratetrm in the dolartoday table.
	 */
	protected float usdratetrm;

	/** 
	 * This attribute represents whether the primitive attribute usdratetrm is null.
	 */
	protected boolean usdratetrmNull = true;

	/** 
	 * This attribute maps to the column usdtrmfactor in the dolartoday table.
	 */
	protected float usdtrmfactor;

	/** 
	 * This attribute represents whether the primitive attribute usdtrmfactor is null.
	 */
	protected boolean usdtrmfactorNull = true;

	/** 
	 * This attribute maps to the column eurusdrate in the dolartoday table.
	 */
	protected float eurusdrate;

	/** 
	 * This attribute represents whether the primitive attribute eurusdrate is null.
	 */
	protected boolean eurusdrateNull = true;
        
        
        /** 
	 * This attribute maps to the column usdsicad2 in the dolartoday table.
	 */
	protected float usdsicad1;

	/** 
	 * This attribute represents whether the primitive attribute usdsicad2 is null.
	 */
	protected boolean usdsicad1Null = true;	
	
	/** 
	 * This attribute maps to the column usdcencoex in the dolartoday table.
	 */
	protected float usdcencoex;

	/** 
	 * This attribute represents whether the primitive attribute usdcencoex is null.
	 */
	protected boolean usdcencoexNull = true;

	/**
	 * Method 'Dolartoday'
	 * 
	 */
	public Dolartoday()
	{
	}

	/**
	 * Method 'getEpoch'
	 * 
	 * @return long
	 */
	public long getEpoch()
	{
		return epoch;
	}
	

	/**
	 * Retorna el epoch como un obejeto Date
	 * @return
	 */
	public Date getEpochDate()
	{
		Date epoch = new Date( this.getEpoch() );
		return epoch;
	}
	
	
	/**
	 * Method 'setEpoch'
	 * 
	 * @param epoch
	 */
	public void setEpoch(long epoch)
	{
		this.epoch = epoch;
	}

	/**
	 * Method 'getUsdtransferencia'
	 * 
	 * @return float
	 */
	public float getUsdtransferencia()
	{
		return usdtransferencia;
	}

	/**
	 * Method 'setUsdtransferencia'
	 * 
	 * @param usdtransferencia
	 */
	public void setUsdtransferencia(float usdtransferencia)
	{
		this.usdtransferencia = usdtransferencia;
		this.usdtransferenciaNull = false;
	}

	/**
	 * Method 'setUsdtransferenciaNull'
	 * 
	 * @param value
	 */
	public void setUsdtransferenciaNull(boolean value)
	{
		this.usdtransferenciaNull = value;
	}

	/**
	 * Method 'isUsdtransferenciaNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdtransferenciaNull()
	{
		return usdtransferenciaNull;
	}

	/**
	 * Method 'getUsdefectivo'
	 * 
	 * @return float
	 */
	public float getUsdefectivo()
	{
		return usdefectivo;
	}

	/**
	 * Method 'setUsdefectivo'
	 * 
	 * @param usdefectivo
	 */
	public void setUsdefectivo(float usdefectivo)
	{
		this.usdefectivo = usdefectivo;
		this.usdefectivoNull = false;
	}

	/**
	 * Method 'setUsdefectivoNull'
	 * 
	 * @param value
	 */
	public void setUsdefectivoNull(boolean value)
	{
		this.usdefectivoNull = value;
	}

	/**
	 * Method 'isUsdefectivoNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdefectivoNull()
	{
		return usdefectivoNull;
	}

	/**
	 * Method 'getUsdpromedio'
	 * 
	 * @return float
	 */
	public float getUsdpromedio()
	{
		return usdpromedio;
	}

	/**
	 * Method 'setUsdpromedio'
	 * 
	 * @param usdpromedio
	 */
	public void setUsdpromedio(float usdpromedio)
	{
		this.usdpromedio = usdpromedio;
		this.usdpromedioNull = false;
	}

	/**
	 * Method 'setUsdpromedioNull'
	 * 
	 * @param value
	 */
	public void setUsdpromedioNull(boolean value)
	{
		this.usdpromedioNull = value;
	}

	/**
	 * Method 'isUsdpromedioNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdpromedioNull()
	{
		return usdpromedioNull;
	}

	/**
	 * Method 'getUsdpromedioreal'
	 * 
	 * @return float
	 */
	public float getUsdpromedioreal()
	{
		return usdpromedioreal;
	}

	/**
	 * Method 'setUsdpromedioreal'
	 * 
	 * @param usdpromedioreal
	 */
	public void setUsdpromedioreal(float usdpromedioreal)
	{
		this.usdpromedioreal = usdpromedioreal;
		this.usdpromediorealNull = false;
	}

	/**
	 * Method 'setUsdpromediorealNull'
	 * 
	 * @param value
	 */
	public void setUsdpromediorealNull(boolean value)
	{
		this.usdpromediorealNull = value;
	}

	/**
	 * Method 'isUsdpromediorealNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdpromediorealNull()
	{
		return usdpromediorealNull;
	}

	/**
	 * Method 'getUsdsicad2'
	 * 
	 * @return float
	 */
	public float getUsdsicad2()
	{
		return usdsicad2;
	}

	/**
	 * Method 'setUsdsicad2'
	 * 
	 * @param usdsicad2
	 */
	public void setUsdsicad2(float usdsicad2)
	{
		this.usdsicad2 = usdsicad2;
		this.usdsicad2Null = false;
	}

	/**
	 * Method 'setUsdsicad2Null'
	 * 
	 * @param value
	 */
	public void setUsdsicad2Null(boolean value)
	{
		this.usdsicad2Null = value;
	}

	/**
	 * Method 'isUsdsicad2Null'
	 * 
	 * @return boolean
	 */
	public boolean isUsdsicad2Null()
	{
		return usdsicad2Null;
	}
        
        /**
	 * Method 'getUsdsicad1'
	 * 
	 * @return float
	 */
	public float getUsdsicad1()
	{
            return usdsicad1;
                
	}

	/**
	 * Method 'setUsdsicad1'
	 * 
	 * @param usdsicad1
	 */
	public void setUsdsicad1(float usdsicad1)
	{
		this.usdsicad1 = usdsicad1;
		this.usdsicad1Null = false;
	}

	/**
	 * Method 'setUsdsicad2Null'
	 * 
	 * @param value
	 */
	public void setUsdsicad1Null(boolean value)
	{
		this.usdsicad1Null = value;
	}

	/**
	 * Method 'isUsdsicad2Null'
	 * 
	 * @return boolean
	 */
	public boolean isUsdsicad1Null()
	{
		return usdsicad1Null;
	}

	/**
	 * Method 'getUsddolartoday'
	 * 
	 * @return float
	 */
	public float getUsddolartoday()
	{
		return usddolartoday;
	}

	/**
	 * Method 'setUsddolartoday'
	 * 
	 * @param usddolartoday
	 */
	public void setUsddolartoday(float usddolartoday)
	{
		this.usddolartoday = usddolartoday;
		this.usddolartodayNull = false;
	}

	/**
	 * Method 'setUsddolartodayNull'
	 * 
	 * @param value
	 */
	public void setUsddolartodayNull(boolean value)
	{
		this.usddolartodayNull = value;
	}

	/**
	 * Method 'isUsddolartodayNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsddolartodayNull()
	{
		return usddolartodayNull;
	}

	/**
	 * Method 'getEurtransferencia'
	 * 
	 * @return float
	 */
	public float getEurtransferencia()
	{
		return eurtransferencia;
	}

	/**
	 * Method 'setEurtransferencia'
	 * 
	 * @param eurtransferencia
	 */
	public void setEurtransferencia(float eurtransferencia)
	{
		this.eurtransferencia = eurtransferencia;
		this.eurtransferenciaNull = false;
	}

	/**
	 * Method 'setEurtransferenciaNull'
	 * 
	 * @param value
	 */
	public void setEurtransferenciaNull(boolean value)
	{
		this.eurtransferenciaNull = value;
	}

	/**
	 * Method 'isEurtransferenciaNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurtransferenciaNull()
	{
		return eurtransferenciaNull;
	}

	/**
	 * Method 'getEurefectivo'
	 * 
	 * @return float
	 */
	public float getEurefectivo()
	{
		return eurefectivo;
	}

	/**
	 * Method 'setEurefectivo'
	 * 
	 * @param eurefectivo
	 */
	public void setEurefectivo(float eurefectivo)
	{
		this.eurefectivo = eurefectivo;
		this.eurefectivoNull = false;
	}

	/**
	 * Method 'setEurefectivoNull'
	 * 
	 * @param value
	 */
	public void setEurefectivoNull(boolean value)
	{
		this.eurefectivoNull = value;
	}

	/**
	 * Method 'isEurefectivoNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurefectivoNull()
	{
		return eurefectivoNull;
	}

	/**
	 * Method 'getEurpromedio'
	 * 
	 * @return float
	 */
	public float getEurpromedio()
	{
		return eurpromedio;
	}

	/**
	 * Method 'setEurpromedio'
	 * 
	 * @param eurpromedio
	 */
	public void setEurpromedio(float eurpromedio)
	{
		this.eurpromedio = eurpromedio;
		this.eurpromedioNull = false;
	}

	/**
	 * Method 'setEurpromedioNull'
	 * 
	 * @param value
	 */
	public void setEurpromedioNull(boolean value)
	{
		this.eurpromedioNull = value;
	}

	/**
	 * Method 'isEurpromedioNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurpromedioNull()
	{
		return eurpromedioNull;
	}

	/**
	 * Method 'getEurpromedioreal'
	 * 
	 * @return float
	 */
	public float getEurpromedioreal()
	{
		return eurpromedioreal;
	}

	/**
	 * Method 'setEurpromedioreal'
	 * 
	 * @param eurpromedioreal
	 */
	public void setEurpromedioreal(float eurpromedioreal)
	{
		this.eurpromedioreal = eurpromedioreal;
		this.eurpromediorealNull = false;
	}

	/**
	 * Method 'setEurpromediorealNull'
	 * 
	 * @param value
	 */
	public void setEurpromediorealNull(boolean value)
	{
		this.eurpromediorealNull = value;
	}

	/**
	 * Method 'isEurpromediorealNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurpromediorealNull()
	{
		return eurpromediorealNull;
	}

	/**
	 * Method 'getEurdolartoday'
	 * 
	 * @return float
	 */
	public float getEurdolartoday()
	{
		return eurdolartoday;
	}

	/**
	 * Method 'setEurdolartoday'
	 * 
	 * @param eurdolartoday
	 */
	public void setEurdolartoday(float eurdolartoday)
	{
		this.eurdolartoday = eurdolartoday;
		this.eurdolartodayNull = false;
	}

	/**
	 * Method 'setEurdolartodayNull'
	 * 
	 * @param value
	 */
	public void setEurdolartodayNull(boolean value)
	{
		this.eurdolartodayNull = value;
	}

	/**
	 * Method 'isEurdolartodayNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurdolartodayNull()
	{
		return eurdolartodayNull;
	}

	/**
	 * Method 'getBscolcompra'
	 * 
	 * @return float
	 */
	public float getBscolcompra()
	{
		return bscolcompra;
	}

	/**
	 * Method 'setBscolcompra'
	 * 
	 * @param bscolcompra
	 */
	public void setBscolcompra(float bscolcompra)
	{
		this.bscolcompra = bscolcompra;
		this.bscolcompraNull = false;
	}

	/**
	 * Method 'setBscolcompraNull'
	 * 
	 * @param value
	 */
	public void setBscolcompraNull(boolean value)
	{
		this.bscolcompraNull = value;
	}

	/**
	 * Method 'isBscolcompraNull'
	 * 
	 * @return boolean
	 */
	public boolean isBscolcompraNull()
	{
		return bscolcompraNull;
	}

	/**
	 * Method 'getBscolventa'
	 * 
	 * @return float
	 */
	public float getBscolventa()
	{
		return bscolventa;
	}

	/**
	 * Method 'setBscolventa'
	 * 
	 * @param bscolventa
	 */
	public void setBscolventa(float bscolventa)
	{
		this.bscolventa = bscolventa;
		this.bscolventaNull = false;
	}

	/**
	 * Method 'setBscolventaNull'
	 * 
	 * @param value
	 */
	public void setBscolventaNull(boolean value)
	{
		this.bscolventaNull = value;
	}

	/**
	 * Method 'isBscolventaNull'
	 * 
	 * @return boolean
	 */
	public boolean isBscolventaNull()
	{
		return bscolventaNull;
	}

	/**
	 * Method 'getGoldrate'
	 * 
	 * @return float
	 */
	public float getGoldrate()
	{
		return goldrate;
	}

	/**
	 * Method 'setGoldrate'
	 * 
	 * @param goldrate
	 */
	public void setGoldrate(float goldrate)
	{
		this.goldrate = goldrate;
		this.goldrateNull = false;
	}

	/**
	 * Method 'setGoldrateNull'
	 * 
	 * @param value
	 */
	public void setGoldrateNull(boolean value)
	{
		this.goldrateNull = value;
	}

	/**
	 * Method 'isGoldrateNull'
	 * 
	 * @return boolean
	 */
	public boolean isGoldrateNull()
	{
		return goldrateNull;
	}

	/**
	 * Method 'getUsdvefrate'
	 * 
	 * @return float
	 */
	public float getUsdvefrate()
	{
		return usdvefrate;
	}

	/**
	 * Method 'setUsdvefrate'
	 * 
	 * @param usdvefrate
	 */
	public void setUsdvefrate(float usdvefrate)
	{
		this.usdvefrate = usdvefrate;
		this.usdvefrateNull = false;
	}

	/**
	 * Method 'setUsdvefrateNull'
	 * 
	 * @param value
	 */
	public void setUsdvefrateNull(boolean value)
	{
		this.usdvefrateNull = value;
	}

	/**
	 * Method 'isUsdvefrateNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdvefrateNull()
	{
		return usdvefrateNull;
	}

	/**
	 * Method 'getUsdcolrate'
	 * 
	 * @return float
	 */
	public float getUsdcolrate()
	{
		return usdcolrate;
	}

	/**
	 * Method 'setUsdcolrate'
	 * 
	 * @param usdcolrate
	 */
	public void setUsdcolrate(float usdcolrate)
	{
		this.usdcolrate = usdcolrate;
		this.usdcolrateNull = false;
	}

	/**
	 * Method 'setUsdcolrateNull'
	 * 
	 * @param value
	 */
	public void setUsdcolrateNull(boolean value)
	{
		this.usdcolrateNull = value;
	}

	/**
	 * Method 'isUsdcolrateNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdcolrateNull()
	{
		return usdcolrateNull;
	}

	/**
	 * Method 'getUsdratetrm'
	 * 
	 * @return float
	 */
	public float getUsdratetrm()
	{
		return usdratetrm;
	}

	/**
	 * Method 'setUsdratetrm'
	 * 
	 * @param usdratetrm
	 */
	public void setUsdratetrm(float usdratetrm)
	{
		this.usdratetrm = usdratetrm;
		this.usdratetrmNull = false;
	}

	/**
	 * Method 'setUsdratetrmNull'
	 * 
	 * @param value
	 */
	public void setUsdratetrmNull(boolean value)
	{
		this.usdratetrmNull = value;
	}

	/**
	 * Method 'isUsdratetrmNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdratetrmNull()
	{
		return usdratetrmNull;
	}

	/**
	 * Method 'getUsdtrmfactor'
	 * 
	 * @return float
	 */
	public float getUsdtrmfactor()
	{
		return usdtrmfactor;
	}

	/**
	 * Method 'setUsdtrmfactor'
	 * 
	 * @param usdtrmfactor
	 */
	public void setUsdtrmfactor(float usdtrmfactor)
	{
		this.usdtrmfactor = usdtrmfactor;
		this.usdtrmfactorNull = false;
	}

	/**
	 * Method 'setUsdtrmfactorNull'
	 * 
	 * @param value
	 */
	public void setUsdtrmfactorNull(boolean value)
	{
		this.usdtrmfactorNull = value;
	}

	/**
	 * Method 'isUsdtrmfactorNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdtrmfactorNull()
	{
		return usdtrmfactorNull;
	}

	/**
	 * Method 'getEurusdrate'
	 * 
	 * @return float
	 */
	public float getEurusdrate()
	{
		return eurusdrate;
	}

	/**
	 * Method 'setEurusdrate'
	 * 
	 * @param eurusdrate
	 */
	public void setEurusdrate(float eurusdrate)
	{
		this.eurusdrate = eurusdrate;
		this.eurusdrateNull = false;
	}

	/**
	 * Method 'setEurusdrateNull'
	 * 
	 * @param value
	 */
	public void setEurusdrateNull(boolean value)
	{
		this.eurusdrateNull = value;
	}

	/**
	 * Method 'isEurusdrateNull'
	 * 
	 * @return boolean
	 */
	public boolean isEurusdrateNull()
	{
		return eurusdrateNull;
	}

	/**
	 * Method 'getUsdcencoex'
	 * 
	 * @return float
	 */
	public float getUsdcencoex()
	{
		return usdcencoex;
	}

	/**
	 * Method 'setUsdcencoex'
	 * 
	 * @param usdcencoex
	 */
	public void setUsdcencoex(float usdcencoex)
	{
		
		this.usdcencoex = usdcencoex;
		this.usdcencoexNull = false;
	}

	/**
	 * Method 'setUsdcencoexNull'
	 * 
	 * @param value
	 */
	public void setUsdcencoexNull(boolean value)
	{
		this.usdcencoexNull = value;
	}

	/**
	 * Method 'isUsdcencoexNull'
	 * 
	 * @return boolean
	 */
	public boolean isUsdcencoexNull()
	{
		return usdcencoexNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Dolartoday)) {
			return false;
		}
		
		final Dolartoday _cast = (Dolartoday) _other;
		if (epoch != _cast.epoch) {
			return false;
		}
		
		if (usdtransferencia != _cast.usdtransferencia) {
			return false;
		}
		
		if (usdtransferenciaNull != _cast.usdtransferenciaNull) {
			return false;
		}
		
		if (usdefectivo != _cast.usdefectivo) {
			return false;
		}
		
		if (usdefectivoNull != _cast.usdefectivoNull) {
			return false;
		}
		
		if (usdpromedio != _cast.usdpromedio) {
			return false;
		}
		
		if (usdpromedioNull != _cast.usdpromedioNull) {
			return false;
		}
		
		if (usdpromedioreal != _cast.usdpromedioreal) {
			return false;
		}
		
		if (usdpromediorealNull != _cast.usdpromediorealNull) {
			return false;
		}
		
		if (usdsicad2 != _cast.usdsicad2) {
			return false;
		}
		
		if (usdsicad2Null != _cast.usdsicad2Null) {
			return false;
		}
		
		if (usddolartoday != _cast.usddolartoday) {
			return false;
		}
		
		if (usddolartodayNull != _cast.usddolartodayNull) {
			return false;
		}
		
		if (eurtransferencia != _cast.eurtransferencia) {
			return false;
		}
		
		if (eurtransferenciaNull != _cast.eurtransferenciaNull) {
			return false;
		}
		
		if (eurefectivo != _cast.eurefectivo) {
			return false;
		}
		
		if (eurefectivoNull != _cast.eurefectivoNull) {
			return false;
		}
		
		if (eurpromedio != _cast.eurpromedio) {
			return false;
		}
		
		if (eurpromedioNull != _cast.eurpromedioNull) {
			return false;
		}
		
		if (eurpromedioreal != _cast.eurpromedioreal) {
			return false;
		}
		
		if (eurpromediorealNull != _cast.eurpromediorealNull) {
			return false;
		}
		
		if (eurdolartoday != _cast.eurdolartoday) {
			return false;
		}
		
		if (eurdolartodayNull != _cast.eurdolartodayNull) {
			return false;
		}
		
		if (bscolcompra != _cast.bscolcompra) {
			return false;
		}
		
		if (bscolcompraNull != _cast.bscolcompraNull) {
			return false;
		}
		
		if (bscolventa != _cast.bscolventa) {
			return false;
		}
		
		if (bscolventaNull != _cast.bscolventaNull) {
			return false;
		}
		
		if (goldrate != _cast.goldrate) {
			return false;
		}
		
		if (goldrateNull != _cast.goldrateNull) {
			return false;
		}
		
		if (usdvefrate != _cast.usdvefrate) {
			return false;
		}
		
		if (usdvefrateNull != _cast.usdvefrateNull) {
			return false;
		}
		
		if (usdcolrate != _cast.usdcolrate) {
			return false;
		}
		
		if (usdcolrateNull != _cast.usdcolrateNull) {
			return false;
		}
		
		if (usdratetrm != _cast.usdratetrm) {
			return false;
		}
		
		if (usdratetrmNull != _cast.usdratetrmNull) {
			return false;
		}
		
		if (usdtrmfactor != _cast.usdtrmfactor) {
			return false;
		}
		
		if (usdtrmfactorNull != _cast.usdtrmfactorNull) {
			return false;
		}
		
		if (eurusdrate != _cast.eurusdrate) {
			return false;
		}
		
		if (eurusdrateNull != _cast.eurusdrateNull) {
			return false;
		}
		
		if (usdsicad1 != _cast.usdsicad1) {
			return false;
		}
		
		if (usdsicad1Null != _cast.usdsicad1Null) {
			return false;
		}
		
		if (usdcencoex != _cast.usdcencoex) {
			return false;
		}
		
		if (usdcencoexNull != _cast.usdcencoexNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (epoch ^ (epoch >>> 32));
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdtransferencia);
		_hashCode = 29 * _hashCode + (usdtransferenciaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdefectivo);
		_hashCode = 29 * _hashCode + (usdefectivoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdpromedio);
		_hashCode = 29 * _hashCode + (usdpromedioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdpromedioreal);
		_hashCode = 29 * _hashCode + (usdpromediorealNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdsicad2);
		_hashCode = 29 * _hashCode + (usdsicad2Null ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usddolartoday);
		_hashCode = 29 * _hashCode + (usddolartodayNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurtransferencia);
		_hashCode = 29 * _hashCode + (eurtransferenciaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurefectivo);
		_hashCode = 29 * _hashCode + (eurefectivoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurpromedio);
		_hashCode = 29 * _hashCode + (eurpromedioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurpromedioreal);
		_hashCode = 29 * _hashCode + (eurpromediorealNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurdolartoday);
		_hashCode = 29 * _hashCode + (eurdolartodayNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(bscolcompra);
		_hashCode = 29 * _hashCode + (bscolcompraNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(bscolventa);
		_hashCode = 29 * _hashCode + (bscolventaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(goldrate);
		_hashCode = 29 * _hashCode + (goldrateNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdvefrate);
		_hashCode = 29 * _hashCode + (usdvefrateNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdcolrate);
		_hashCode = 29 * _hashCode + (usdcolrateNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdratetrm);
		_hashCode = 29 * _hashCode + (usdratetrmNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdtrmfactor);
		_hashCode = 29 * _hashCode + (usdtrmfactorNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(eurusdrate);
		_hashCode = 29 * _hashCode + (eurusdrateNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdsicad1);
		_hashCode = 29 * _hashCode + (usdsicad1Null ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(usdcencoex);
		_hashCode = 29 * _hashCode + (usdcencoexNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DolartodayPk
	 */
	public DolartodayPk createPk()
	{
		return new DolartodayPk(epoch);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		Date fec = new Date( this.getEpoch() );
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String fecha = sdf.format(fec);
		long epochSystm =  System.currentTimeMillis();
		long dif = ( epochSystm - this.getEpoch() );
		
		
		return 
		String.format("Dolar Today: %s\n\n" +
				"DOLAR:\n" +
				"Transferencia:\t\t%.2f\n" +
				"Efectivo:\t\t%.2f\n" +
				"Promedio:\t\t%.2f\n" +
				"Promedio Real:\t\t%.2f\n" +
				"SICAD 2:\t\t%.2f\n" +
				"SICAD 1:\t\t%.2f\n" +
				"Dolar Today:\t\t%.2f\n\n" +
				"EURO:\n" +
				"Transferencia:\t\t%.2f\n" +
				"Efectivo:\t\t%.2f\n" +
				"Promedio:\t\t%.2f\n" +
				"Promedio Real:\t\t%.2f\n" +
				"Dolar Today:\t\t%.2f\n\n" +
				"Bs. Colombia:\n" +
				"Compra:\t\t\t%.2f\n" +
				"Venta:\t\t\t%.2f\n\n" +
				"Oro:\n" +
				"Tasa:\t\t\t%.2f\n\n" +
				"Dolar - Bsf:\n" +
				"Factor:\t\t\t%.4f\n\n" +
				"Dolar Colombia:\n" +
				"Tasa:\t\t\t%.2f\n" +
				"TRM:\t\t\t%.2f\n" +
				"TRM Factor:\t\t%.2f\n\n" +
				"Euro - Dolar:\n" +
				"Factor:\t\t\t%.4f\n\n" +
				"Ultima actualizacion hace %d minutos\n",
				fecha, 
				this.getUsdtransferencia(), 
				this.getUsdefectivo(),
				this.getUsdpromedio(), 
				this.getUsdpromedioreal(),
				this.getUsdsicad2(),
				this.getUsdsicad1(),
				this.getUsddolartoday(),
				this.getEurdolartoday(),
				this.getEurefectivo(),
				this.getEurpromedio(),
				this.getEurpromedioreal(),
				this.getEurdolartoday(),
				this.getBscolcompra(),
				this.getBscolventa(),
				this.getGoldrate(),
				this.getUsdvefrate(),
				this.getUsdcolrate(),
				this.getUsdratetrm(),
				this.getUsdtrmfactor(),
				this.getEurusdrate(),
				(dif/1000/60));
		
	}
}
