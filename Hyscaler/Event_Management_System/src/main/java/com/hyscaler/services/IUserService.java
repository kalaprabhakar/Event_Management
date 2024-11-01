package com.hyscaler.services;

import java.util.List;
import java.util.Optional;

import com.hyscaler.model.Events;
import com.hyscaler.model.Ticket;
import com.hyscaler.model.User;
import com.paypal.api.payments.Payment;

public interface IUserService {

	public int saveUSer(User u);

	public User findUSer(String email);

	public Events saveEvents(Events e);

	public List<Events> getAllEvents();

	public Events getEventById(int id);

	public Events updateEvent(Events e);

	public void deleteEvent(int id);
	
	public void saveTicket(Ticket t);
	
	public long booking();
	
	public List<Events> findEventsLikeOp(String like);
	
	public List<Ticket> getAllTickets();
	
	public List<Ticket> getAllBookedTickets(String mailId);

	public long totalEvents();

	public Payment createPayment(Double total, String currency, String method, String intent, String description,
			String cancelUrl, String successUrl) throws Exception;

	public Payment executePayment(String paymentId, String payerId) throws Exception;

}
