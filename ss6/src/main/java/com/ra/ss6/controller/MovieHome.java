package com.ra.ss6.controller;

import com.ra.ss6.model.entity.Movie;
import com.ra.ss6.service.Movies.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    @PostMapping("/add")
    public String addMovie(HttpServletRequest request){
    Movie movie=new Movie();
    movie.setTitle(request.getParameter("title"));
    movie.setDirector(request.getParameter("director"));
    movie.setGenre(request.getParameter("genre"));
    if (movieService.createMovie(movie)){
        return "redirect:/movie";
    }return "redirect:/add";
    }
    @GetMapping("/update/{id}")
    public String updateMovie(@PathVariable int id,Model model){
    Movie movie=movieService.getMovieById(id);
    model.addAttribute("movie",movie);
    return "updateMovie";
    }
    @PostMapping("/update/{id}")
    public String updateMovie(@PathVariable int id,HttpServletRequest request){
     Movie movie=new Movie();
     movie.setId(id);
     movie.setTitle(request.getParameter("title"));
     movie.setDirector(request.getParameter("director"));
     movie.setGenre(request.getParameter("genre"));
     if (movieService.updateMovie(movie)){
         return "redirect:/movie";
     }return "redirect:movie/update/{id}";
    }
    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id){
    if (movieService.deleteMovie(id)){
        return "redirect:/movie";
    }return "err";
    }
}
