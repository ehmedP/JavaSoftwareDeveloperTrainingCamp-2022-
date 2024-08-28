package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.models.CreateModelRequest;
import com.example.demo.business.responses.modelRespons.GetAllModelsRespons;

public interface ModelService {
    
    public List<GetAllModelsRespons> getAll();

    public void addModel(CreateModelRequest createModelRequest);

}  
