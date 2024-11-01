package com.hyscaler.cotroller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyscaler.model.Events;
import com.hyscaler.model.Ticket;
import com.hyscaler.model.User;
import com.hyscaler.services.IUserService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import com.razorpay.Invoice;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeEventManagementController {

	@Autowired
	private IUserService service;

	public static final String CANCEL_URL = "cancel";
	public static final String SUCCESS_URL = "suscess";

	@GetMapping("/")
	public String getIndexPage() {
		return "index";
	}

	@GetMapping({ "/login", "/registration", "/contactus", "/aboutus", "/admin_home", "user_home", "organizer_home" })
	public String hometools() {
		return null;
	}

	@PostMapping("/registration")
	public String UserRegistration(@ModelAttribute("user") User u, Map<String, Object> map) {

		Integer id = service.saveUSer(u);

		return "redirect:login";

	}

	@PostMapping("/login-validation")
	public String loginUserAndAdmin(@ModelAttribute("user") User u, HttpSession session) {

		User userDetails = service.findUSer(u.getEmail());

		if (userDetails != null) {
			if (u.getPassword().equals(userDetails.getPassword())) {

				if (userDetails.getRole().equals("organizer")) {

					session.setAttribute("Admin_firstname", userDetails.getFirstName());
					session.setAttribute("Admin_lastname", userDetails.getLastName());
					session.setAttribute("Admin_email", userDetails.getEmail());
					session.setAttribute("Admin_phone", userDetails.getContactNo());
					session.setAttribute("Admin_address", userDetails.getAddress());
					session.setAttribute("Admin_gender", userDetails.getGender());
					session.setAttribute("Admin_id", userDetails.getId());
					session.setAttribute("Admin_password", userDetails.getPassword());
					session.setAttribute("Admin_role", userDetails.getRole());

					long count = service.totalEvents();

					long bookings = service.booking();

					session.setAttribute("totalEvents", count);
					session.setAttribute("bookings", bookings);

					return "organizer_home";

				} else if (userDetails.getRole().equals("user")) {

					session.setAttribute("User_firstname", userDetails.getFirstName());
					session.setAttribute("User_lastname", userDetails.getLastName());
					session.setAttribute("User_email", userDetails.getEmail());
					session.setAttribute("User_phone", userDetails.getContactNo());
					session.setAttribute("User_address", userDetails.getAddress());
					session.setAttribute("User_gender", userDetails.getGender());
					session.setAttribute("User_id", userDetails.getId());
					session.setAttribute("User_cpassword", userDetails.getConformPassword());
					session.setAttribute("User_password", userDetails.getPassword());
					session.setAttribute("User_role", userDetails.getRole());

					long count = service.totalEvents();

					long bookings = service.booking();

					
					session.setAttribute("bookings", bookings);
					session.setAttribute("totalEvents", count);

					return "user_home";

				} else {
					session.setAttribute("Admin_firstname", userDetails.getFirstName());
					session.setAttribute("Admin_lastname", userDetails.getLastName());
					session.setAttribute("Admin_email", userDetails.getEmail());
					session.setAttribute("Admin_phone", userDetails.getContactNo());
					session.setAttribute("Admin_address", userDetails.getAddress());
					session.setAttribute("Admin_gender", userDetails.getGender());
					session.setAttribute("Admin_id", userDetails.getId());
					session.setAttribute("Admin_password", userDetails.getPassword());
					session.setAttribute("Admin_role", userDetails.getRole());
					return "admin_home";

				}

			}
		}

		return "loginfail";

	}

	@GetMapping("/addevent")
	public String addingEvents() {

		return "add_event";

	}

	@PostMapping("/addevent")
	public String createEvent(@ModelAttribute("event") Events e, Map<String, Object> map, HttpSession session) {

//		System.out.println(e);

		Events eve = service.saveEvents(e);

		if (eve != null) {
			session.setAttribute("Msg", "Event Added Successfully");
		} else {
			session.setAttribute("Msg", "Something Gone Wrong");
		}

		return "redirect:addevent";
	}

	@GetMapping("/editevent")
	public String editEventsByOrganizer(@ModelAttribute("event") Events e, Map<String, Object> map) {

		List<Events> list = service.getAllEvents();

		map.put("eventDtls", list);
		return "edit_event";
	}

	@GetMapping("/edit")
	public String editEventById(@RequestParam("id") int eid, Map<String, Object> map,
			@ModelAttribute("event") Events e) {

		e = service.getEventById(eid);

		map.put("event1", e);

		return "update_event";
	}

	@PostMapping("/edit")
	public String updateEventById(@ModelAttribute("event") Events e, HttpSession session) {

		Events eve = service.updateEvent(e);

		session.setAttribute("Msg", "Event is Updated");

		return "redirect:editevent";
	}

	@GetMapping("/delete")
	public String deleteEvent(@RequestParam("id") int eid, HttpSession session) {
		String ename = service.getEventById(eid).getEventName();
		service.deleteEvent(eid);
		session.setAttribute("Msg", "Event " + ename + " Was Deleted Successfully");

		return "redirect:editevent";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.removeAttribute("Admin_firstname");
		session.removeAttribute("Admin_lastname");
		session.removeAttribute("Admin_email");
		session.removeAttribute("Admin_phone");
		session.removeAttribute("Admin_address");
		session.removeAttribute("Admin_gender");
		session.removeAttribute("Admin_id");
		session.removeAttribute("Admin_password");
		session.removeAttribute("Admin_role");

		return "redirect:login";

	}

	@GetMapping("/upcomingevents")
	public String getAllEvents(Map<String, Object> map) {

		List<Events> list = service.getAllEvents();

		map.put("allEvents", list);
		return "show_events";

	}

	@GetMapping("/bookticket")
	public String boookTickets(@ModelAttribute("ticket") Ticket t, Map<String, Object> map) {

		List<Events> e = service.getAllEvents();

		map.put("showevents", e);

		return "book_ticket";

	}

	@GetMapping("/ticketpage")
	public String ticketBookingPage(@RequestParam("id") int eid, @ModelAttribute("ticket") Ticket t,
			Map<String, Object> map) {

		Events e = service.getEventById(eid);

		map.put("info", e);

		return "ticket_page";

	}

	@PostMapping("/ticketpage")
	public String paymentPage(@ModelAttribute("event") Events ev, HttpSession session) throws RazorpayException {

		Ticket t = new Ticket();

		Events evs = service.getEventById(ev.getId());

		t.setDate(evs.getEventDate());
		t.setEventName(evs.getEventName());
		t.setLocation(evs.getEventVenue());
		t.setMailId(String.valueOf(session.getAttribute("User_email")));
		t.setPayment("success");
		t.setTicketPrice(evs.getTicketPrice());
		t.setTime(evs.getEventTime());

		service.saveTicket(t);

		session.setAttribute("Msg", "Ticket is Booked Successfully.");

		try {
			Payment payment = service.createPayment(500.00, "USD", "PAYPAL", "ORDER", "testing",
					"http://localhost:1010/Event_Management_System/" + CANCEL_URL,
					"http://localhost:1010/Event_Management_System/" + SUCCESS_URL);

			for (Links link : payment.getLinks()) {
				if (link.getRel().equals("approval_url")) {
					return "redirect:" + link.getHref();
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return "redirect:/";

	}

	@GetMapping(value = CANCEL_URL)
	public String cancelPay() {

		return "redirect:bookedticket";

	}

	public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("payerID") String payerId) {

		try {

			Payment payment = service.executePayment(paymentId, payerId);
			System.out.println(payment.toJSON());
			if (payment.getState().equals("approved")) {
				return "success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:./";
	}

	@GetMapping("/logoutuser")
	public String logoutUser(HttpSession session) {

		session.removeAttribute("User_firstname");
		session.removeAttribute("User_lastname");
		session.removeAttribute("User_email");
		session.removeAttribute("User_phone");
		session.removeAttribute("User_address");
		session.removeAttribute("User_gender");
		session.removeAttribute("User_id");
		session.removeAttribute("User_password");
		session.removeAttribute("User_role");

		return "redirect:login";

	}

	@GetMapping("/bookedticket")
	public String showBookedTickets(HttpSession session, Map<String, Object> map) {

		String mailId = (String) session.getAttribute("User_email");

		List<Ticket> list = service.getAllBookedTickets(mailId);

		map.put("tickets", list);

		return "booked_ticket";

	}

	@GetMapping("/allbookedticktes")
	public String getllTickets(Map<String, Object> map) {

		List<Ticket> list = service.getAllTickets();

		map.put("tickets", list);

		return "admin_tickets";

	}
	
	
	@PostMapping("/search")
	public String searchEvents(HttpServletRequest res , Map<String , Object> map) {
		
		String name =  res.getParameter("search");
		
		List<Events> list =  service.findEventsLikeOp(name);
		
		
		map.put("showevents", list);
		
		
		return "book_ticket";
		
	}

}
