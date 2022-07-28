package com.example.weather.repository;

import com.example.weather.entitiy.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Long> {
    List<Weather> findWeatherByCityIgnoreCase(String city);
    List<Weather> findAll();
    List<Weather> findFirstByCityOrderByTimeDesc(String city);


}
