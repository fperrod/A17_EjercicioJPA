package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import javax.sql.DataSource;

import util.DS;

public class Test01 {
	
	public static void main(String[] args)  throws SQLException{
		
		DataSource ds =  DS.getInstance();
		
		Connection con = ds.getConnection();
		
		Statement st = con.createStatement(); 
		
		ResultSet rs = st.executeQuery("select id_producto, producto, precio from productos");
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_producto") +
					"\t" + rs.getString("producto") +
					"\t"+ "\t" + rs.getDouble("precio"));
		
//					
//					"-" + rs.getDouble("precio")));
//			
		}
		con.close();
		
	}

}
