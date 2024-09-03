package com.example.demo.business.concrets;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ModelService;
import com.example.demo.business.requests.CreateModelRequest;
import com.example.demo.business.responses.GetAllModelsResponse;
import com.example.demo.core.utilities.mappers.ModelMapperService;
import com.example.demo.dataAccess.abstracts.ModelRepository;
import com.example.demo.entities.concretes.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class ModelManager implements ModelService {
    private final ModelRepository modelRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> modelList = modelRepository.findAll();
        List<GetAllModelsResponse> getAllModelsResponse = 
            modelList.stream().map(model -> this.modelMapperService.forResponseMapper().map(model, GetAllModelsResponse.class)).toList();

        return getAllModelsResponse;
    }

    @Override
    public void addModel(CreateModelRequest createModelRequest) {
        Model model = modelMapperService.forRequestMapper().map(createModelRequest, Model.class);

        modelRepository.save(model);
    }
}
