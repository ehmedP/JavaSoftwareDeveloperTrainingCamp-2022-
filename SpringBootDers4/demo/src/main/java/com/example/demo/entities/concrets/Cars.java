package com.example.demo.entities.concrets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cars")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cars {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "dailyPrice")
    private Double dailyPrice;

    @Column(name = "modelYear")
    private Integer modelYear;

    @Column(name = "state")
    private Integer state;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
