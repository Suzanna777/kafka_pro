package com.bank.datageneratormicroservice.service;

import com.bank.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);

}
