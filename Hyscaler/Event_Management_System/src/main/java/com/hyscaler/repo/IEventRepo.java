package com.hyscaler.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hyscaler.model.Events;

public interface IEventRepo extends JpaRepository<Events, Integer> {
	
	
	@Query(value="SELECT * FROM hyscaler_events  WHERE event_name LIKE %:place%" ,nativeQuery=true)
	List<Events> findByEventLike(String place);


}
