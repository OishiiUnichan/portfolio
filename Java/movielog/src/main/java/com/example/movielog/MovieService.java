package com.example.movielog;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    public void delete(int id) {
        movieRepository.deleteById(id);
    }
}
