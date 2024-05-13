<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
if (session.getAttribute("Admin_email") == null) {
	response.sendRedirect("login");
} else {
%>
<jsp:include page="includes/header.jsp" />

<jsp:include page="includes/organizerNav.jsp" />

<style>
.card:hover {
	transform: scale(1.05);
	box-shadow: 0 10px 20px rgba(0, 0, 0, .12), 0 4px 8px rgba(0, 0, 0, .06);
	transition: 0.3s ease-in-out;
	cursor: pointer;
}
</style>



<div id="content">

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">

			<div>
				<h3 class="text-info">ADMIN DASHBOARD</h3>
			</div>
			<div>
				<p>
					Welcome
					<%
				if (session.getAttribute("Admin_gender").equals("male")) {
				%>
					Mr.
					<%
				} else {
				%>
					Miss.
					<%
				}
				%>
					<span class="font-weight-bold text-info">${Admin_firstname}
						${Admin_lastname}</span>
				</p>
			</div>
		</div>
	</nav>
	

	<section class="container ">
		<div class="container">
			<div class="row align-items-center my-5">
			<h1 style="text-align: center;  color: maroon;">Booked Tickets</h1>
			</div>
				
				<div class="col-md-12 col-lg-6 col-sm-12 mb-5">
					
					

					
				</div>



				<c:choose>

					<c:when test="${!empty tickets }">
						<table class="table table-striped">
							<thead>
								<tr class="table-primary">
									<th scope="col">Name </th>
									<th scope="col">Mail Id</th>
									<th scope="col">Event Name</th>
									<th scope="col">Date</th>
									<th scope="col">Time</th>
									<th scope="col">Location</th>
									<th scope="col"> Ticket Price</th>
									<th scope="col">Payment</th>
									
								</tr>
							</thead>
							<c:forEach var="eve" items="${tickets }">
								<tbody>
									<tr class="table-warning">

										<td>${User_firstname } ${User_lastname }</td>
										<td>${eve.mailId }</td>
										<td>${eve.eventName }</td>
										<td>${eve.date }</td>
										<td>${eve.time }</td>
										<td>${eve.location }</td>
										<td>${eve.ticketPrice }</td>
										<td>${eve.payment }</td>
										
									</tr>
								</tbody>

							</c:forEach>

						</table>

					</c:when>


					<c:otherwise>

						<h1 style="color: red; text-align: center">There is no Booked Tickets 
							.</h1>

					</c:otherwise>



				</c:choose>

				





			</div>
		</div>



	</section>





	<%
	}
	%>