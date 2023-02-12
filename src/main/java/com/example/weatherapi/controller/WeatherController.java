package com.example.weatherapi.controller;

import com.example.weatherapi.response.MultipleDayWeatherResponseDto;
import com.example.weatherapi.response.SingleDayWeatherResponseDto;
import com.example.weatherapi.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/api/v1/")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("currentWeather")
    // http://localhost:8080/api/v1/currentWeather?city=London
    public ResponseEntity<SingleDayWeatherResponseDto> currentWeather(@RequestParam String city) {

      return new ResponseEntity<>(weatherService.getCurrentInfo(city), HttpStatus.OK);
    }

    @GetMapping("weeklyWeather")
    // http://localhost:8080/api/v1/weeklyWeather?city=London
    public ResponseEntity<MultipleDayWeatherResponseDto> weeklyWeather(@RequestParam String city) {
        return new ResponseEntity<>(weatherService.getWeeklyInfo(city), HttpStatus.OK);
    }
    @GetMapping("monthlyWeather")
    // http://localhost:8080/api/v1/monthlyWeather?city=London
    public ResponseEntity<MultipleDayWeatherResponseDto> monthlyWeather(@RequestParam String city) throws ParseException {
        return new ResponseEntity<>(weatherService.getMonthlyInfo(city), HttpStatus.OK);
    }
//    @GetMapping("deneme")
//    // http://localhost:8080/api/v1/currentWeather?city=London
//    public ResponseEntity<SingleDayWeatherResponseDto> deneme(@RequestParam String city) {
//
//        return weatherService.deneme(city);
//    }
}
