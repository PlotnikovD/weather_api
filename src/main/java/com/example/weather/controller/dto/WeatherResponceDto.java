package com.example.weather.controller.dto;

import com.example.weather.entitiy.Weather;
import java.time.LocalDateTime;

public class WeatherResponceDto {
    private Long id;
    private String country;
    private String city;
    private Double temperature;
    private LocalDateTime time;

/*    public WeatherResponceDto(Long id, String country, String city, Double temperature, LocalDateTime time) {
        this.temperature = temperature;
        this.time = time;
    }*/


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

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
