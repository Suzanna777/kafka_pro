package com.bank.kafka_pro.service;

import com.bank.kafka_pro.model.Data;

public interface KafkaDataService {
    void send(Data data);

}
