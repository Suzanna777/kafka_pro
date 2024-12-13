package com.bank.kafka_pro.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DataDto {
    private long sensorId;
    private LocalDateTime timestamp;

    private double measurement;

}
