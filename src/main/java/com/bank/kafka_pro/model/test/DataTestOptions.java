package com.bank.kafka_pro.model.test;

import com.bank.kafka_pro.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@NoArgsConstructor
public class DataTestOptions {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
