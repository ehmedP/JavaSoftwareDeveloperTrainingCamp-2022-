package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.concretes.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
    
}