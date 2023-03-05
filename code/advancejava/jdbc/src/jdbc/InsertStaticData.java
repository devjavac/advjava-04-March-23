package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava04march","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee values(122, 'A', 77889.9,'14/01/2023')");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " Rows inserted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
