package io.spring.moviecatelogservice.models;

public class CatalogItem {
    private String movieName, desc;
    private int rating;

    public CatalogItem(String movieName, String desc, int rating){
        this.movieName=movieName;
        this.desc=desc;
        this.rating=rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDesc() {
        return desc;
    }

    public int getRating() {
        return rating;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
