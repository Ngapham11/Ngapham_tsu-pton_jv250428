package com.ra.ss6.model.dao;

import com.ra.ss6.model.entity.Movie;
import com.ra.ss6.util.ConnectionDB;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Repository
public class MovieDaoImp implements MovieDao{
    @Override
    public List<Movie> getAllMovies() {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<Movie> movies =new ArrayList<>();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_all()}");
            ResultSet resultSet=callableStatement.executeQuery();

            while (resultSet.next()){
                Movie movie=new Movie();
               movie.setId(resultSet.getInt("id"));
               movie.setTitle(resultSet.getString("title"));
                movie.setDirector(resultSet.getString("director"));
                movie.setGenre(resultSet.getString("genre"));
                movies.add(movie);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return movies;
    }

    @Override
    public Movie getMovieById(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        Movie movie=new Movie();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call find_by_id(?)}");
            callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();
            if (resultSet.next()){
                movie.setId(resultSet.getInt("id"));
                movie.setTitle(resultSet.getString("title"));
                movie.setDirector(resultSet.getString("director"));
                movie.setGenre(resultSet.getString("genre"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return movie;
    }

    @Override
    public boolean createMovie(Movie movie) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call add_movies(?,?,?)}");
            callableStatement.setString(1,movie.getTitle());
            callableStatement.setString(2, movie.getDirector());
            callableStatement.setString(3, movie.getGenre());
            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return result;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return false;
    }

    @Override
    public boolean deleteMovie(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call delete_movie(?)}");
            callableStatement.setInt(1,id);

            callableStatement.executeUpdate();
            result=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return result;
    }
}
