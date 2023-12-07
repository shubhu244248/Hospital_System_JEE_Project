package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adminLogout")
public class AdminLogout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		sess.removeAttribute("adminObj");
		sess.setAttribute("sucMsg", "Admin Logout Succesfully");
		resp.sendRedirect("admin_login.jsp");
	}
}
