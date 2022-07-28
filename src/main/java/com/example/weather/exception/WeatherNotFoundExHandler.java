package com.example.weather.exception;

import com.example.weather.controller.dto.WeatherNotFoundDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class WeatherNotFoundExHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(WeatherNotFoundException.class)
    public ResponseEntity<Object> handleConflict(WeatherNotFoundException ex) {
        return new ResponseEntity<>(new WeatherNotFoundDto(ex.getLocalizedMessage()), HttpStatus.NOT_FOUND);
    }
}
