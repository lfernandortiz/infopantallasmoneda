package com.monedafrontera.jdbc;

import java.sql.*;

public class ResourceManager {
	
	/*private static String DRIVER_JDBC = "org.postgresql.Driver";
    private static String JDBC_URL = "jdbc:postgresql://127.0.0.1/monedafront";
    private static String JDBC_USER = "postgres";
    private static String JDBC_PASSWORD = "alondra";
    private static Driver driver = null;*/
   	

    private static String DRIVER_JDBC = "org.postgresql.Driver";
    private static String JDBC_URL = "jdbc:postgresql://192.168.1.5/monedafront";
    private static String JDBC_USER = "postgres";
    private static String JDBC_PASSWORD = "Carlos0411";
    private static Driver driver = null;

  	 
  	public static synchronized Connection getConnection() 
  			throws SQLException
  	{
  		if( driver == null){
  			try
  			{ 
  				Class jdbcDriverClass = Class.forName(DRIVER_JDBC);
  				driver = (Driver) jdbcDriverClass.newInstance();
  				DriverManager.registerDriver(driver);
  			}catch( Exception e)
  			{
  				System.out.println("Fallo la carga del Driver JDBC");
  				e.printStackTrace();
  			}
  		}
  		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);		
  	}
  	
  	
  	/** cierra ResultSet*/
  	public static void close( ResultSet rs)
  	{	
  		try {
  				if( rs != null)
  				rs.close();
  			} catch (SQLException e) {
  				e.printStackTrace();
  			}
  	}
  	
  	
  	/** cierra PreparedStatement*/
  	public static void close( PreparedStatement stmt)
  	{	
  		try {
  			if( stmt != null)
  				stmt.close();
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
  	}
  	
  	
  	/** cierra Connection*/
  	public static void close( Connection conn)
  	{	
  		try {
  			if( conn != null)
  				conn.close();
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
  	} 
    
    
}
