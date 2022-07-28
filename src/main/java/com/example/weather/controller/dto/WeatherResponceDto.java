package com.example.weather.controller.dto;

import com.example.weather.entitiy.Weather;
import java.time.LocalDateTime;

public class WeatherResponceDto {
    private Long id;
    private String country;
    private String city;
    private Double temperature;
    private LocalDateTime time;


    public WeatherResponceDto(Long id, String country, String city, Double temperature, LocalDateTime time) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.time = time;
    }

    public WeatherResponceDto(Weather weather) {
        id = weather.getId();
        country = weather.getCountry();
        city = weather.getCity();
        temperature = weather.getTemperature();
        time = weather.getTime();
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public LocalDateTime getTime() {
        return time;
    }


}
