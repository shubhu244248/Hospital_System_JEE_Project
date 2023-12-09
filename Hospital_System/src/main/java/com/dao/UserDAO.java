package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAO {

	private Connection conn;

	// Constructor
	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	// User registration method
	public boolean userRegister(User u) {

		boolean flag = false;

		try {
			String query = "INSERT INTO user_details (`fullName`, `email`, `password`) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, u.getFullName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());

			int data = ps.executeUpdate();

			if (data == 1) {
				flag = true; // query execution done
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag; // if true means ohk if false something is wrong
	}

	public User login(String email, String pass) {
		User u = null;

		try {
			String query = "select * from user_details where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setFullName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}
}
