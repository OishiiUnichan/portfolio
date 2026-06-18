package com.example.movielog;

import java.time.LocalDate;

public class Movie {

    private int id;
    private LocalDate watchDate;
    private String title;
    private String media;
    private String genre;

    // getter
    public int getId() { return id; }
    public LocalDate getWatchDate() { return watchDate; }
    public String getTitle() { return title; }
    public String getMedia() { return media; }
    public String getGenre() { return genre; }

    // setter
    public void setId(int id) { this.id = id; }
    public void setWatchDate(LocalDate watchDate) { this.watchDate = watchDate; }
    public void setTitle(String title) { this.title = title; }
    public void setMedia(String media) { this.media = media; }
    public void setGenre(String genre) { this.genre = genre; }
}