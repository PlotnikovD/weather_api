package com.example.weather.service;

import com.example.weather.controller.dto.WeatherResponceDtoTemp;
import com.example.weather.entitiy.Weather;
import com.example.weather.exception.WeatherNotFoundException;
import com.example.weather.repository.WeatherRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public List<WeatherResponceDtoTemp> getListWeather(String city){
        List<Weather> weathers =  weatherRepository.findFirstByCityOrderByTimeDesc(city);
        if (weathers.isEmpty()) {
            throw new WeatherNotFoundException("Weather from city not found");
        }
        return weathers.stream().map(w -> new WeatherResponceDtoTemp(
                w.getTemperature(), w.getTime().withNano(0))).collect(Collectors.toList());
        }

        public List<Weather> getAll() {
            return weatherRepository.findAll();
        }
    }

