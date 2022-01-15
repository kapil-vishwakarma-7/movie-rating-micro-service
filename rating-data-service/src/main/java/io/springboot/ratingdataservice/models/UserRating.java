package io.springboot.ratingdataservice.models;

import java.util.List;

public class UserRating {
    private List<Rating> ratings;

    public UserRating(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public UserRating() {
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
