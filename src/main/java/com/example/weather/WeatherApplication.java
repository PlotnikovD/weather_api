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



/*        String city = "moscow";
        String key = "1672fe1157c099911b4a61b5b3d57e93";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + key +
        "&units=metric";

        RestTemplate restTemplate = new RestTemplate();

        OpenWeatherDto result = restTemplate.getForObject(url, OpenWeatherDto.class);
        System.out.println(result);
    }*//*


    public static class OpenWeatherDto{
        private Main main;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        private String name;
        private Sys sys;

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public static class Sys {
            private String country;

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }
        public static class Main{
            private Double temp;

            public Double getTemp() {
                return temp;
            }

            public void setTemp(Double temp) {
                this.temp = temp;
            }
        }

    }*/