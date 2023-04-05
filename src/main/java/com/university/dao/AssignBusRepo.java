package com.university.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entities.AsignBusRecord;

public interface AssignBusRepo extends JpaRepository<AsignBusRecord, Integer> {
	
	

}
