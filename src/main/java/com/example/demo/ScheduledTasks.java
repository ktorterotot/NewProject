package com.example.demo;


import java.text.SimpleDateFormat;
import java.util.Date;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 300000)
    public void repeatEveryFive() {
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(
                "https://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"nome, ak\")&format=json&env=store://datatables.org/alltableswithkeys", Weather.class);
        log.info(weather.toString());
    }
}
