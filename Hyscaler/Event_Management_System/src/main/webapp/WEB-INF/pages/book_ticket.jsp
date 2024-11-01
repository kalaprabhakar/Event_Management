<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
if (session.getAttribute("User_email") == null) {
	response.sendRedirect("login");
} else {
%>
<jsp:include page="includes/header.jsp" />

<jsp:include page="includes/userNav.jsp" />

<style>
.card:hover {
	transform: scale(1.05);
	box-shadow: 0 10px 20px rgba(0, 0, 0, .12), 0 4px 8px rgba(0, 0, 0, .06);
	transition: 0.3s ease-in-out;
	cursor: pointer;
}
</style>



<!-- Page Content  -->
<div id="content">

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">

			<div>
				<h3 class="text-info">USER DASHBOARD</h3>
			</div>
			<div>
				<p>
					Welcome
					<%
				if (session.getAttribute("User_gender").equals("male")) {
				%>
					Mr.
					<%
				} else {
				%>
					Miss.
					<%
				}
				%>
					<span class="font-weight-bold text-info">${User_firstname}
						${User_lastname}</span>
				</p>
			</div>
		</div>
	</nav>
	<c:if test="${not empty Msg }">
						<div  style="background-color: lime; ">
							<h3 style="color: white-space; text-align: center;">${Msg }</h3>
						</div>
						<c:remove var="Msg" scope="session" />

					</c:if>

	<section class="container ">
		<div class="container">
			<div class="row align-items-center my-5">
			<h1 style="text-align: center;  color: maroon;">Book  Events</h1>
			</div>
				
				<div class="col-md-12 col-lg-6 col-sm-12 mb-5">
					
					

					
				</div>



				<c:choose>

					<c:when test="${!empty showevents }">
						<table class="table table-striped">
							<thead>
								<tr class="table-primary">
									<th scope="col">Name</th>
									<th scope="col">Description</th>
									<th scope="col">Date</th>
									<th scope="col">Time</th>
									<th scope="col">Location</th>
									<th scope="col">Price</th>
									<th scope="col"></th>
									
								</tr>
							</thead>
							<c:forEach var="eve" items="${showevents }">
								<tbody>
									<tr class="table-warning">

										<td>${eve.eventName }</td>
										<td>${eve.eventDesc }</td>
										<td>${eve.eventDate }</td>
										<td>${eve.eventTime }</td>
										<td>${eve.eventVenue }</td>
										<td>${eve.ticketPrice }</td>
										<td><a href="ticketpage?id=${eve.id }"><button type="button" class="btn btn-success">Book Ticket</button></a></td>
										
									</tr>
								</tbody>

							</c:forEach>

						</table>

					</c:when>


					<c:otherwise>

						<h1 style="color: red; text-align: center">There is no Events
							Scheduled.</h1>

					</c:otherwise>



				</c:choose>

				>





			</div>
		</div>



	</section>





	<%
	}
	%>