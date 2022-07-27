package com.example.weather.service;

import com.example.weather.connector.Dto.OpenWeatherDto;
import com.example.weather.entitiy.Weather;
import com.example.weather.exception.WeatherNotFound;
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

    public List<OpenWeatherDto> getListWeather(String city){
        List<Weather> weathers =  weatherRepository.findWeatherByCityIgnoreCase(city);
        if (weathers.isEmpty()) {
            throw new WeatherNotFound("Weather from city not found");
        }
        return weathers.stream().map(w -> new OpenWeatherDto(w.getCity(), w.getCountry(),
                w.getTemperature(), w.getTime())).collect(Collectors.toList());
        }
    }

