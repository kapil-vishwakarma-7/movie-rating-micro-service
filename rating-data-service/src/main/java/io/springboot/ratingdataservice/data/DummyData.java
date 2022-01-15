package io.springboot.ratingdataservice.data;

import io.springboot.ratingdataservice.models.Rating;

import java.util.Arrays;
import java.util.List;

public class DummyData {
    private List<Rating> ratings;
    public DummyData() {
        ratings = ratings = Arrays.asList(
                new Rating("t122", 5),
                new Rating("t123", 6),
                new Rating("t124", 4),
                new Rating("t125", 6),
                new Rating("t126", 7)
        );
    }
    public List<Rating> getRatings() {
        return ratings;
    }
}
