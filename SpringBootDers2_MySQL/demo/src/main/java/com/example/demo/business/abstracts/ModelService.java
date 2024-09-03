package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.CreateModelRequest;
import com.example.demo.business.responses.GetAllModelsResponse;

public interface ModelService {

    public List<GetAllModelsResponse> getAll();

    public void addModel(CreateModelRequest createModelRequest);

}
