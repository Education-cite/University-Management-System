package com.university.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.university.entities.VehicleCondition;

public interface VehicleConditionRepo extends JpaRepository<VehicleCondition, Integer> {
	
}
