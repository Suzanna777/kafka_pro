package com.bank.kafka_pro.config;

import com.jcabi.xml.SaxonDocument;
import com.jcabi.xml.XML;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeenConfig {

    @SneakyThrows
    @Bean
    public XML producerXml(){
        return new SaxonDocument(
                getClass().getResourceAsStream("/kafka/producer.xml").readAllBytes()
        );
    }

}
