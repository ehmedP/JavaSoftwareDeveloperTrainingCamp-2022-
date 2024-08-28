package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.brands.CreateBrandRequest;
import com.example.demo.business.requests.brands.UpdateBrandRequest;
import com.example.demo.business.responses.brandRespons.GetAllBrandsResponse;
import com.example.demo.business.responses.brandRespons.GetBrandByIdResponse;

// database ile birbasa elaqede olan deyiseni vermemek ucun request ve responselerden isdifade olunur
public interface BrandService {
    
    public List<GetAllBrandsResponse> getAll();

    public void addBrand(CreateBrandRequest createBrandRequest);

    public GetBrandByIdResponse getById(Integer id);

    public void updateBrand(UpdateBrandRequest updateBrandRequest);

    public void deleteBrand(Integer id);

}
