package io.springboot.movieinfoservice.resources;

import io.springboot.movieinfoservice.data.DummyData;
import io.springboot.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new DummyData().getMovie(movieId);
    }
}
