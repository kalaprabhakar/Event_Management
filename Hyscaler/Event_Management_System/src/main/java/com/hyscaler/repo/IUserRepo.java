package com.hyscaler.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyscaler.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {
	
	
	public User findByEmail(String emial);

}
