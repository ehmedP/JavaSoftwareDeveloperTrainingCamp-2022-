package com.example.demo.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.requests.UpdateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;
import com.example.demo.business.responses.GetBrandByIdResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController    // annotation
@RequestMapping(value = "/api/brands")    // burada RequestMapping daxilinde verilen path bu klasin calismali oldugu path bildirir
public class BrandsController {
    @Autowired
    private BrandService brandService;

    // burada GetMapping isdifadesinin menasi eger path="https://domainName.com/api/brands/getAll" olarsa eger bu zaman bu funksiyasi ise sal demekdir
    @GetMapping()    
    public List<GetAllBrandsResponse> getAll() {
        return this.brandService.getAll();
    }

    @GetMapping(value = "/id/{id}")    
    public GetBrandByIdResponse getById(@PathVariable Integer id) {
        return this.brandService.getById(id);
    }

    @PutMapping()
    public void updateBrand(@RequestBody() UpdateBrandRequest updateBrandRequest) {
        this.brandService.updateBrand(updateBrandRequest);
    }

    @PostMapping()
    @ResponseStatus(code=HttpStatus.CREATED)
    public void addBrand(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandService.addBrand(createBrandRequest);
    }

    @DeleteMapping(value = "/id/{id}")
    public void deleteBrand(@PathVariable Integer id) {
        this.brandService.deleteBrand(id);
    }

}
