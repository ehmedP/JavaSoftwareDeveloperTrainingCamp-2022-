package com.example.demo.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.util.exception.BusinessException;
import com.example.demo.repository.BrandRepositery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class BrandBusinessRules {

    @Autowired
    private BrandRepositery brandRepositery;
    
    public void checkIfBrandNameExists(String name) {

        if (this.brandRepositery.existsByName(name)) {

            throw new BusinessException("Brand name already exists.");
        }
    }

}
