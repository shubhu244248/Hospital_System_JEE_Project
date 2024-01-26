
<%@page import="com.db.DatabaseConnection"%>
<%@page import="com.dao.DoctorDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/components/allcss.jsp"%>
<title>Admin Dashboard</title>
</head>
<body>
	<!--  Navbar start -->
	<%@ include file="/admin_pannel/navbar.jsp"%>
	<!--  Navbar End -->

	<c:if test="${ empty adminObj }">
		<c:redirect url="admin_login.jsp"></c:redirect>
	</c:if>

	<div class="container p-5">
		<p class="text-center fs-3 text-primary">Admin Dashboard</p>
		<c:if test="${not empty errMsg}">
			<p class="fs-3 text-center text-danger">${errMsg}</p>
			<c:remove var="errMsg" scope="session" />
		</c:if>

		<c:if test="${not empty sucMsg}">
			<div class="fs-3 text-center text-success" role="alert">${sucMsg}</div>
			<c:remove var="sucMsg" scope="session" />
		</c:if>
		<%
		DoctorDAO dao = new DoctorDAO(DatabaseConnection.getConn());
		%> 
		<div class="row">
			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-primary">
						<i class="fas fa-user-md fa-3x"></i><br>
						<p class="fs-4 text-center">
							Doctor <br>
						</p>
					</div>
				</div>
			</div>



			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-primary">
						<i class="fas fa-user-circle fa-3x"></i><br>
						<p class="fs-4 text-center">
							User <br>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-primary">
						<i class="far fa-calendar-check fa-3x"></i><br>
						<p class="fs-4 text-center">
							Total Appointment <br>

						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 mt-2">
				<!--  Pop up for the Specialist add-->
				<div class="card paint-card " data-bs-toggle="modal"
					data-bs-target="#exampleModal">
					<div class="card-body text-center text-primary">
						<i class="far fa-calendar-check fa-3x"></i><br>
						<p class="fs-4 text-center">
							Specialist <br> <%=dao.countSpecialist()%>
					</div>
				</div>
			</div>

		</div>
	</div>



	<!-- Pop up Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<form action="../addSpecialist" method="post">
						<div class="form-group">
							<label>Enter Specialist Name</label> <input type="text"
								name="specName" class="form-control">
						</div>
						<div class="text-center mt-3">
							<button type="submit" class="btn btn-primary">Add</button>
						</div>

					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
