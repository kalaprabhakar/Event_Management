package com.hyscaler.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyscaler.model.Events;
import com.hyscaler.model.Ticket;
import com.hyscaler.model.User;
import com.hyscaler.repo.IEventRepo;
import com.hyscaler.repo.ITicketRepo;
import com.hyscaler.repo.IUserRepo;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.razorpay.Invoice;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class UserServiceMngmImpl implements IUserService {

	@Autowired
	private IUserRepo repo;

	@Autowired
	private IEventRepo repo1;
	
	@Autowired
	private APIContext apiContext;
	
	@Autowired
	private ITicketRepo repo2;

	@Override
	public int saveUSer(User u) {

		return repo.save(u).getId();
	}

	@Override
	public User findUSer(String email) {

		return repo.findByEmail(email);
	}

	@Override
	public Events saveEvents(Events e) {
		// TODO Auto-generated method stub
		return repo1.save(e);
	}

	@Override
	public List<Events> getAllEvents() {
		
		return repo1.findAll();
	}
	
     @Override
    public Events getEventById(int id) {
    	// TODO Auto-generated method stub
    	return repo1.getById(id);
    }
     
     @Override
    public Events updateEvent(Events e) {
    	  repo1.save(e);
    	return repo1.save(e);
    }
     
     @Override
    public void deleteEvent(int id) {
    	repo1.deleteById(id);
    	
    }
     
@Override
    public long totalEvents() {
    	
	
    	return repo1.count();
    }


    @Override
	public Payment createPayment(Double total, String currency, String method, String intent, String description,
			String cancelUrl, String successUrl) throws Exception {
    	
    	
    	Amount amount = new Amount();
    	amount.setCurrency(currency);
    	total = new BigDecimal(total).setScale(2,RoundingMode.HALF_UP).doubleValue();
    	amount.setTotal(String.format("%.2f", total));
    	
    	Transaction transaction =  new Transaction();
    	transaction.setDescription(description);
    	transaction.setAmount(amount);
    	
    	List<Transaction> transactions =  new ArrayList<>();
    	transactions.add(transaction);
    	
    	Payer payer =  new Payer();
    	payer.setPaymentMethod(method.toString());
    	
    	Payment payment = new Payment();
    	payment.setIntent(intent.toString());
    	payment.setPayer(payer);
    	payment.setTransactions(transactions);
    	RedirectUrls redirectUrls =  new RedirectUrls();
    	redirectUrls.setCancelUrl(cancelUrl);
    	redirectUrls.setReturnUrl(successUrl);
    	payment.setRedirectUrls(redirectUrls);
    	
    	return payment.create(apiContext);
    	
    	
    }
    
    @Override
    public Payment executePayment(String paymentId, String payerId) throws Exception {
    	
    	Payment payment = new Payment();
    	payment.setId(paymentId);
    	PaymentExecution execution = new PaymentExecution();
    	execution.setPayerId(payerId);
    	
    	return payment.execute(apiContext, execution);
    	
    }
    
    @Override
    public void saveTicket(Ticket t) {
       
    	repo2.save(t);
    	
    	
    	
    }
    
    @Override
    public List<Ticket> getAllBookedTickets(String mailId) {
    	
    	return repo2.findByMailId(mailId);
    }
    
    @Override
    public List<Ticket> getAllTickets() {
    	
    	return repo2.findAll();
    }
    
    @Override
    public long booking() {
    	
    	return repo2.count();
    }
    
    @Override
    public List<Events> findEventsLikeOp(String like) {
    	
    	return repo1.findByEventLike(like);
    }

}
