package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private static Connection conn;

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///hospital", "root", "admin");
			System.out.println("Connection got");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}
