package com.example.weatherapi.service;


import com.example.weatherapi.dto.DayDto;
import com.example.weatherapi.pojo.Forecastday;
import com.example.weatherapi.pojo.WeatherPojo;
import com.example.weatherapi.response.MultipleDayWeatherResponseDto;
import com.example.weatherapi.response.SingleDayWeatherResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private String appKey = "0d900bf374624e5eae2202112231102";
    public WeatherService(RestTemplate restTemplate ) {

        this.restTemplate = restTemplate;

    }

    public SingleDayWeatherResponseDto getCurrentInfo(String city) {
            String url = "http://api.weatherapi.com/v1/current.json?key=" + appKey + "&q=" + city + "&aqi=no";
            WeatherPojo weatherPojo = restTemplate.getForObject(url, WeatherPojo.class);
            DayDto dayDtoHolder = DayDto.builder()
                    .date(weatherPojo.getLocation().getLocaltime())
                    .temp(weatherPojo.getCurrent().getTempC())
                    .build();
            return SingleDayWeatherResponseDto.builder().dayDto(dayDtoHolder).build();
    }

    public MultipleDayWeatherResponseDto getForecastInfo(String city,int days) {
        String url = "http://api.weatherapi.com/v1/forecast.json?key="+appKey+"&q="+city+"&days="+days+"&aqi=no&alerts=no";
        WeatherPojo weatherPojo = restTemplate.getForObject(url,WeatherPojo.class);
        List<DayDto> dayDtoList = new ArrayList<>();
        for (Forecastday forecastday:weatherPojo.getForecast().getForecastday()
             ) {
            dayDtoList.add(
                    DayDto.builder()
                            .date(forecastday.getDate())
                            .temp(forecastday.getDay().getAvgtempC())
                            .build()
            );
        }
        return MultipleDayWeatherResponseDto.builder().days(dayDtoList).build();
    }
    public MultipleDayWeatherResponseDto getWeeklyInfo(String city) {
        return getForecastInfo(city,7);
    }
    public MultipleDayWeatherResponseDto getMonthlyInfo(String city) throws ParseException {
        MultipleDayWeatherResponseDto multipleDayWeatherResponseDto = getForecastInfo(city,14);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        for(int i=0;i<16;i++){
            String lastDate = multipleDayWeatherResponseDto.getDays().get(multipleDayWeatherResponseDto.getDays().size()-1).getDate();
            Date lastDateHolder = sf.parse(lastDate);
            c.setTime(lastDateHolder);
            c.add(Calendar.DATE, 1);
            Date newLastDate = c.getTime();
            String lastDateHolderSimple = sf.format(newLastDate);
            String url = "http://api.weatherapi.com/v1/future.json?key="+appKey+"&q="+city+"&dt="+lastDateHolderSimple;
            WeatherPojo weatherPojo = restTemplate.getForObject(url,WeatherPojo.class);
            multipleDayWeatherResponseDto.getDays().add(
                    DayDto.builder()
                            .temp(weatherPojo.getForecast().getForecastday().get(0).getDay().getAvgtempC())
                            .date(weatherPojo.getForecast().getForecastday().get(0).getDate())
                            .build()
            );
        }
        System.out.println(multipleDayWeatherResponseDto.getDays());
    return multipleDayWeatherResponseDto;
    }

//    public ResponseEntity<SingleDayWeatherResponseDto> deneme(String city) {
//        String url = "http://api.weatherapi.com/v1/current.json?key=" + appKey + "&q=" + city + "&aqi=no";
//        ResponseEntity<WeatherPojo> weatherPojo = restTemplate.getForEntity(url, WeatherPojo.class);
//        DayDto dayDtoHolder = DayDto.builder()
//                .date(weatherPojo.getBody().getLocation().getLocaltime())
//                .temp(weatherPojo.getBody().getCurrent().getTempC())
//                .build();
//        System.out.println(weatherPojo.getStatusCode());
//        return new ResponseEntity<>(SingleDayWeatherResponseDto.builder().dayDto(dayDtoHolder).build(),weatherPojo.getStatusCode());
//    }


}
