package com.example.movielog;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "watch_date", nullable = false)
    private LocalDate watchDate;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "media")
    private String media;

    @Column(name = "genre")
    private String genre;

    public int getId() {
        return id;
    }

    public LocalDate getWatchDate() {
        return watchDate;
    }

    public String getTitle() {
        return title;
    }

    public String getMedia() {
        return media;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWatchDate(LocalDate watchDate) {
        this.watchDate = watchDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}