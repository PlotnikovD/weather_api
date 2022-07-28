package com.example.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);

    }
}












// TEST CONNECTION

//{"coord":{"lon":37.6156,"lat":55.7522},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
// "base":"stations","main":{"temp":17.09,"feels_like":17.28,"temp_min":14.75,
// "temp_max":17.29,"pressure":1004,"humidity":93,"sea_level":1004,"grnd_level":987},
// "visibility":10000,"wind":{"speed":3.29,"deg":76,"gust":5.6},"rain":{"1h":0.31},"clouds":{"all":100},
// "dt":1658386948,"sys":{"type":2,"id":47754,"country":"RU","sunrise":1658366092,"sunset":1658426197},
// "timezone":10800,"id":524901,"name":"Moscow","cod":200}

