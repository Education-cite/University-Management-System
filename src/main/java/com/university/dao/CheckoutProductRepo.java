package com.university.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entities.CheckoutProduct;

public interface CheckoutProductRepo extends JpaRepository<CheckoutProduct, Integer> {

}
