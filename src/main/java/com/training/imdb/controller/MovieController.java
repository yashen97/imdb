package com.training.imdb.controller;

import com.training.imdb.entity.Movie;
import com.training.imdb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/post")
    public Movie save(@RequestBody Movie movie){
        Movie response=movieService.save(movie);
        return response;
    }

    @GetMapping("/get")
    public List<Movie> getAll(){
        List<Movie> response=movieService.getAll();
        return response;
    }

    @GetMapping("{name}")
    public Movie getByName(@PathVariable String name){
        Movie response=movieService.getByName(name);
        return response;
    }
}
