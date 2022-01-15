package io.springboot.ratingdataservice;

import io.springboot.ratingdataservice.data.DummyData;
import io.springboot.ratingdataservice.models.Rating;
import io.springboot.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating("MovieName",4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating(new DummyData().getRatings());
        return  userRating;
    }
}
