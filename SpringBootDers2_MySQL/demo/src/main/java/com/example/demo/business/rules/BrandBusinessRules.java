package com.example.demo.business.rules;

import org.springframework.stereotype.Service;

import com.example.demo.core.utilities.exceptions.BusinessException;
import com.example.demo.dataAccess.abstracts.BrandRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Service
public class BrandBusinessRules {
    private final BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {
        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand already exists.");
        }
    }
    
}
