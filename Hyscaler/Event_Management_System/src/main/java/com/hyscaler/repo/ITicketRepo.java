package com.hyscaler.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyscaler.model.Ticket;

public interface ITicketRepo extends JpaRepository<Ticket, Integer> {
	
	public List<Ticket>  findByMailId(String mailId);

}
