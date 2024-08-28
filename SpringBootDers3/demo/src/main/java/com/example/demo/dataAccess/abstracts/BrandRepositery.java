package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.concrets.Brand;

@Repository
public interface BrandRepositery extends JpaRepository<Brand, Integer> {

}
