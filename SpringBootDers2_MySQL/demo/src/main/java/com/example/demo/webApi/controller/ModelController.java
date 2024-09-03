package com.example.demo.webApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ModelService;
import com.example.demo.business.requests.CreateModelRequest;
import com.example.demo.business.responses.GetAllModelsResponse;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Data
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/models")
public class ModelController {
    private final ModelService modelService;
    
    @GetMapping(value = "/getAll")
    public List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addModel(@RequestBody @Valid() CreateModelRequest createModelRequest) {
        modelService.addModel(createModelRequest);
    }
    
}
