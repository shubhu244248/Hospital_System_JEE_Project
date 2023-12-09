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

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String email = req.getParameter("email");
			String pass = req.getParameter("password");

			HttpSession sess = req.getSession();
			
			UserDAO dao = new UserDAO(DatabaseConnection.getConn());
			
			User user = dao.login(email, pass); // it will be check via login method to db having same mail and password 

			if (user != null) {
//				sess.setAttribute("sucMsg","User Registered");
				sess.setAttribute("userObj", user);
				resp.sendRedirect("index.jsp");
			} else {
				sess.setAttribute("errMsg", "Invalid email & password");
				resp.sendRedirect("user_login.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
