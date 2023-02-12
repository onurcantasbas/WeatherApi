package com.example.weatherapi;

import com.example.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class WeatherApiApplication implements CommandLineRunner {

    @Autowired
    ResponseErrorHandler responseErrorHandler;
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplateBuilder().errorHandler(responseErrorHandler).build();
    }
    public static void main(String[] args) {
        SpringApplication.run(WeatherApiApplication.class, args);
    }
    @Autowired
    WeatherService weatherService;

    @Override
    public void run(String... args) throws Exception {
////        System.out.println("deneme");
////        weatherService.getMonthlyInfo("London");
//        System.out.println(weatherService.deneme("Loasdasdndon"));
    }
}
