package io.springboot.ratingdataservice.models;

public class Rating {
    private int rating;
    private String movieId;

    public Rating(String movieId, int rating) {
        this.rating = rating;
        this.movieId = movieId;
    }

    public Rating() {
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
