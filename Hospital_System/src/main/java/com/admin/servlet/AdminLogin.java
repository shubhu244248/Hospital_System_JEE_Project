package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;

import com.entity.User;
 
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String email = req.getParameter("email");
			String pass = req.getParameter("password");

			HttpSession sess = req.getSession();

			// rediirect only the mail and password match
			
			if ("admin@gmail.com".equalsIgnoreCase(email) && "admin".equalsIgnoreCase(pass)) {
//				sess.setAttribute("sucMsg","User Registered");
				sess.setAttribute("adminObj", new User());
				resp.sendRedirect("admin_pannel/index.jsp");
			} else {
				sess.setAttribute("errMsg", "Invalid email & password");
				resp.sendRedirect("admin_login.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
