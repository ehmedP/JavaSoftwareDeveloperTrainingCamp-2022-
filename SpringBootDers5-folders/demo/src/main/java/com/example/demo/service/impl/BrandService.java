package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dto.request.brands.CreateBrandRequest;
import com.example.demo.dto.request.brands.UpdateBrandRequest;
import com.example.demo.dto.response.brandRespons.GetAllBrandsResponse;
import com.example.demo.dto.response.brandRespons.GetBrandByIdResponse;

// database ile birbasa elaqede olan deyiseni vermemek ucun request ve responselerden isdifade olunur
public interface BrandService {
    
    public List<GetAllBrandsResponse> getAll();

    public void addBrand(CreateBrandRequest createBrandRequest);

    public GetBrandByIdResponse getById(Integer id);

    public void updateBrand(UpdateBrandRequest updateBrandRequest);

    public void deleteBrand(Integer id);

}
