package com.training.imdb.service;

import com.training.imdb.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie save(Movie movie);

    List<Movie> getAll();

    Movie getByName(String name);
}
