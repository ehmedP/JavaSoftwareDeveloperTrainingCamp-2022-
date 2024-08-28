package com.example.demo.dataAccess.abstracts;

import java.util.List;

import com.example.demo.entities.concrets.Brand;

public interface BrandRepositery {
    List<Brand> getAll();
}
