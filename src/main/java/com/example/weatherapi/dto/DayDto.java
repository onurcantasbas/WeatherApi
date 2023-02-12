package com.example.weatherapi.dto;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DayDto {
    private double temp;
    private String date;
}
