package com.example.springworkbook.models;


public class Serial {

    private String Title;

    private String Episode;

    private float Rating;

    public Serial(String title, String episode, float rating) {
        Title = title;
        Episode = episode;
        Rating = rating;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEpisode() {
        return Episode;
    }

    public void setEpisode(String episode) {
        Episode = episode;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }
}
