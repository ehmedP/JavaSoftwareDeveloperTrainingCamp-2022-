package com.example.demo.entities.concretes;

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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "daily_price")
    private Double dailyPrice;

    @Column(name = "model_year")
    private Integer modelYear;

    @Column(name = "state")
    private Integer state;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
