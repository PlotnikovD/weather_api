package com.example.weather.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.json.JSONPropertyIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "weather")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private Double temperature;
    private LocalDateTime time;


    public Weather(Long id, String country, String city, Double temperature, LocalDateTime time) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.time = time;
    }

    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", tine='" + time + '\'' +
                '}';
    }
}
