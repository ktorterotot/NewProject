package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Wind {
    private String chill;
    private String direction;
    private String speed;

    public Wind(){

    }

    public String getSpeed() {
        return speed;
    }

    public String getChill() {
        return chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "chill='" + chill + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
