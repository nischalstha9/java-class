package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertQuery {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/web";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(dburl,username,password)){
			String query = "INSERT INTO customer (customer_name,contact_name,address,city,postal_code,country) VALUES (?,?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, "javaNischal");
			stmt.setInt(2, 12345);
			stmt.setString(3, "kathmandu");
			stmt.setString(4, "Kathmandu");
			stmt.setInt(5, 123456);
			stmt.setString(6, "Nepal");
			
			int row = stmt.executeUpdate();
			if(row>0) {
				System.out.println("Data inserted Success!");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("There was SQL error!");
		}
	}
}
