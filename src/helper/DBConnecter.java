package helper;

import java.sql.*;




public class DBConnecter {
	Connection c = null;
	
	public void DBConnection() {}

	public Connection connDB() {
		try {
			this.c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/otomasyon?user=root&password=1234");
			return (Connection) c;		
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (Connection) c;
		}
	}





}
