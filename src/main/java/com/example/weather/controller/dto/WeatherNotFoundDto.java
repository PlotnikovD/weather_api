package com.example.weather.controller.dto;

public class WeatherNotFoundDto {
    public String message;

    public WeatherNotFoundDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
