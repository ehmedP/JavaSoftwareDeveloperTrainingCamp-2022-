package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Brand;

@Repository
public interface BrandRepositery extends JpaRepository<Brand, Integer> {

    boolean existsByName(String name);
    
}
