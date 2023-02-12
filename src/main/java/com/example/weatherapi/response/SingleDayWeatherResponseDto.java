package com.example.weatherapi.response;

import com.example.weatherapi.dto.DayDto;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class SingleDayWeatherResponseDto {
   public DayDto dayDto;
}
