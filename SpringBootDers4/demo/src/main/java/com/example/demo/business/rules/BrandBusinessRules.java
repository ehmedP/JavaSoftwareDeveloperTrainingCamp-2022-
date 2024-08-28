package com.example.demo.business.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.utilities.exceptions.BusinessException;
import com.example.demo.dataAccess.abstracts.BrandRepositery;

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
