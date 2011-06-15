package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDBConn {
	
	private MySqlDBConn() {
	}
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection obtenerConexion(){
		Connection cn=null;
		try {
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/nuera", 
					"root", 
					"mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
