package com.example.weatherapi.response;


import com.example.weatherapi.dto.DayDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MultipleDayWeatherResponseDto {
    public List<DayDto> days;
}
