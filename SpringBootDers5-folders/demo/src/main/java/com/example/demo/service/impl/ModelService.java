package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dto.request.models.CreateModelRequest;
import com.example.demo.dto.response.modelRespons.GetAllModelsRespons;


public interface ModelService {
    
    public List<GetAllModelsRespons> getAll();

    public void addModel(CreateModelRequest createModelRequest);

}  
