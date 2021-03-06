package com.training.imdb.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "MOVIE")
@Entity
public class Movie{
    @Id
    @Column(name="ID", unique = true, nullable = false)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    private String id;

    private String imdbNo;
    private String name;
    private Date releaseDate;

    @OneToMany(targetEntity = Award.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "MOVIE_FK",referencedColumnName ="id")
    private List<Award> awardList;

    @ManyToOne
    @JoinColumn(name = "PCID",referencedColumnName = "id")
    private ProductionCompany productionCompany;


}
