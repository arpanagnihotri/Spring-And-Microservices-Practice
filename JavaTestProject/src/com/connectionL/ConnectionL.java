package com.connectionL;
import java.sql.*;

public class ConnectionL {
	static Connection con;
	public static Connection connect() {
		String url="jdbc:mysql://localhost:3306/db";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			return con;
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
	
	}
}
