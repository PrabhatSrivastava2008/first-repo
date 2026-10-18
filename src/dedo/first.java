package dedo;
import java.sql.*;
public class first {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/college", 
			    "root", 
			    "Prabhat@2008" 
			);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
