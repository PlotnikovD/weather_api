package com.example.weather.controller;

import com.example.weather.connector.Dto.OpenWeatherDto;
import com.example.weather.controller.dto.WeatherResponceDto;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class WeatherController {
    @Autowired
    RestTemplate restTemplate;

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public List<OpenWeatherDto> getTemp(@PathVariable String city){
        return  weatherService.getListWeather(city);
    }

    @GetMapping("/weathers")
    public List<WeatherResponceDto> getAll() {
        return weatherService.getAll().stream().map(WeatherResponceDto::new).collect(Collectors.toList());
    }
}


