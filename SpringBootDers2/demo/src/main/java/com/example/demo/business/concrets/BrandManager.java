package com.example.demo.business.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
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
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> allBrands = brandRepositery.findAll();
        List<GetAllBrandsResponse> allResponseBrands = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : allBrands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse(brand.getId(), brand.getName());
            allResponseBrands.add(responseItem);
        }

        return allResponseBrands;
    }

    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        brandRepositery.save(brand);
    }
}
