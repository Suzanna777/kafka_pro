package com.bank.kafka_pro.web.controller;
import com.bank.kafka_pro.model.Data;
import com.bank.kafka_pro.model.test.DataTestOptions;
import com.bank.kafka_pro.service.KafkaDataService;
import com.bank.kafka_pro.service.TestDataService;
import com.bank.kafka_pro.web.dto.DataDto;
import com.bank.kafka_pro.web.dto.DataTestOptionsDto;
import com.bank.kafka_pro.web.mapper.DataMapper;
import com.bank.kafka_pro.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;
    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto){
        Data  data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }
    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto){
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
