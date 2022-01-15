package io.springboot.movieinfoservice.models;

public class Movie {
    private String movieName, movieId;

    public Movie(String movieId, String movieName) {
        this.movieName = movieName;
        this.movieId = movieId;
    }

    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
