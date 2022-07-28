package com.example.weather.exception;

public class WeatherNotFoundException extends RuntimeException{

    public WeatherNotFoundException() {
    }

    public WeatherNotFoundException(String message) {
        super(message);
    }
}
