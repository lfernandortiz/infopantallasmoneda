/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.monedafrontera.dao;

import com.monedafrontera.dto.*;
import com.monedafrontera.exceptions.*;

public interface PaisDao
{
	/** 
	 * Inserts a new row in the pais table.
	 */
	public PaisPk insert(Pais dto) throws PaisDaoException;

	/** 
	 * Updates a single row in the pais table.
	 */
	public void update(PaisPk pk, Pais dto) throws PaisDaoException;

	/** 
	 * Deletes a single row in the pais table.
	 */
	public void delete(PaisPk pk) throws PaisDaoException;

	/** 
	 * Returns the rows from the pais table that matches the specified primary-key value.
	 */
	public Pais findByPrimaryKey(PaisPk pk) throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the criteria 'codigopais = :codigopais'.
	 */
	public Pais findByPrimaryKey(String codigopais) throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the criteria ''.
	 */
	public Pais[] findAll() throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the criteria 'codigopais = :codigopais'.
	 */
	public Pais[] findWhereCodigopaisEquals(String codigopais) throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the criteria 'nombre = :nombre'.
	 */
	public Pais[] findWhereNombreEquals(String nombre) throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the criteria 'estado = :estado'.
	 */
	public Pais[] findWhereEstadoEquals(int estado) throws PaisDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the pais table that match the specified arbitrary SQL statement
	 */
	public Pais[] findByDynamicSelect(String sql, Object[] sqlParams) throws PaisDaoException;

	/** 
	 * Returns all rows from the pais table that match the specified arbitrary SQL statement
	 */
	public Pais[] findByDynamicWhere(String sql, Object[] sqlParams) throws PaisDaoException;

}