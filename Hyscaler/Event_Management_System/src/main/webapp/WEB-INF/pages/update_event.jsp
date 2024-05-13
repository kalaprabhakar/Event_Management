<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			
				<h1 style="text-align: center; color: maroon;">Edit & Update
					Event</h1>
			</div>
		
			<div class="col-md-12 col-lg-6 col-sm-12 mb-5">
				
			</div>


			


			<div class="col-md-6">
				<form:form modelAttribute="event">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Name</label> <input
							type="text" name="eventName" id="inputPassword6"
							class="form-control" aria-describedby="passwordHelpInline"
							value="${event1.eventName }" />
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Description</label>
						<input type="text" name="eventDesc" id="inputPassword6"
							class="form-control" aria-describedby="passwordHelpInline"
							value="${event1.eventDesc }" />
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Date</label>
						<input type="date" name="eventDate" id="inputPassword6"
							class="form-control" aria-describedby="passwordHelpInline"
							value="${event1.eventDate }">
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Time</label>
						<input type="time" id="inputPassword6" class="form-control" name="eventTime"
							aria-describedby="passwordHelpInline"
							value="${event1.eventTime }">
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Location</label>
						<input type="text" name="eventVenue" id="inputPassword6"
							class="form-control" aria-describedby="passwordHelpInline"
							value="${event1.eventVenue }" />
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Ticket
							Price</label> <input type="number" id="inputPassword6" name="ticketPrice"
							class="form-control" aria-describedby="passwordHelpInline "
							value="${event1.ticketPrice }">
					</div>

					<button type="submit" class="btn btn-primary">Update</button>
				</form:form>

			</div>


		</div>
</div>



</section>





<%
}
%>