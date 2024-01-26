<%@page import="com.db.DatabaseConnection"%>
<%@page import="com.entity.Specialist"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.SpecialistDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
SpecialistDAO dao = new SpecialistDAO(DatabaseConnection.getConn());
List<Specialist> list = dao.getAllSpecialist();
for (Specialist s : list) {
s.getSpecialistName();
}
%>
</body>
</html>