package io.springboot.movieinfoservice.data;

import io.springboot.movieinfoservice.models.Movie;

import java.util.Arrays;
import java.util.List;

public class DummyData {
    private List<Movie> movies;
    public DummyData() {
        movies = Arrays.asList(
                new Movie("t122", "Transformer Part - 1"),
                new Movie("t123", "Transformer Part - 2"),
                new Movie("t124", "Transformer Part - 3"),
                new Movie("t125", "Transformer Part - 4"),
                new Movie("t126", "Transformer Part - 5")
        );
    }
    public Movie getMovie(String movieId) {
        for(int i=0; i<movies.size(); i++) {
            if (movies.get(i).getMovieId() == movieId){
                return movies.get(i);
            }
        }
        return new Movie("Null", "No Name");
    }
}
