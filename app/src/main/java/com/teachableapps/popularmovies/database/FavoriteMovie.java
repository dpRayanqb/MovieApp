package com.teachableapps.popularmovies.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName="FavMovies")
public class FavoriteMovie {

    @PrimaryKey
    private int id;
    private String title;
    private String releaseDate;
    private String vote;
    private String popularity;
    private String synopsis;
    private String image;
    private String backdrop;

    public FavoriteMovie(int id, String title, String releaseDate, String vote, String popularity, String synopsis, String image, String backdrop) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.vote = vote;
        this.popularity = popularity;
        this.synopsis = synopsis;
        this.image = image;
        this.backdrop = backdrop;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public String getVote() {
        return vote;
    }
    public String getPopularity() {
        return popularity;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getBackdrop() {
        return backdrop;
    }



}

