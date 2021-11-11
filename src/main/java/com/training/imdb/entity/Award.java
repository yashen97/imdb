package com.training.imdb.entity;

import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Award{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 50,nullable = false)
    private String name;
    private String screenType;

}
