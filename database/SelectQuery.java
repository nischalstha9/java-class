package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectQuery {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/web";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(dburl,username,password)){
			String query = "SELECT * FROM customer";
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			
			while(res.next()) {
				String name = res.getString("customer_name");
				System.out.println("Name is "+name);
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("There was SQL error!");
		}
	}
}
