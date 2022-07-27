package com.example.weather.controller.dto;

import java.time.LocalDateTime;

public class WeatherRequestDto {

    private String country;
    private String city;
    private Double temperature;
    private LocalDateTime time;

    public WeatherRequestDto() {
    }

    public WeatherRequestDto(String country, String city, Double temperature, LocalDateTime time) {
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.time = time;
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
