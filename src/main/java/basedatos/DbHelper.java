package basedatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		
		Connection cn =	UtilDB.getConexionMysql();
		
		Statement stmt = cn.createStatement();
		
		PreparedStatement prStmt = cn.prepareStatement("select * from persona where nombre = ? ");
		
		prStmt.setString(1, "Jose");
		
		//ResultSet rs = stmt.executeQuery("Select * from persona");
		
		
		//leer(stmt);
		
		insetar(stmt,new Integer(4),"Ernesto","Guevara",new Integer(7));
		
		leerPrepareStatement(prStmt);
		//leer(stmt);
		
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
	
	public static void leerPrepareStatement(PreparedStatement prStmt) throws SQLException{
		ResultSet res = prStmt.executeQuery();
		
		while(res.next()){
			System.out.print("Nombre "+res.getString("nombre") + " " +  res.getString("apellido"));
			System.out.println(" Hijos "+res.getInt("canthijos"));
		}
		
	}
	
	

}
