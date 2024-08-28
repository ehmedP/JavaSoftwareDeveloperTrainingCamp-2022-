package com.example.demo.business.concrets;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ModelService;
import com.example.demo.business.requests.models.CreateModelRequest;
import com.example.demo.business.responses.modelRespons.GetAllModelsRespons;
import com.example.demo.core.utilities.mapper.ModelMapperService;
import com.example.demo.dataAccess.abstracts.ModelRepository;
import com.example.demo.entities.concrets.Model;

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
