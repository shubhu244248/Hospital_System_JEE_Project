package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SpecialistDAO;
import com.db.DatabaseConnection;

@WebServlet("/addSpecialist")
public class AddSpecialist extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String specName = req.getParameter("specialist");

		SpecialistDAO dao = new SpecialistDAO(DatabaseConnection.getConn());

		dao.addSpecialist(specName);

		boolean flag = dao.addSpecialist(specName);

		HttpSession session = req.getSession();

		if (flag) {
			session.setAttribute("sucMsg", "Specialist Added");
			resp.sendRedirect("admin_pannel/index.jsp");
		} else {
			session.setAttribute("errMsg", "Something went wrong on server");
			resp.sendRedirect("admin_pannel/index.jsp");
		}
	}
}
