package com.teachableapps.popularmovies.model;

public class TrailerModel {
    private String name;
    private String site;
    private String key;
    private String url;

    public TrailerModel(String name, String site, String key) {
        this.name = name;
        this.site = site;
        this.key = key;
        this.url = "https://www.youtube.com/watch?v=" + key;
    }

    public String getName() {
        return name;
    }
    public String getSite() {
        return site;
    }
    public String getKey() {
        return key;
    }
    public String getUrl() { return url; }
}
