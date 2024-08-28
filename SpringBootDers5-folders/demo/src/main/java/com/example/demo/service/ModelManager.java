package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.util.mapper.ModelMapperService;
import com.example.demo.dto.request.models.CreateModelRequest;
import com.example.demo.dto.response.modelRespons.GetAllModelsRespons;
import com.example.demo.model.Model;
import com.example.demo.repository.ModelRepository;
import com.example.demo.service.impl.ModelService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelManager implements ModelService {

    @Autowired
    private ModelRepository modelRepositery;
    @Autowired
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsRespons> getAll() {
        List<Model> models = modelRepositery.findAll();
        List<GetAllModelsRespons> allResponseModels = models.stream()
        .map(brand -> this.modelMapperService.forResponse()
        .map(brand, GetAllModelsRespons.class)).collect(Collectors.toList());

        return allResponseModels;
    }

    @Override
    public void addModel(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        modelRepositery.save(model);
    }
    
}
