<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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



<!-- Page Content  -->
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
	<c:if test="${not empty Msg }">
						<div  style="background-color: lime; ">
							<h3 style="color: white; text-align: center;">${Msg }</h3>
						</div>
						<c:remove var="Msg" scope="session" />

					</c:if>

	<section class="container ">
		<div class="container">
			<div class="row align-items-center my-5">
				<!-- For Demo Purpose -->
				<div class="col-md-12 col-lg-6 col-sm-12 mb-5">
					<!-- <img src="assets/picture/icons/thumbs-up.png" alt="" class="img-fluid mb-3 d-none d-md-block"> -->
					<h1>Create Event</h1>
					<p class="font-italic text-muted mb-0">Fill out the Information
						provided here to create Event</p>
					
				</div>

				<!-- Registeration Form -->
				<div class="col-md-12 col-lg-6 col-sm-12 mt-3">
					<form modelAttribute="event" method="POST">



						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
						
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-flag text-muted"></i>
								</span>
							</div>
							<input id="name" type="text" name="eventName"
								placeholder="Event Name"
								class="form-control bg-white border-left-0 border-md" required>
						</div>

						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-info text-muted"></i>
								</span>
							</div>
							<input id="desc" type="text" name="eventDesc"
								placeholder="Event Description"
								class="form-control bg-white border-left-0 border-md" required>
						</div>

						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-calendar text-muted"></i>
								</span>
							</div>
							<input id="date" type="date" name="eventDate" placeholder="Event Date"
								class="form-control bg-white border-left-0 border-md" required>
						</div>

						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-watch text-muted"></i>
								</span>
							</div>
							<input id="time" type="time" name="eventTime" placeholder="Event Time"
								class="form-control bg-white border-left-0 border-md" required>
						</div>


						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-location text-muted"></i>
								</span>
							</div>
							<input id="venue" type="text" name="eventVenue"
								placeholder="Event Venue"
								class="form-control bg-white border-left-0 border-md" required>
						</div>

						<!-- Create Event -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
							
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-dollar-sign text-muted"></i>
								</span>
							</div>
							<input id="price" type="number" name="ticketPrice"
								placeholder="Ticket Price"
								class="form-control bg-white border-left-0 border-md" required>
						</div>


						<!-- Submit Button -->
						<div class="form-group col-lg-12 mx-auto mb-0">
							<button type="submit" class="btn btn-primary btn-block py-2"
								name="adduser">
								<span class="font-weight-bold">Add Event</span>
							</button>
						</div>

					</form>
				</div>
			</div>
		</div>



	</section>





	<%
	}
	%>