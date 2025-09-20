package com.ra.ss6.controller;

import com.ra.ss6.model.entity.Movie;
import com.ra.ss6.service.Movies.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieHome {
    @Autowired
    private MovieService movieService;
@GetMapping("")
    public String movieHome(Model model){
    List<Movie> movies=movieService.getAllMovies();
    model.addAttribute("movies",movies);
    return "movie";
}@GetMapping("/add")
    public String addMovie(){
    return "addMovie";
    }
}
