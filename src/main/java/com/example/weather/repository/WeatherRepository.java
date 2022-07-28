package com.example.weather.repository;

import com.example.weather.entitiy.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Long> {
    List<Weather> findAll();
    List<Weather> findFirstByCityOrderByTimeDesc(String city);


}
