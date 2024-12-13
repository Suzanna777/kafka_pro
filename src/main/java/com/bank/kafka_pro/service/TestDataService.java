package com.bank.kafka_pro.service;

import com.bank.kafka_pro.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);

}
