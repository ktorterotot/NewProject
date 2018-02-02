package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Item {

    private String title;
    private String lat;
    private String longitude;
    private String link;
    private String pubDate;
    private Condition condition;
    private List<Forecast> forecast;
    private String description;
    private Guid guid;

    public Item(){

    }

    public String getTitle() {
        return title;
    }

    public String getLat() {
        return lat;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLongitude(String longi) {
        this.longitude = longitude;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", lat='" + lat + '\'' +
                ", longi='" + longitude + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", condition=" + condition +
                ", forecast=" + forecast +
                ", description='" + description + '\'' +
                ", guid='" + guid + '\'' +
                '}';
    }
}
