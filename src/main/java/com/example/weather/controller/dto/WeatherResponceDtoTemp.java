package com.example.weather.controller.dto;

import java.time.LocalDateTime;

public class WeatherResponceDtoTemp {

    public WeatherResponceDtoTemp(Double temperature, LocalDateTime time) {
        this.temperature = temperature;
        this.time = time;
    }

    private Double temperature;
    private LocalDateTime time;

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
