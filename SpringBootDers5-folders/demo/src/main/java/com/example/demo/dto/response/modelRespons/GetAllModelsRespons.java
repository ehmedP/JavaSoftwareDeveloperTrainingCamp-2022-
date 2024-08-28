package com.example.demo.dto.response.modelRespons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsRespons {
    
    private Integer id;
    private String name;
    private Integer brandId;
    private String brandName;

}
