package com.example.demo.dataAccess.concrets;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.dataAccess.abstracts.BrandRepositery;
import com.example.demo.entities.concrets.Brand;

@Repository
public class InMemoryBrandsRepositery implements BrandRepositery {

    List<Brand> brands;

    public InMemoryBrandsRepositery() {
        this.brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Volvo"));
        brands.add(new Brand(5, "Toyota"));
    }
    
    @Override
    public List<Brand> getAll() {
        return this.brands;
    }
}
