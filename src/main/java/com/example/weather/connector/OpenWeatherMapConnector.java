package com.example.weather.connector;

import com.example.weather.connector.Dto.OpenWeatherDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;


@Component
public class OpenWeatherMapConnector implements WeatherConnector {
    private final RestTemplate restTemplate;
    @Value("${config.tokenKey}")
    private String key;
    @Value("${config.urlOpenWeather}")
    private String url;

    public OpenWeatherMapConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Double request(String city) {
        String fullUrl = url + city + "&appid=" + key + "&units=metric&lang=en";
        OpenWeatherDto openWeatherDto = restTemplate.getForObject(fullUrl, OpenWeatherDto.class);
        if (openWeatherDto == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return openWeatherDto.getMain().getTemp();
    }
}






