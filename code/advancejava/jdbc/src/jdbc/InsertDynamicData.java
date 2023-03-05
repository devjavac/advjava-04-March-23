package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class InsertDynamicData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter name : ");
		String name = scan.next();
		System.out.println("Enter Salary : ");
		double salary = scan.nextDouble();
		System.out.println("Enter Date of Join : ");
		String doj = scan.next();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava04march","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee values(?,?,?,?)"); // Parameterized Query
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, salary);
			stmt.setString(4, doj);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " Rows inserted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}








