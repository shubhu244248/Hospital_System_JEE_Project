package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.db.DatabaseConnection;
import com.entity.User;


@WebServlet("/user_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String fullName = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");

			User u =new User (fullName,email,password);

			UserDAO dao = new UserDAO(DatabaseConnection.getConn())	; // calling getConn method using implemeting the method of UserDAO.java constructor that DatabaseConnection.java
			
			HttpSession sess = req.getSession(); // for the session registration query 
			
			boolean flag = dao.userRegister(u); // put data to the userRegister method and store it into the UserDAO in Database

			if(flag) {
				System.out.println("Data Insert");
				sess.setAttribute("sucMsg","User Registered");
				resp.sendRedirect("sign_up.jsp");
			} else {
				System.out.println("Something wrong");
				sess.setAttribute("errMsg","User Not Registered Sothing is wrong on Server");
				resp.sendRedirect("sign_up.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
