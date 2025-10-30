package com.ra.ss6.service.Movies;

import com.ra.ss6.model.dao.MovieDao;
import com.ra.ss6.model.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService{
    @Autowired
    private MovieDao movieDao;
    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieDao.getMovieById(id);
    }

    @Override
    public boolean createMovie(Movie movie) {
        return movieDao.createMovie(movie);
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return movieDao.updateMovie(movie);
    }

    @Override
    public boolean deleteMovie(int id) {
        return movieDao.deleteMovie(id);
    }
}
