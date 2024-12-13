package com.bank.kafka_pro.web.mapper;

import com.bank.kafka_pro.model.test.DataTestOptions;
import com.bank.kafka_pro.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
