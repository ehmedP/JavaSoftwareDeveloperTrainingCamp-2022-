package com.example.demo.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forResponseMapper();

    ModelMapper forRequestMapper();
    
}
