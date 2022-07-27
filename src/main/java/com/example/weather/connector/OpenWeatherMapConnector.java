package com.example.weather.connector;

import com.example.weather.connector.Dto.OpenWeatherDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.concurrent.TimeUnit;


@Component
@EnableScheduling
public class OpenWeatherMapConnector implements WeatherConnector {
    private final RestTemplate restTemplate;

    @Value("${config.tokenKey}")
    private String key;
    private final String url = "https://api.openweathermap.org/data/2.5/weather?q=";


    public OpenWeatherMapConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
    public Double request(String city) {
        String fullUrl = url + city + "&appid=" + key + "&units=metric";
        OpenWeatherDto openWeatherDto = restTemplate.getForObject(fullUrl, OpenWeatherDto.class);
        if (openWeatherDto == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return openWeatherDto.getMain().getTemp();
    }

}






