package com.example.weather.scheduled;

import com.example.weather.connector.OpenWeatherMapConnector;
import com.example.weather.connector.WeatherConnector;
import com.example.weather.entitiy.Weather;
import com.example.weather.repository.WeatherRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
@EnableScheduling
public class WeatherScheduler {

    private final WeatherRepository weatherRepository;
    private final WeatherConnector openWeatherMapConnector;

    public WeatherScheduler(WeatherRepository weatherRepository, WeatherConnector openWeatherMapConnector) {
        this.weatherRepository = weatherRepository;
        this.openWeatherMapConnector = openWeatherMapConnector;
    }


    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.MINUTES)
    private void saveWeatherTable() {
        Double openWeatherTemp = openWeatherMapConnector.request("москва");
        Weather weather = new Weather("RU", "москва", openWeatherTemp, LocalDateTime.now());
        weatherRepository.save(weather);

        }
    }
