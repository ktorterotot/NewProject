package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)


public class Results {

private Channel channel;

public Results(){
}

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Result{" +
                "channel=" + channel +
                '}';
    }
}
