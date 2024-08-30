package com.example.demo.business.concrets;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.requests.UpdateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetByIdResponse;
import com.example.demo.core.utilities.mappers.ModelMapperService;
import com.example.demo.dataAccess.abstracts.BrandRepository;
import com.example.demo.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    protected final BrandRepository brandRepository;
    protected final ModelMapperService modelMapperService;
    
    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequestMapper()
            .map(createBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brandList = this.brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses = brandList.stream().map(brand->this.modelMapperService.forResponseMapper().map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        return getAllBrandsResponses;
    }

    @Override
    public GetByIdResponse getById(Integer brandId) {
        Brand brand = this.brandRepository.findById(brandId).orElseThrow();
        GetByIdResponse getByIdResponse = this.modelMapperService.forResponseMapper().map(brand, GetByIdResponse.class); 

        return getByIdResponse;
    }

    @Override
    public void updateBrand(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequestMapper().map(updateBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Integer id) {
        this.brandRepository.deleteById(id);
    }
    
}
