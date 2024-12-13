package com.bank.kafka_pro.web.mapper;

import com.bank.kafka_pro.model.Data;
import com.bank.kafka_pro.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
