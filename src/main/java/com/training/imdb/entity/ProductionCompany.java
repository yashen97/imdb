package com.training.imdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ProductionCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String companyName;
    private String country;

//    @OneToMany(mappedBy = "productionCompany")
//    private List<Movie> movieList;
}
