package com.university.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entities.StudentFeedback;

public interface StudentFeedbackRepo extends JpaRepository<StudentFeedback,Integer>{

}
