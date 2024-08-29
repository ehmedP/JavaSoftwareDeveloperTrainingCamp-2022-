package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;

public interface BrandService {
    public List<GetAllBrandsResponse> getAll();

    public void addBrand(CreateBrandRequest createBrandRequest);
}
