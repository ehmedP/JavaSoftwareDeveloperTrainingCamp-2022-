package com.example.demo.webApi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.concrets.BrandManager;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.requests.UpdateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@Data
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/brands")
public class BrandController {
    private final BrandManager brandManager;

    @GetMapping(value = "/getAll")
    @ResponseStatus(code = HttpStatus.OK)
    public List<GetAllBrandsResponse> getAll() {
        return this.brandManager.getAll();
    }

    @PostMapping(value = "/add")
    @ResponseStatus(code=HttpStatus.CREATED)
    public void addBrand(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandManager.addBrand(createBrandRequest);
    }

    @GetMapping(value = "/brand/{id}")
    public GetByIdResponse getById(@PathVariable Integer id) {
        return this.brandManager.getById(id);
    } 

    @PutMapping
    public void updateBrand(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandManager.updateBrand(updateBrandRequest);
    }

    @DeleteMapping(value = "/brand/{id}")
    public void deleteBrand(@PathVariable Integer id) {
        this.brandManager.deleteBrand(id);
    }
    
    
}
