package util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DS {

	//patron de diseño Singleton
	private static DataSource ds;
	
	private DS () {} //SOLO QUIERO UN OBJETO POR ESO ESTA LINEAA
	
	public static DataSource getInstance() {
		if (ds == null) { // si es la primera vez que me llaman
			BasicDataSource bds = new BasicDataSource();
			bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			bds.setUrl("jdbc:mysql://localhost:3306/04_tienda");
			bds.setUsername("paco");
			bds.setPassword("paco");
			ds = bds;
		} //toda esta informacion se guarda en fichero externo properties
		return ds;
	}

}
