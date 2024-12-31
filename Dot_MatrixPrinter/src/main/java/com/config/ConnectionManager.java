package com.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager      
{
	static Connection connection=null;

	public static Connection getConnection()   
	{
		try
		{
	
        //ur password	 
			
			String dbDriver = "com.mysql.cj.jdbc.Driver";
		    String dbURL = "jdbc:mysql://45.118.160.218/DC_MAA_Sky_Dart_Express_opr_v2?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false";
		    String dbUsername = "admin";/// go up logistic - DC_blr_GOUP_logistics_opr_v1 ,35.154.221.117
		    String dbPassword = "adminrooFST%^&";///// balajicourier - DC_maa_balaji_onboard_courier_opr_v1,192.168.29.46
		    Class.forName(dbDriver);////Pegion - IC_MAA_Pigeonexpress_operation_v2,35.154.221.117
		    connection = DriverManager.getConnection(String.valueOf(dbURL), ///// blue wings -  117,DC_MAA_Bluewings_cargo_opr_v2
		        dbUsername, 
		        dbPassword);       //////DC_MAA_Airnet_courier_opr_v2
		}
		
		catch(Exception e)                           
		{
			e.printStackTrace();
		}

		return connection;     
	}

}                             


