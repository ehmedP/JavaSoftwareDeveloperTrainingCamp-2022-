package com.example.demo.entities.concrets;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity  
public class Brand {

    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id") 
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;

}


