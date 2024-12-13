package com.bank.datageneratormicroservice.service;

import com.bank.datageneratormicroservice.model.Data;

public interface KafkaDataService {
    void send(Data data);

}
