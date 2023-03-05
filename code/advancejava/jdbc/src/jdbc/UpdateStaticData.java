package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStaticData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava04march","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE employee SET name='B' WHERE id=122");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " Rows Updated...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
