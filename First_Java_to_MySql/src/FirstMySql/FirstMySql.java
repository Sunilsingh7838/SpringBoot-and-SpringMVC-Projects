package FirstMySql;
import java.sql.*;
public class FirstMySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","sunil");
			
			Statement stmt = con.createStatement();
			System.out.println("Inserting record");
			String sql = "Insert into fruits value(45)";
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
