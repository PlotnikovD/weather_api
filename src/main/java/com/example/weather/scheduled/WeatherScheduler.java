package com.example.weather.scheduled;

import com.example.weather.connector.WeatherConnector;
import com.example.weather.entitiy.Weather;
import com.example.weather.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@EnableScheduling
public class WeatherScheduler {

    private final WeatherRepository weatherRepository;
    private final WeatherConnector openWeatherMapConnector;
    @Value("${config.cities}")
    private List<String> cities;

    public WeatherScheduler(WeatherRepository weatherRepository, WeatherConnector openWeatherMapConnector) {
        this.weatherRepository = weatherRepository;
        this.openWeatherMapConnector = openWeatherMapConnector;
    }

    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
    private void saveWeatherTable() {
        for(String city: cities) {
            Double openWeatherTemp = openWeatherMapConnector.request(city);
            Weather weather = new Weather("RU", city, openWeatherTemp, LocalDateTime.now());
            weatherRepository.save(weather);
        }
        }
    }
