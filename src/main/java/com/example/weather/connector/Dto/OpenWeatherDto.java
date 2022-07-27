package com.example.weather.connector.Dto;

import java.time.LocalDateTime;

public class OpenWeatherDto {

    private Main main;

/*    public OpenWeatherDto(Main main, String name, Sys sys) {
    }*/

    public OpenWeatherDto() {
    }

    public OpenWeatherDto(String city, String country, Double temperature, LocalDateTime time) {

    }

    public String getName() {
        return name;
    }


    public Sys getSys() {
        return sys;
    }

    private String name;
    private Sys sys;

    public Main getMain() {
        return main;
    }

    public static class Sys {
        private String country;

        public String getCountry() {
            return country;
        }

    }

    public static class Main {
        private Double temp;

        public Double getTemp() {
            return temp;
        }

    }

}