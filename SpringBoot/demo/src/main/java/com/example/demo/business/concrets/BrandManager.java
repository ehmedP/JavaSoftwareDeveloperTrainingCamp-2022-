package com.example.demo.business.concrets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.dataAccess.abstracts.BrandRepositery;
import com.example.demo.entities.concrets.Brand;

@Service
public class BrandManager implements BrandService {
    private BrandRepositery brandRepositery;

    public BrandManager() {    }
    @Autowired
    public BrandManager(BrandRepositery brandRepositery) {
        this.brandRepositery = brandRepositery;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepositery.getAll();
    }
}
