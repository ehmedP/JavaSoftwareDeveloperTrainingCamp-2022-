package com.example.demo.business.concrets;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.requests.UpdateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetBrandByIdResponse;
import com.example.demo.core.utilities.mapper.ModelMapperService;
import com.example.demo.dataAccess.abstracts.BrandRepositery;
import com.example.demo.entities.concrets.Brand;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BrandManager implements BrandService {
    
    @Autowired
    private BrandRepositery brandRepositery;
    @Autowired
    private ModelMapperService modelMapperService;
    
    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> allBrands = brandRepositery.findAll();
        List<GetAllBrandsResponse> allResponseBrands = allBrands.stream()
        .map(brand -> this.modelMapperService.forResponse()
        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        
        return allResponseBrands;
    }

    // yeni data elave edilmesi
    @Override
    public void addBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brandRepositery.save(brand);   // burada id databasede olmadigi ucun elave etme emeliyyati yerine yetirir, amma eger var olan id ile bir deyer gonderilerse bu zaman guncelleme emeliyyati yerine yetirilir
    }

    // id gore datanin tapilmasi
    @Override
    public GetBrandByIdResponse getById(Integer id) {
        Brand wantedBrand = this.brandRepositery.findById(id).orElseThrow();
        GetBrandByIdResponse response = this.modelMapperService.forResponse().map(wantedBrand, GetBrandByIdResponse.class);
        return response;
    }

    // id gore datanin guncellenmesi
    @Override
    public void updateBrand(UpdateBrandRequest updateBrandRequest) {
        Brand requestBrand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepositery.save(requestBrand);
    }

    //  id gore elementin databaseden silinmesi funsiyasi
    @Override
    public void deleteBrand(Integer id) {
        this.brandRepositery.deleteById(id);
    }

}
