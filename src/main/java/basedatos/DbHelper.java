package basedatos;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper {
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName(DRIVER);
		
		Connection cn =	DriverManager.getConnection("jdbc:mysql://localhost/java_datos", "root","");
		
		Statement stmt = cn.createStatement();
		
		//ResultSet rs = stmt.executeQuery("Select * from persona");
		
		leer(stmt);
		
		insetar(stmt,new Integer(7),"Jose","toto",new Integer(4));
		
		leer(stmt);
		
		stmt.close();
		cn.close();
		
	}
	
	public static void leer(Statement stmt) throws SQLException{
		ResultSet rs =	stmt.executeQuery("SELECT * from persona");
		
		while(rs.next()){
			System.out.print("Nombre "+rs.getString("nombre") + " " +  rs.getString("apellido"));
			System.out.println(" Hijos "+rs.getInt("canthijos"));
		}
	}
	
	public static void insetar(Statement stmt, Integer dni, String nombre, String apellido, Integer canthijos) throws SQLException{
		String query = "INSERT INTO PERSONA VALUES (?,?,?,?)";
		
		
		
		stmt.execute("INSERT INTO PERSONA (dni,nombre,apellido,canthijos) VALUES ('"+dni.toString()+"','"+nombre+"','"+apellido+"',"+canthijos+")");
		
	}
	
	

}
