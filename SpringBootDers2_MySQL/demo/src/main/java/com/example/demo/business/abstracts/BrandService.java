package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.requests.UpdateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdResponse;

public interface BrandService {
    public List<GetAllBrandsResponse> getAll();

    public GetByIdResponse getById(Integer brandId);
    
    public void addBrand(CreateBrandRequest createBrandRequest);

    public void updateBrand(UpdateBrandRequest updateBrandRequest);

    public void deleteBrand(Integer id);
}
