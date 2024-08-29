package com.example.demo.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.concrets.BrandManager;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/brands")
public class BrandController {
    private final BrandManager brandManager;

    @GetMapping(value = "/getAll")
    public List<GetAllBrandsResponse> getAll() {
        return this.brandManager.getAll();
    }

    @PostMapping(value = "/add")
    public void addBrand(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandManager.addBrand(createBrandRequest);
    }
    
    
}
