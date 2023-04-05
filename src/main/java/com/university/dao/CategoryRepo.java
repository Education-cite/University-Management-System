package com.university.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entities.Categories;

public interface CategoryRepo extends JpaRepository<Categories, Integer> {

}
