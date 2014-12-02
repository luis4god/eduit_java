package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilDB {
	
	private static Connection CONEXION_MYSQL = null;
	
	public static Connection getConexionMysql() throws ClassNotFoundException, SQLException{
		if(CONEXION_MYSQL == null){
			Class.forName("com.mysql.jdbc.Driver");
			CONEXION_MYSQL = DriverManager.getConnection("jdbc:mysql://localhost/java_datos", "root","");
		}
		return CONEXION_MYSQL;
	}

}
