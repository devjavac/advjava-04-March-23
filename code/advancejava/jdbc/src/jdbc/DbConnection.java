package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			// Oracle : oracle.jdbc.driver.OracleDriver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			// Oracle URL : jdbc:oracle:thin:@localhost:1521:xe
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava04march"
							,"root","root");
			System.out.println("Connection Created Successfully...");	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
