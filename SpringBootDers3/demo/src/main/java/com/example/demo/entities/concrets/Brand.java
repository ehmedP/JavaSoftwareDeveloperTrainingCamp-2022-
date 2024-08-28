package com.example.demo.entities.concrets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

// database cedvelin adi eslesdirilir
@Table(name = "brands")
@Data
// @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity  // entiti oldugunu gostermek ucun anatation
public class Brand {

    @Id   // primary key oldugunu gosterir
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // automatic id atir
    @Column(name = "id")   // sutunlarin adini gostermek ucun 
    private Integer id;

    @Column(name = "name")
    private String name;

}


// bunan da database-deki bir table hazirlandi