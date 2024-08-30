package com.example.demo.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {

    protected ModelMapper modelMapper;

    @Override
    public ModelMapper forResponseMapper() {
        this.modelMapper.getConfiguration()
            .setAmbiguityIgnored(true)
            .setMatchingStrategy(MatchingStrategies.LOOSE);

        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequestMapper() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.STANDARD);

        return this.modelMapper;
    }
    
}
