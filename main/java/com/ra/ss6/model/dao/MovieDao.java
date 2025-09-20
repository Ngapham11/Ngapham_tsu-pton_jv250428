package com.ra.ss6.model.dao;

import com.ra.ss6.model.entity.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> getAllMovies();
    Movie getMovieById(int id);
    boolean createMovie(Movie movie);
    boolean updateMovie(Movie movie);
    boolean deleteMovie(int id);
}
