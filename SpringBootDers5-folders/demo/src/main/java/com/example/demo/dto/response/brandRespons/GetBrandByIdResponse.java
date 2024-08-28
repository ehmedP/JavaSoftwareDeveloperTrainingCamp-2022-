package com.example.demo.dto.response.brandRespons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBrandByIdResponse {
    
    private Integer id;
    private String name;
    
}
