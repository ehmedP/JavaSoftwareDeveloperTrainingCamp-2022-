package com.example.demo.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.impl.ModelService;
import com.example.demo.dto.request.models.CreateModelRequest;
import com.example.demo.dto.response.modelRespons.GetAllModelsRespons;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping(value = "api/models")
public class ModelsController {
    
    @Autowired
    private ModelService modelService;

    @GetMapping() 
    public List<GetAllModelsRespons> getAll() {
        return this.modelService.getAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addModel(@RequestBody() @Valid() CreateModelRequest createModelRequest) {
        this.modelService.addModel(createModelRequest);
    }

}
