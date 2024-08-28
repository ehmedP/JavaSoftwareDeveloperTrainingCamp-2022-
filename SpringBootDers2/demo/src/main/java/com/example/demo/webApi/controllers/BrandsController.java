package com.example.demo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.BrandService;
import com.example.demo.business.requests.CreateBrandRequest;
import com.example.demo.business.responses.GetAllBrandsResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController    // annotation
@RequestMapping("/api/brands")    // burada RequestMapping daxilinde verilen path bu klasin calismali oldugu path bildirir
public class BrandsController {
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    // burada GetMapping isdifadesinin menasi eger path="https://domainName.com/api/brands/getAll" olarsa eger bu zaman bu funksiyasi ise sal demekdir
    @GetMapping("/getAll")    
    public List<GetAllBrandsResponse> getAll() {
        return this.brandService.getAll();
    }

    @PostMapping("/addBrand")
    public void addBrand(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandService.addBrand(createBrandRequest);
    }

}
