package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.concrets.Brand;

public interface BrandRepositery extends JpaRepository<Brand, Integer> {

}
