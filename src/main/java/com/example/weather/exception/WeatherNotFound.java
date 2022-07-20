package com.example.weather.exception;

public class WeatherNotFound extends RuntimeException{

    public WeatherNotFound() {
    }

    public WeatherNotFound(String message) {
        super(message);
    }
}
