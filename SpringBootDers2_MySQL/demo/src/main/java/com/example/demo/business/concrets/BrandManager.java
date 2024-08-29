package com.example.demo.business.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.dataAccess.abstracts.BrandRepository;
import com.example.demo.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brandList = brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses = new ArrayList<GetAllBrandsResponse>();
        
        for (Brand brand : brandList) {
            GetAllBrandsResponse getAllBrandsResponse = new GetAllBrandsResponse(brand.getId(), brand.getName());

            getAllBrandsResponses.add(getAllBrandsResponse);
        }
        return getAllBrandsResponses;
    }
    
}
