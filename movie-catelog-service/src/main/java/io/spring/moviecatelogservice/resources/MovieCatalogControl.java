package io.spring.moviecatelogservice.resources;

import io.spring.moviecatelogservice.models.CatalogItem;
import io.spring.moviecatelogservice.models.Movie;
import io.spring.moviecatelogservice.models.Rating;
import io.spring.moviecatelogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogControl {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getItem(@PathVariable("userId") String userId) {
        UserRating userRating = restTemplate.getForObject("http://rating-data-service/rating/users/"+userId, UserRating.class);
        return userRating.getRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getMovieName(), "Robotics Movie", rating.getRating());
        }).collect(Collectors.toList());
    }
}
