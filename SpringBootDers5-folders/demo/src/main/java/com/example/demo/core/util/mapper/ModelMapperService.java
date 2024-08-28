package com.example.demo.core.util.mapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    
    ModelMapper forResponse();
    ModelMapper forRequest();
}
