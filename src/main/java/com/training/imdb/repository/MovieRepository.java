package com.training.imdb.repository;

import com.training.imdb.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
    Movie findMovieByName(String name);
}
