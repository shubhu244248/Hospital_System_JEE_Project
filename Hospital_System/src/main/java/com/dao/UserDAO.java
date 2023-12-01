package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

			if(data == 1) {
				flag = true; // query execution done
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;  // if true means ohk if false something is wrong
	}

}
